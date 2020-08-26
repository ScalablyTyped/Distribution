package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Token extends js.Object {
  var anonymous: js.UndefOr[Boolean] = js.native
  var clientId: js.UndefOr[String] = js.native
  var displayText: js.UndefOr[String] = js.native
  var etag: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var nativeApp: js.UndefOr[Boolean] = js.native
  var scopes: js.UndefOr[js.Array[String]] = js.native
  var userKey: js.UndefOr[String] = js.native
}

object Token {
  @scala.inline
  def apply(): Token = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  implicit class TokenOps[Self <: Token] (val x: Self) extends AnyVal {
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
    def setAnonymous(value: Boolean): Self = this.set("anonymous", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnonymous: Self = this.set("anonymous", js.undefined)
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    @scala.inline
    def setDisplayText(value: String): Self = this.set("displayText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayText: Self = this.set("displayText", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNativeApp(value: Boolean): Self = this.set("nativeApp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNativeApp: Self = this.set("nativeApp", js.undefined)
    @scala.inline
    def setScopesVarargs(value: String*): Self = this.set("scopes", js.Array(value :_*))
    @scala.inline
    def setScopes(value: js.Array[String]): Self = this.set("scopes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScopes: Self = this.set("scopes", js.undefined)
    @scala.inline
    def setUserKey(value: String): Self = this.set("userKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserKey: Self = this.set("userKey", js.undefined)
  }
  
}

