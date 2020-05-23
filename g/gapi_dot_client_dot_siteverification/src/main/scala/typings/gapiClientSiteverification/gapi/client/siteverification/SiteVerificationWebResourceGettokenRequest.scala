package typings.gapiClientSiteverification.gapi.client.siteverification

import typings.gapiClientSiteverification.anon.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiteVerificationWebResourceGettokenRequest extends js.Object {
  /** The site for which a verification token will be generated. */
  var site: js.UndefOr[Identifier] = js.undefined
  /** The verification method that will be used to verify this site. For sites, 'FILE' or 'META' methods may be used. For domains, only 'DNS' may be used. */
  var verificationMethod: js.UndefOr[String] = js.undefined
}

object SiteVerificationWebResourceGettokenRequest {
  @scala.inline
  def apply(site: Identifier = null, verificationMethod: String = null): SiteVerificationWebResourceGettokenRequest = {
    val __obj = js.Dynamic.literal()
    if (site != null) __obj.updateDynamic("site")(site.asInstanceOf[js.Any])
    if (verificationMethod != null) __obj.updateDynamic("verificationMethod")(verificationMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[SiteVerificationWebResourceGettokenRequest]
  }
}

