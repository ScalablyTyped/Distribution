package typings.gapiClientCloudmonitoring.gapi.client.cloudmonitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricDescriptor extends js.Object {
  /** Description of this metric. */
  var description: js.UndefOr[String] = js.native
  /** Labels defined for this metric. */
  var labels: js.UndefOr[js.Array[MetricDescriptorLabelDescriptor]] = js.native
  /** The name of this metric. */
  var name: js.UndefOr[String] = js.native
  /** The project ID to which the metric belongs. */
  var project: js.UndefOr[String] = js.native
  /** Type description for this metric. */
  var typeDescriptor: js.UndefOr[MetricDescriptorTypeDescriptor] = js.native
}

object MetricDescriptor {
  @scala.inline
  def apply(): MetricDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricDescriptor]
  }
  @scala.inline
  implicit class MetricDescriptorOps[Self <: MetricDescriptor] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setLabelsVarargs(value: MetricDescriptorLabelDescriptor*): Self = this.set("labels", js.Array(value :_*))
    @scala.inline
    def setLabels(value: js.Array[MetricDescriptorLabelDescriptor]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setProject(value: String): Self = this.set("project", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProject: Self = this.set("project", js.undefined)
    @scala.inline
    def setTypeDescriptor(value: MetricDescriptorTypeDescriptor): Self = this.set("typeDescriptor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeDescriptor: Self = this.set("typeDescriptor", js.undefined)
  }
  
}

