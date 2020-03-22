package typings.figma

import typings.figma.figmaStrings.BACK
import typings.figma.figmaStrings.CLOSE
import typings.figma.mod._Global_.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends Action {
  val `type`: BACK | CLOSE
}

object AnonType {
  @scala.inline
  def apply(`type`: BACK | CLOSE): AnonType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

