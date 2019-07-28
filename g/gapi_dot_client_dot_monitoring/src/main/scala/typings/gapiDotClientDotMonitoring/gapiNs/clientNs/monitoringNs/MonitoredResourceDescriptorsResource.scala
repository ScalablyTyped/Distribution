package typings.gapiDotClientDotMonitoring.gapiNs.clientNs.monitoringNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotMonitoring.Anon_Accesstoken
import typings.gapiDotClientDotMonitoring.Anon_AccesstokenAltBearertokenCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonitoredResourceDescriptorsResource extends js.Object {
  /** Gets a single monitored resource descriptor. This method does not require a Stackdriver account. */
  def get(request: Anon_Accesstoken): Request[MonitoredResourceDescriptor]
  /** Lists monitored resource descriptors that match a filter. This method does not require a Stackdriver account. */
  def list(request: Anon_AccesstokenAltBearertokenCallback): Request[ListMonitoredResourceDescriptorsResponse]
}

object MonitoredResourceDescriptorsResource {
  @scala.inline
  def apply(
    get: Anon_Accesstoken => Request[MonitoredResourceDescriptor],
    list: Anon_AccesstokenAltBearertokenCallback => Request[ListMonitoredResourceDescriptorsResponse]
  ): MonitoredResourceDescriptorsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[MonitoredResourceDescriptorsResource]
  }
}

