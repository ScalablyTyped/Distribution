package typings.gapiClientAppengine.gapi.client.appengine

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAppengine.AnonInstancesId
import typings.gapiClientAppengine.AnonPageSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstancesResource extends js.Object {
  /**
    * Enables debugging on a VM instance. This allows you to use the SSH command to connect to the virtual machine where the instance lives. While in "debug
    * mode", the instance continues to serve live traffic. You should delete the instance when you are done debugging and then allow the system to take over
    * and determine if another instance should be started.Only applicable for instances in App Engine flexible environment.
    */
  def debug(request: AnonInstancesId): Request_[Operation]
  /** Stops a running instance. */
  def delete(request: AnonInstancesId): Request_[Operation]
  /** Gets instance information. */
  def get(request: AnonInstancesId): Request_[Instance]
  /**
    * Lists the instances of a version.Tip: To aggregate details about instances over time, see the Stackdriver Monitoring API
    * (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.timeSeries/list).
    */
  def list(request: AnonPageSize): Request_[ListInstancesResponse]
}

object InstancesResource {
  @scala.inline
  def apply(
    debug: AnonInstancesId => Request_[Operation],
    delete: AnonInstancesId => Request_[Operation],
    get: AnonInstancesId => Request_[Instance],
    list: AnonPageSize => Request_[ListInstancesResponse]
  ): InstancesResource = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[InstancesResource]
  }
}

