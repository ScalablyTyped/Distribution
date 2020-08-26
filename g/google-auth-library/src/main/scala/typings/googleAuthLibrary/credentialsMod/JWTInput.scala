package typings.googleAuthLibrary.credentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JWTInput extends js.Object {
  var client_email: js.UndefOr[String] = js.native
  var client_id: js.UndefOr[String] = js.native
  var client_secret: js.UndefOr[String] = js.native
  var private_key: js.UndefOr[String] = js.native
  var private_key_id: js.UndefOr[String] = js.native
  var project_id: js.UndefOr[String] = js.native
  var quota_project_id: js.UndefOr[String] = js.native
  var refresh_token: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object JWTInput {
  @scala.inline
  def apply(): JWTInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JWTInput]
  }
  @scala.inline
  implicit class JWTInputOps[Self <: JWTInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClient_email(value: String): Self = this.set("client_email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient_email: Self = this.set("client_email", js.undefined)
    @scala.inline
    def setClient_id(value: String): Self = this.set("client_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient_id: Self = this.set("client_id", js.undefined)
    @scala.inline
    def setClient_secret(value: String): Self = this.set("client_secret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient_secret: Self = this.set("client_secret", js.undefined)
    @scala.inline
    def setPrivate_key(value: String): Self = this.set("private_key", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivate_key: Self = this.set("private_key", js.undefined)
    @scala.inline
    def setPrivate_key_id(value: String): Self = this.set("private_key_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivate_key_id: Self = this.set("private_key_id", js.undefined)
    @scala.inline
    def setProject_id(value: String): Self = this.set("project_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProject_id: Self = this.set("project_id", js.undefined)
    @scala.inline
    def setQuota_project_id(value: String): Self = this.set("quota_project_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuota_project_id: Self = this.set("quota_project_id", js.undefined)
    @scala.inline
    def setRefresh_token(value: String): Self = this.set("refresh_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefresh_token: Self = this.set("refresh_token", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

