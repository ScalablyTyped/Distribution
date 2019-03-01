package typings
package gapiDotClientDotCloudmonitoringLib.gapiNs.clientNs.cloudmonitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeseriesDescriptorLabel extends js.Object {
  /** The label's name. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** The label's value. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object TimeseriesDescriptorLabel {
  @scala.inline
  def apply(key: java.lang.String = null, value: java.lang.String = null): TimeseriesDescriptorLabel = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TimeseriesDescriptorLabel]
  }
}

