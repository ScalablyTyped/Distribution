package typings
package forgeDashApisLib.forgeDashApisMod

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("input")(input)
    __obj.updateDynamic("output")(output)
    __obj.asInstanceOf[JobPayload]
  }
}

