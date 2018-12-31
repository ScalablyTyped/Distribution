package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrouplicensesResource extends js.Object {
  /** Retrieves details of an enterprise's group license for a product. */
  def get(request: gapiDotClientDotAndroidenterpriseLib.Anon_EnterpriseIdPrettyPrintGroupLicenseId): gapiDotClientLib.gapiNs.clientNs.Request[GroupLicense]
  /** Retrieves IDs of all products for which the enterprise has a group license. */
  def list(request: gapiDotClientDotAndroidenterpriseLib.Anon_EnterpriseIdPrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[GroupLicensesListResponse]
}

