package typings.figma

import typings.figma.figmaStrings.AUTO
import typings.figma.figmaStrings.PERCENT
import typings.figma.figmaStrings.PIXELS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineHeight extends js.Object {
  val unit: js.UndefOr[AUTO | PERCENT | PIXELS] = js.undefined
  val value: js.UndefOr[Double] = js.undefined
}

object LineHeight {
  @scala.inline
  def apply(unit: PIXELS | PERCENT = null, value: Int | Double = null): LineHeight = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineHeight]
  }
}

