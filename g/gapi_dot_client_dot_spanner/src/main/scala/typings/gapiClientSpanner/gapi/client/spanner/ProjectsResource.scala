package typings.gapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectsResource extends js.Object {
  var instanceConfigs: InstanceConfigsResource = js.native
  var instances: InstancesResource = js.native
}

object ProjectsResource {
  @scala.inline
  def apply(instanceConfigs: InstanceConfigsResource, instances: InstancesResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(instanceConfigs = instanceConfigs.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  @scala.inline
  implicit class ProjectsResourceOps[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInstanceConfigs(value: InstanceConfigsResource): Self = this.set("instanceConfigs", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstances(value: InstancesResource): Self = this.set("instances", value.asInstanceOf[js.Any])
  }
  
}

