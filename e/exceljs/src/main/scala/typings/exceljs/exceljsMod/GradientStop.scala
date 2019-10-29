package typings.exceljs.exceljsMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GradientStop extends js.Object {
  var color: Partial[Color]
  var position: Double
}

object GradientStop {
  @scala.inline
  def apply(color: Partial[Color], position: Double): GradientStop = {
    val __obj = js.Dynamic.literal(color = color, position = position)
  
    __obj.asInstanceOf[GradientStop]
  }
}

