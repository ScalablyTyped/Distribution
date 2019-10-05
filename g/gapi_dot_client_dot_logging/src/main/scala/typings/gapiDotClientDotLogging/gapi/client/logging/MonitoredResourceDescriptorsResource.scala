package typings.gapiDotClientDotLogging.gapi.client.logging

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotLogging.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPageSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonitoredResourceDescriptorsResource extends js.Object {
  /** Lists the descriptors for monitored resource types used by Stackdriver Logging. */
  def list(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPageSize): Request[ListMonitoredResourceDescriptorsResponse]
}

object MonitoredResourceDescriptorsResource {
  @scala.inline
  def apply(
    list: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPageSize => Request[ListMonitoredResourceDescriptorsResponse]
  ): MonitoredResourceDescriptorsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[MonitoredResourceDescriptorsResource]
  }
}

