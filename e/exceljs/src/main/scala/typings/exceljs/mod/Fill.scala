package typings.exceljs.mod

import typings.exceljs.anon.Left
import typings.exceljs.anon.PartialColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.exceljs.mod.FillPattern
  - typings.exceljs.mod.FillGradientAngle
  - typings.exceljs.mod.FillGradientPath
*/
trait Fill extends StObject
object Fill {
  
  @scala.inline
  def FillGradientAngle(degree: Double, stops: js.Array[GradientStop]): typings.exceljs.mod.FillGradientAngle = {
    val __obj = js.Dynamic.literal(degree = degree.asInstanceOf[js.Any], gradient = "angle", stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("gradient")
    __obj.asInstanceOf[typings.exceljs.mod.FillGradientAngle]
  }
  
  @scala.inline
  def FillGradientPath(center: Left, stops: js.Array[GradientStop]): typings.exceljs.mod.FillGradientPath = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], gradient = "path", stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("gradient")
    __obj.asInstanceOf[typings.exceljs.mod.FillGradientPath]
  }
  
  @scala.inline
  def FillPattern(fgColor: PartialColor, pattern: FillPatterns): typings.exceljs.mod.FillPattern = {
    val __obj = js.Dynamic.literal(fgColor = fgColor.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pattern")
    __obj.asInstanceOf[typings.exceljs.mod.FillPattern]
  }
}
