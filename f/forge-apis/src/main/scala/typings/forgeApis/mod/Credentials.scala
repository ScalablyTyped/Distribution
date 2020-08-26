package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Credentials extends js.Object {
  var client_id: String = js.native
  var client_secret: String = js.native
  var grant_type: String = js.native
  var scope: js.UndefOr[Scope] = js.native
}

object Credentials {
  @scala.inline
  def apply(client_id: String, client_secret: String, grant_type: String): Credentials = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any], grant_type = grant_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials]
  }
  @scala.inline
  implicit class CredentialsOps[Self <: Credentials] (val x: Self) extends AnyVal {
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
    def setClient_id(value: String): Self = this.set("client_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setClient_secret(value: String): Self = this.set("client_secret", value.asInstanceOf[js.Any])
    @scala.inline
    def setGrant_type(value: String): Self = this.set("grant_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setScope(value: Scope): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
  
}

