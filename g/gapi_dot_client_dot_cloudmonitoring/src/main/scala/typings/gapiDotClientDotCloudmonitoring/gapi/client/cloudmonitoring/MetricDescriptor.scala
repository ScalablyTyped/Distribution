package typings.gapiDotClientDotCloudmonitoring.gapi.client.cloudmonitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricDescriptor extends js.Object {
  /** Description of this metric. */
  var description: js.UndefOr[String] = js.undefined
  /** Labels defined for this metric. */
  var labels: js.UndefOr[js.Array[MetricDescriptorLabelDescriptor]] = js.undefined
  /** The name of this metric. */
  var name: js.UndefOr[String] = js.undefined
  /** The project ID to which the metric belongs. */
  var project: js.UndefOr[String] = js.undefined
  /** Type description for this metric. */
  var typeDescriptor: js.UndefOr[MetricDescriptorTypeDescriptor] = js.undefined
}

object MetricDescriptor {
  @scala.inline
  def apply(
    description: String = null,
    labels: js.Array[MetricDescriptorLabelDescriptor] = null,
    name: String = null,
    project: String = null,
    typeDescriptor: MetricDescriptorTypeDescriptor = null
  ): MetricDescriptor = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (name != null) __obj.updateDynamic("name")(name)
    if (project != null) __obj.updateDynamic("project")(project)
    if (typeDescriptor != null) __obj.updateDynamic("typeDescriptor")(typeDescriptor)
    __obj.asInstanceOf[MetricDescriptor]
  }
}

