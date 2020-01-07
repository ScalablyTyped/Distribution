package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A resource returned by the GenerateSignupUrl API, which contains the Signup
  * URL and Completion Token.
  */
@js.native
trait Schema$SignupInfo extends js.Object {
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

object Schema$SignupInfo {
  @scala.inline
  def apply(completionToken: String = null, kind: String = null, url: String = null): Schema$SignupInfo = {
    val __obj = js.Dynamic.literal()
    if (completionToken != null) __obj.updateDynamic("completionToken")(completionToken.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SignupInfo]
  }
}

