package typings.figma

import typings.figma.figmaStrings.NONE
import typings.figma.mod._Global_.OverlayBackground
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNONE extends OverlayBackground {
  val `type`: NONE
}

object AnonNONE {
  @scala.inline
  def apply(`type`: NONE): AnonNONE = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNONE]
  }
}

