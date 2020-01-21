package typings.gapiClientCloudmonitoring.gapi.client.cloudmonitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricDescriptorLabelDescriptor extends js.Object {
  /** Label description. */
  var description: js.UndefOr[String] = js.undefined
  /** Label key. */
  var key: js.UndefOr[String] = js.undefined
}

object MetricDescriptorLabelDescriptor {
  @scala.inline
  def apply(description: String = null, key: String = null): MetricDescriptorLabelDescriptor = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricDescriptorLabelDescriptor]
  }
}

