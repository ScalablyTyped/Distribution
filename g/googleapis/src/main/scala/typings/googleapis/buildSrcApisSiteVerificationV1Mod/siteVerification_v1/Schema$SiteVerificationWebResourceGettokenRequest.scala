package typings.googleapis.buildSrcApisSiteVerificationV1Mod.siteVerification_v1

import typings.googleapis.Anon_Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$SiteVerificationWebResourceGettokenRequest extends js.Object {
  /**
    * The site for which a verification token will be generated.
    */
  var site: js.UndefOr[Anon_Identifier] = js.native
  /**
    * The verification method that will be used to verify this site. For sites,
    * &#39;FILE&#39; or &#39;META&#39; methods may be used. For domains, only
    * &#39;DNS&#39; may be used.
    */
  var verificationMethod: js.UndefOr[String] = js.native
}

object Schema$SiteVerificationWebResourceGettokenRequest {
  @scala.inline
  def apply(site: Anon_Identifier = null, verificationMethod: String = null): Schema$SiteVerificationWebResourceGettokenRequest = {
    val __obj = js.Dynamic.literal()
    if (site != null) __obj.updateDynamic("site")(site.asInstanceOf[js.Any])
    if (verificationMethod != null) __obj.updateDynamic("verificationMethod")(verificationMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SiteVerificationWebResourceGettokenRequest]
  }
}

