package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityGetApiKey extends Generic {
  var id: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var owner: js.UndefOr[Boolean] = js.native
  var realm_name: js.UndefOr[String] = js.native
  var username: js.UndefOr[String] = js.native
}

object SecurityGetApiKey {
  @scala.inline
  def apply(): SecurityGetApiKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGetApiKey]
  }
  @scala.inline
  implicit class SecurityGetApiKeyOps[Self <: SecurityGetApiKey] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOwner(value: Boolean): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setRealm_name(value: String): Self = this.set("realm_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRealm_name: Self = this.set("realm_name", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}

