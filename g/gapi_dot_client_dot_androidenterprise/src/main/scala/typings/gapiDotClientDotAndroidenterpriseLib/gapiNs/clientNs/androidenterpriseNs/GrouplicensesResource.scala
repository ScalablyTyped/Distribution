package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrouplicensesResource extends js.Object {
  /** Retrieves details of an enterprise's group license for a product. */
  def get(request: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFieldsGroupLicenseId): gapiDotClientLib.gapiNs.clientNs.Request[GroupLicense]
  /** Retrieves IDs of all products for which the enterprise has a group license. */
  def list(request: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFields): gapiDotClientLib.gapiNs.clientNs.Request[GroupLicensesListResponse]
}

object GrouplicensesResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFieldsGroupLicenseId, 
      gapiDotClientLib.gapiNs.clientNs.Request[GroupLicense]
    ],
    list: js.Function1[
      gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[GroupLicensesListResponse]
    ]
  ): GrouplicensesResource = {
    val __obj = js.Dynamic.literal(get = get, list = list)
  
    __obj.asInstanceOf[GrouplicensesResource]
  }
}

