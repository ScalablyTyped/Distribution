package typings.exceljs.mod

import typings.exceljs.anon.Left
import typings.exceljs.anon.PartialColor
import typings.exceljs.exceljsStrings.angle
import typings.exceljs.exceljsStrings.gradient
import typings.exceljs.exceljsStrings.path
import typings.exceljs.exceljsStrings.pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.exceljs.mod.FillPattern
  - typings.exceljs.mod.FillGradientAngle
  - typings.exceljs.mod.FillGradientPath
*/
trait Fill extends js.Object

object Fill {
  @scala.inline
  def FillPattern(fgColor: PartialColor, pattern: FillPatterns, `type`: pattern, bgColor: PartialColor = null): Fill = {
    val __obj = js.Dynamic.literal(fgColor = fgColor.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fill]
  }
  @scala.inline
  def FillGradientAngle(degree: Double, gradient: angle, stops: js.Array[GradientStop], `type`: gradient): Fill = {
    val __obj = js.Dynamic.literal(degree = degree.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fill]
  }
  @scala.inline
  def FillGradientPath(center: Left, gradient: path, stops: js.Array[GradientStop], `type`: gradient): Fill = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fill]
  }
}

