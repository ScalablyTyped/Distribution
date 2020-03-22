package typings.figma

import typings.figma.figmaStrings.AFTER_TIMEOUT
import typings.figma.mod._Global_.Trigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTimeout extends Trigger {
  val timeout: Double
  val `type`: AFTER_TIMEOUT
}

object AnonTimeout {
  @scala.inline
  def apply(timeout: Double, `type`: AFTER_TIMEOUT): AnonTimeout = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTimeout]
  }
}

