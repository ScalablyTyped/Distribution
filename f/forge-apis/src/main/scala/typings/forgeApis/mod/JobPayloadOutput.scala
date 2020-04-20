package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobPayloadOutput extends js.Object {
  var formats: js.Array[JobPayloadItem]
}

object JobPayloadOutput {
  @scala.inline
  def apply(formats: js.Array[JobPayloadItem]): JobPayloadOutput = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobPayloadOutput]
  }
}

