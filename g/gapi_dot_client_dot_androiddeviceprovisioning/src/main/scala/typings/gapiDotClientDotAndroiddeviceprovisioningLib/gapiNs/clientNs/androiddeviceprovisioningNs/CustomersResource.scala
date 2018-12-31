package typings
package gapiDotClientDotAndroiddeviceprovisioningLib.gapiNs.clientNs.androiddeviceprovisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomersResource extends js.Object {
  /**
    * Creates a customer for zero-touch enrollment. After the method returns
    * successfully, admin and owner roles can manage devices and EMM configs
    * by calling API methods or using their zero-touch enrollment portal. The API
    * doesn't notify the customer that they have access.
    */
  def create(request: gapiDotClientDotAndroiddeviceprovisioningLib.Anon_Parent): gapiDotClientLib.gapiNs.clientNs.Request[Company]
  /**
    * Lists the customers that are enrolled to the reseller identified by the
    * `partnerId` argument. This list includes customers that the reseller
    * created and customers that enrolled themselves using the portal.
    */
  def list(request: gapiDotClientDotAndroiddeviceprovisioningLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[ListCustomersResponse]
}

