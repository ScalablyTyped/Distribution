package typings.ghauth.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthOptions extends js.Object {
  /**
    * @default "https://api.github.com/authorizations"
    */
  var authUrl: js.UndefOr[String] = js.native
  var configName: String = js.native
  /**
    * @default false
    */
  var noSave: js.UndefOr[Boolean] = js.native
  /**
    * @default "Node.js command-line app with ghauth"
    */
  var note: js.UndefOr[String] = js.native
  /**
    * @default "GitHub"
    */
  var promptName: js.UndefOr[String] = js.native
  /**
    * @default []
    */
  var scopes: js.UndefOr[js.Array[String]] = js.native
  /**
    * @default "Magic Node.js application that does magic things with ghauth"
    */
  var userAgent: js.UndefOr[String] = js.native
}

object AuthOptions {
  @scala.inline
  def apply(configName: String): AuthOptions = {
    val __obj = js.Dynamic.literal(configName = configName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthOptions]
  }
  @scala.inline
  implicit class AuthOptionsOps[Self <: AuthOptions] (val x: Self) extends AnyVal {
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
    def setConfigName(value: String): Self = this.set("configName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthUrl(value: String): Self = this.set("authUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthUrl: Self = this.set("authUrl", js.undefined)
    @scala.inline
    def setNoSave(value: Boolean): Self = this.set("noSave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoSave: Self = this.set("noSave", js.undefined)
    @scala.inline
    def setNote(value: String): Self = this.set("note", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    @scala.inline
    def setPromptName(value: String): Self = this.set("promptName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromptName: Self = this.set("promptName", js.undefined)
    @scala.inline
    def setScopesVarargs(value: String*): Self = this.set("scopes", js.Array(value :_*))
    @scala.inline
    def setScopes(value: js.Array[String]): Self = this.set("scopes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScopes: Self = this.set("scopes", js.undefined)
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserAgent: Self = this.set("userAgent", js.undefined)
  }
  
}

