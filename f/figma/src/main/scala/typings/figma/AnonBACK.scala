package typings.figma

import typings.figma.figmaStrings.BACK
import typings.figma.figmaStrings.CLOSE
import typings.figma.mod._Global_.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBACK extends Action {
  val `type`: BACK | CLOSE
}

object AnonBACK {
  @scala.inline
  def apply(`type`: BACK | CLOSE): AnonBACK = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBACK]
  }
}

