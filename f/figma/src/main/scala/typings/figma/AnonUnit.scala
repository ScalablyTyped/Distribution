package typings.figma

import typings.figma.figmaStrings.PERCENT
import typings.figma.figmaStrings.PIXELS
import typings.figma.mod._Global_.LineHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUnit extends LineHeight {
  val unit: PIXELS | PERCENT
  val value: Double
}

object AnonUnit {
  @scala.inline
  def apply(unit: PIXELS | PERCENT, value: Double): AnonUnit = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUnit]
  }
}

