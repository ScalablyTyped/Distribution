package typings
package gapiDotClientDotCloudtasksLib.gapiNs.clientNs.cloudtasksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsResource extends js.Object {
  var queues: QueuesResource
  /** Get information about a location. */
  def get(request: gapiDotClientDotCloudtasksLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Location]
  /** Lists information about the supported locations for this service. */
  def list(request: gapiDotClientDotCloudtasksLib.Anon_AccesstokenAltBearertokenCallbackFieldsFilterKey): gapiDotClientLib.gapiNs.clientNs.Request[ListLocationsResponse]
}

object LocationsResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotCloudtasksLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[Location],
    list: gapiDotClientDotCloudtasksLib.Anon_AccesstokenAltBearertokenCallbackFieldsFilterKey => gapiDotClientLib.gapiNs.clientNs.Request[ListLocationsResponse],
    queues: QueuesResource
  ): LocationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), queues = queues)
  
    __obj.asInstanceOf[LocationsResource]
  }
}

