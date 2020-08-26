package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A resource returned by the GenerateSignupUrl API, which contains the Signup
  * URL and Completion Token.
  */
@js.native
trait SchemaSignupInfo extends js.Object {
  /**
    * An opaque token that will be required, along with the Enterprise Token,
    * for obtaining the enterprise resource from CompleteSignup.
    */
  var completionToken: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#signupInfo&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A URL under which the Admin can sign up for an enterprise. The page
    * pointed to cannot be rendered in an iframe.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaSignupInfo {
  @scala.inline
  def apply(): SchemaSignupInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSignupInfo]
  }
  @scala.inline
  implicit class SchemaSignupInfoOps[Self <: SchemaSignupInfo] (val x: Self) extends AnyVal {
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
    def setCompletionToken(value: String): Self = this.set("completionToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompletionToken: Self = this.set("completionToken", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

