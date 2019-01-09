package typings
package gapiDotClientDotSiteverificationLib.gapiNs.clientNs.siteverificationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiteVerificationWebResourceResource extends js.Object {
  /** The string used to identify this site. This value should be used in the "id" portion of the REST URL for the Get, Update, and Delete operations. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The email addresses of all verified owners. */
  var owners: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The address and type of a site that is verified or will be verified. */
  var site: js.UndefOr[gapiDotClientDotSiteverificationLib.Anon_Identifier] = js.undefined
}

