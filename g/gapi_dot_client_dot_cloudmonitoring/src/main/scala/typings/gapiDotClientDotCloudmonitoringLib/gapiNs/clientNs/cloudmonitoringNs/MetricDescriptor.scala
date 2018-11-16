package typings
package gapiDotClientDotCloudmonitoringLib.gapiNs.clientNs.cloudmonitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MetricDescriptor extends js.Object {
  /** Description of this metric. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Labels defined for this metric. */
  var labels: js.UndefOr[js.Array[MetricDescriptorLabelDescriptor]] = js.undefined
  /** The name of this metric. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The project ID to which the metric belongs. */
  var project: js.UndefOr[java.lang.String] = js.undefined
  /** Type description for this metric. */
  var typeDescriptor: js.UndefOr[MetricDescriptorTypeDescriptor] = js.undefined
}

