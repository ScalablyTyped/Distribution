package typings
package exceljsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object exceljsMod {
  type AutoFilter = java.lang.String | exceljsLib.Anon_From
  type BorderStyle = exceljsLib.exceljsLibStrings.thin | exceljsLib.exceljsLibStrings.dotted | exceljsLib.exceljsLibStrings.hair | exceljsLib.exceljsLibStrings.medium | exceljsLib.exceljsLibStrings.double | exceljsLib.exceljsLibStrings.thick | exceljsLib.exceljsLibStrings.dashDot | exceljsLib.exceljsLibStrings.dashDotDot | exceljsLib.exceljsLibStrings.slantDashDot | exceljsLib.exceljsLibStrings.mediumDashed | exceljsLib.exceljsLibStrings.mediumDashDotDot | exceljsLib.exceljsLibStrings.mediumDashDot
  type CellValue = scala.Null | scala.Double | java.lang.String | scala.Boolean | stdLib.Date | CellErrorValue | CellRichTextValue | CellHyperlinkValue | CellFormulaValue | CellSharedFormulaValue
  type DataValidationOperator = exceljsLib.exceljsLibStrings.between | exceljsLib.exceljsLibStrings.notBetween | exceljsLib.exceljsLibStrings.equal | exceljsLib.exceljsLibStrings.notEqual | exceljsLib.exceljsLibStrings.greaterThan | exceljsLib.exceljsLibStrings.lessThan | exceljsLib.exceljsLibStrings.greaterThanOrEqual | exceljsLib.exceljsLibStrings.lessThanOrEqual
  type Fill = FillPattern | FillGradientAngle | FillGradientPath
  type FillPatterns = exceljsLib.exceljsLibStrings.none | exceljsLib.exceljsLibStrings.solid | exceljsLib.exceljsLibStrings.darkVertical | exceljsLib.exceljsLibStrings.darkHorizontal | exceljsLib.exceljsLibStrings.darkGrid | exceljsLib.exceljsLibStrings.darkTrellis | exceljsLib.exceljsLibStrings.darkDown | exceljsLib.exceljsLibStrings.darkUp | exceljsLib.exceljsLibStrings.lightVertical | exceljsLib.exceljsLibStrings.lightHorizontal | exceljsLib.exceljsLibStrings.lightGrid | exceljsLib.exceljsLibStrings.lightTrellis | exceljsLib.exceljsLibStrings.lightDown | exceljsLib.exceljsLibStrings.lightUp | exceljsLib.exceljsLibStrings.darkGray | exceljsLib.exceljsLibStrings.mediumGray | exceljsLib.exceljsLibStrings.lightGray | exceljsLib.exceljsLibStrings.gray125 | exceljsLib.exceljsLibStrings.gray0625
  type WorksheetView = WorksheetViewCommon with (WorksheetViewNormal | WorksheetViewFrozen | WorksheetViewSplit)
}
