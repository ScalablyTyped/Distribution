package typings.gapiClientMonitoring.gapi.client.monitoring

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoredResource extends js.Object {
  /**
    * Required. Values for all of the labels listed in the associated monitored resource descriptor. For example, Compute Engine VM instances use the labels
    * "project_id", "instance_id", and "zone".
    */
  var labels: js.UndefOr[Record[String, String]] = js.native
  /**
    * Required. The monitored resource type. This field must match the type field of a MonitoredResourceDescriptor object. For example, the type of a Compute
    * Engine VM instance is gce_instance.
    */
  var `type`: js.UndefOr[String] = js.native
}

object MonitoredResource {
  @scala.inline
  def apply(): MonitoredResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoredResource]
  }
  @scala.inline
  implicit class MonitoredResourceOps[Self <: MonitoredResource] (val x: Self) extends AnyVal {
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
    def setLabels(value: Record[String, String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

