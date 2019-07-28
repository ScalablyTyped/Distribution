package typings.fluentDashFfmpeg.fluentDashFfmpegMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterSpecification extends js.Object {
  var filter: String
  var inputs: js.UndefOr[String | js.Array[String]] = js.undefined
  var options: js.UndefOr[js.Any | String | js.Array[_]] = js.undefined
  var outputs: js.UndefOr[String | js.Array[String]] = js.undefined
}

object FilterSpecification {
  @scala.inline
  def apply(
    filter: String,
    inputs: String | js.Array[String] = null,
    options: js.Any | String | js.Array[_] = null,
    outputs: String | js.Array[String] = null
  ): FilterSpecification = {
    val __obj = js.Dynamic.literal(filter = filter)
    if (inputs != null) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (outputs != null) __obj.updateDynamic("outputs")(outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterSpecification]
  }
}

