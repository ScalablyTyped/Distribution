package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobPayload extends js.Object {
  var input: JobPayloadInput = js.native
  var output: JobPayloadOutput = js.native
}

object JobPayload {
  @scala.inline
  def apply(input: JobPayloadInput, output: JobPayloadOutput): JobPayload = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobPayload]
  }
  @scala.inline
  implicit class JobPayloadOps[Self <: JobPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInput(value: JobPayloadInput): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutput(value: JobPayloadOutput): Self = this.set("output", value.asInstanceOf[js.Any])
  }
  
}

