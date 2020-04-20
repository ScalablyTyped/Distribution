package typings.fluentFfmpeg.mod

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
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], multipleInputs = multipleInputs.asInstanceOf[js.Any], multipleOutputs = multipleOutputs.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

