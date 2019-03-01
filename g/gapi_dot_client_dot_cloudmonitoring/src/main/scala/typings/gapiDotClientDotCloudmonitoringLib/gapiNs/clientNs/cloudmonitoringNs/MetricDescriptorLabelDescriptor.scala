package typings
package gapiDotClientDotCloudmonitoringLib.gapiNs.clientNs.cloudmonitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricDescriptorLabelDescriptor extends js.Object {
  /** Label description. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Label key. */
  var key: js.UndefOr[java.lang.String] = js.undefined
}

object MetricDescriptorLabelDescriptor {
  @scala.inline
  def apply(description: java.lang.String = null, key: java.lang.String = null): MetricDescriptorLabelDescriptor = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[MetricDescriptorLabelDescriptor]
  }
}

