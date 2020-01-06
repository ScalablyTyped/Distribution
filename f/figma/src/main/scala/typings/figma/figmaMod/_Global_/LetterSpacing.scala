package typings.figma.figmaMod._Global_

import typings.figma.figmaStrings.PERCENT
import typings.figma.figmaStrings.PIXELS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LetterSpacing extends js.Object {
  val unit: PIXELS | PERCENT
  val value: Double
}

object LetterSpacing {
  @scala.inline
  def apply(unit: PIXELS | PERCENT, value: Double): LetterSpacing = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LetterSpacing]
  }
}

