package typings.gapiClientSpanner.gapi.client.spanner

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
    val __obj = js.Dynamic.literal(instanceConfigs = instanceConfigs.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
}

