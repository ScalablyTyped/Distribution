package typings
package gapiDotClientDotSiteverificationLib.gapiNs.clientNs.siteverificationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiteVerificationWebResourceGettokenRequest extends js.Object {
  /** The site for which a verification token will be generated. */
  var site: js.UndefOr[gapiDotClientDotSiteverificationLib.Anon_Identifier] = js.undefined
  /** The verification method that will be used to verify this site. For sites, 'FILE' or 'META' methods may be used. For domains, only 'DNS' may be used. */
  var verificationMethod: js.UndefOr[java.lang.String] = js.undefined
}

object SiteVerificationWebResourceGettokenRequest {
  @scala.inline
  def apply(
    site: gapiDotClientDotSiteverificationLib.Anon_Identifier = null,
    verificationMethod: java.lang.String = null
  ): SiteVerificationWebResourceGettokenRequest = {
    val __obj = js.Dynamic.literal()
    if (site != null) __obj.updateDynamic("site")(site)
    if (verificationMethod != null) __obj.updateDynamic("verificationMethod")(verificationMethod)
    __obj.asInstanceOf[SiteVerificationWebResourceGettokenRequest]
  }
}

