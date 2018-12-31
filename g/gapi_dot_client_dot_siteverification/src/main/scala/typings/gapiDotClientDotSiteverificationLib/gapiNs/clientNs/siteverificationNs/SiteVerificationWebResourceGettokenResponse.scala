package typings
package gapiDotClientDotSiteverificationLib.gapiNs.clientNs.siteverificationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiteVerificationWebResourceGettokenResponse extends js.Object {
  /**
    * The verification method to use in conjunction with this token. For FILE, the token should be placed in the top-level directory of the site, stored
    * inside a file of the same name. For META, the token should be placed in the HEAD tag of the default page that is loaded for the site. For DNS, the
    * token should be placed in a TXT record of the domain.
    */
  var method: js.UndefOr[java.lang.String] = js.undefined
  /** The verification token. The token must be placed appropriately in order for verification to succeed. */
  var token: js.UndefOr[java.lang.String] = js.undefined
}

