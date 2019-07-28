package typings.gapiDotClientDotAndroiddeviceprovisioning.gapiNs.clientNs.androiddeviceprovisioningNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAndroiddeviceprovisioning.Anon_AccesstokenAlt
import typings.gapiDotClientDotAndroiddeviceprovisioning.Anon_AccesstokenAltBearertoken
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
  def create(request: Anon_AccesstokenAlt): Request[Company]
  /**
    * Lists the customers that are enrolled to the reseller identified by the
    * `partnerId` argument. This list includes customers that the reseller
    * created and customers that enrolled themselves using the portal.
    */
  def list(request: Anon_AccesstokenAltBearertoken): Request[ListCustomersResponse]
}

object CustomersResource {
  @scala.inline
  def apply(
    create: Anon_AccesstokenAlt => Request[Company],
    list: Anon_AccesstokenAltBearertoken => Request[ListCustomersResponse]
  ): CustomersResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[CustomersResource]
  }
}

