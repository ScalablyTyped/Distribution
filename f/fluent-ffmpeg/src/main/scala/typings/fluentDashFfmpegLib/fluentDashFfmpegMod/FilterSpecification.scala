package typings
package fluentDashFfmpegLib.fluentDashFfmpegMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterSpecification extends js.Object {
  var filter: java.lang.String
  var inputs: java.lang.String | js.Array[java.lang.String]
  var options: js.UndefOr[js.Any | java.lang.String | js.Array[_]] = js.undefined
  var outputs: java.lang.String | js.Array[java.lang.String]
}

object FilterSpecification {
  @scala.inline
  def apply(
    filter: java.lang.String,
    inputs: java.lang.String | js.Array[java.lang.String],
    outputs: java.lang.String | js.Array[java.lang.String],
    options: js.Any | java.lang.String | js.Array[_] = null
  ): FilterSpecification = {
    val __obj = js.Dynamic.literal(filter = filter, inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterSpecification]
  }
}

