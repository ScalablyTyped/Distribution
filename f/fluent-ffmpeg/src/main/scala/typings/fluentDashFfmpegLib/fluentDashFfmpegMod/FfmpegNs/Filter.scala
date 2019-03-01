package typings
package fluentDashFfmpegLib.fluentDashFfmpegMod.FfmpegNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  var description: java.lang.String
  var input: java.lang.String
  var multipleInputs: scala.Boolean
  var multipleOutputs: scala.Boolean
  var output: java.lang.String
}

object Filter {
  @scala.inline
  def apply(
    description: java.lang.String,
    input: java.lang.String,
    multipleInputs: scala.Boolean,
    multipleOutputs: scala.Boolean,
    output: java.lang.String
  ): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("input")(input)
    __obj.updateDynamic("multipleInputs")(multipleInputs)
    __obj.updateDynamic("multipleOutputs")(multipleOutputs)
    __obj.updateDynamic("output")(output)
    __obj.asInstanceOf[Filter]
  }
}

