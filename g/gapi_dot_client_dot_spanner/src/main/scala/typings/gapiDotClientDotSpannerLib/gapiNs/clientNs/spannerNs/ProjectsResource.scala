package typings
package gapiDotClientDotSpannerLib.gapiNs.clientNs.spannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var instanceConfigs: InstanceConfigsResource
  var instances: InstancesResource
}

object ProjectsResource {
  @scala.inline
  def apply(instanceConfigs: InstanceConfigsResource, instances: InstancesResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(instanceConfigs = instanceConfigs, instances = instances)
  
    __obj.asInstanceOf[ProjectsResource]
  }
}

