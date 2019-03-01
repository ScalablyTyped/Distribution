package typings
package forgeDashApisLib.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobPayloadOutput extends js.Object {
  var formats: js.Array[JobPayloadItem]
}

object JobPayloadOutput {
  @scala.inline
  def apply(formats: js.Array[JobPayloadItem]): JobPayloadOutput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("formats")(formats)
    __obj.asInstanceOf[JobPayloadOutput]
  }
}

