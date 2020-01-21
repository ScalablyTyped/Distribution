package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobPayload extends js.Object {
  var input: JobPayloadInput
  var output: JobPayloadOutput
}

object JobPayload {
  @scala.inline
  def apply(input: JobPayloadInput, output: JobPayloadOutput): JobPayload = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JobPayload]
  }
}

