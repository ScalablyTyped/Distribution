package typings.figma

import typings.figma.figmaStrings.PERCENT
import typings.figma.figmaStrings.PIXELS
import typings.figma.mod._Global_.LineHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPERCENT extends LineHeight {
  val unit: PIXELS | PERCENT
  val value: Double
}

object AnonPERCENT {
  @scala.inline
  def apply(unit: PIXELS | PERCENT, value: Double): AnonPERCENT = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPERCENT]
  }
}

