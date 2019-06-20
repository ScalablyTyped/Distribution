package typings
package fluentDashFfmpegLib.fluentDashFfmpegMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterSpecification extends js.Object {
  var filter: java.lang.String
  var inputs: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var options: js.UndefOr[js.Any | java.lang.String | js.Array[_]] = js.undefined
  var outputs: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object FilterSpecification {
  @scala.inline
  def apply(
    filter: java.lang.String,
    inputs: java.lang.String | js.Array[java.lang.String] = null,
    options: js.Any | java.lang.String | js.Array[_] = null,
    outputs: java.lang.String | js.Array[java.lang.String] = null
  ): FilterSpecification = {
    val __obj = js.Dynamic.literal(filter = filter)
    if (inputs != null) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (outputs != null) __obj.updateDynamic("outputs")(outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterSpecification]
  }
}

