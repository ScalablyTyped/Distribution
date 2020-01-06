package typings.figma

import typings.figma.figmaMod._Global_.Trigger
import typings.figma.figmaStrings.AFTER_TIMEOUT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AFTERTIMEOUT extends Trigger {
  val timeout: Double
  val `type`: AFTER_TIMEOUT
}

object Anon_AFTERTIMEOUT {
  @scala.inline
  def apply(timeout: Double, `type`: AFTER_TIMEOUT): Anon_AFTERTIMEOUT = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AFTERTIMEOUT]
  }
}

