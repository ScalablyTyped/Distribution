package typings.figma.anon

import typings.figma.figmaStrings.AFTER_TIMEOUT
import typings.figma.mod.global.Trigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timeout extends Trigger {
  val timeout: Double
  val `type`: AFTER_TIMEOUT
}

object Timeout {
  @scala.inline
  def apply(timeout: Double, `type`: AFTER_TIMEOUT): Timeout = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timeout]
  }
}

