package typings.gapiDotClientDotCloudmonitoring.gapi.client.cloudmonitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeseriesDescriptorLabel extends js.Object {
  /** The label's name. */
  var key: js.UndefOr[String] = js.undefined
  /** The label's value. */
  var value: js.UndefOr[String] = js.undefined
}

object TimeseriesDescriptorLabel {
  @scala.inline
  def apply(key: String = null, value: String = null): TimeseriesDescriptorLabel = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TimeseriesDescriptorLabel]
  }
}

