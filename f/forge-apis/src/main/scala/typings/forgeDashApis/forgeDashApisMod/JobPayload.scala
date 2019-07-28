package typings.forgeDashApis.forgeDashApisMod

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
    val __obj = js.Dynamic.literal(input = input, output = output)
  
    __obj.asInstanceOf[JobPayload]
  }
}

