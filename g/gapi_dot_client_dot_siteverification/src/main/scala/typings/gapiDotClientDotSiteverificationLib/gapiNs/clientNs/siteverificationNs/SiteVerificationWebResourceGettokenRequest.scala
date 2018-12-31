package typings
package gapiDotClientDotSiteverificationLib.gapiNs.clientNs.siteverificationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiteVerificationWebResourceGettokenRequest extends js.Object {
  /** The site for which a verification token will be generated. */
  var site: js.UndefOr[gapiDotClientDotSiteverificationLib.Anon_Type] = js.undefined
  /** The verification method that will be used to verify this site. For sites, 'FILE' or 'META' methods may be used. For domains, only 'DNS' may be used. */
  var verificationMethod: js.UndefOr[java.lang.String] = js.undefined
}

