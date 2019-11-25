package typings.exceljs.exceljsMod

import typings.exceljs.Anon_Left
import typings.exceljs.exceljsStrings.angle
import typings.exceljs.exceljsStrings.gradient
import typings.exceljs.exceljsStrings.path
import typings.exceljs.exceljsStrings.pattern
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.exceljs.exceljsMod.FillPattern
  - typings.exceljs.exceljsMod.FillGradientAngle
  - typings.exceljs.exceljsMod.FillGradientPath
*/
trait Fill extends js.Object

object Fill {
  @scala.inline
  def FillPattern(fgColor: Partial[Color], pattern: FillPatterns, `type`: pattern, bgColor: Partial[Color] = null): Fill = {
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
  def FillGradientPath(center: Anon_Left, gradient: path, stops: js.Array[GradientStop], `type`: gradient): Fill = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fill]
  }
}

