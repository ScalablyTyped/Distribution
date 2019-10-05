package typings.gapiDotClientDotAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAndroiddeviceprovisioning.Anon_Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsResource extends js.Object {
  /**
    * Gets the latest state of a long-running operation.  Clients can use this
    * method to poll the operation result at intervals as recommended by the API
    * service.
    */
  def get(request: Anon_Accesstoken): Request[Operation]
}

object OperationsResource {
  @scala.inline
  def apply(get: Anon_Accesstoken => Request[Operation]): OperationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[OperationsResource]
  }
}

