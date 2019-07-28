package typings.fluentDashFfmpeg.fluentDashFfmpegMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  var description: String
  var input: String
  var multipleInputs: Boolean
  var multipleOutputs: Boolean
  var output: String
}

object Filter {
  @scala.inline
  def apply(
    description: String,
    input: String,
    multipleInputs: Boolean,
    multipleOutputs: Boolean,
    output: String
  ): Filter = {
    val __obj = js.Dynamic.literal(description = description, input = input, multipleInputs = multipleInputs, multipleOutputs = multipleOutputs, output = output)
  
    __obj.asInstanceOf[Filter]
  }
}

