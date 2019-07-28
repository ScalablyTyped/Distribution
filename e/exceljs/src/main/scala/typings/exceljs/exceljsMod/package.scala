package typings.exceljs

import typings.exceljs.Anon_From
import typings.exceljs.exceljsNumbers.`1`
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object exceljsMod {
  type AutoFilter = String | Anon_From
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - scala.Double
    - java.lang.String
    - scala.Boolean
    - typings.std.Date
    - typings.exceljs.exceljsMod.CellErrorValue
    - typings.exceljs.exceljsMod.CellRichTextValue
    - typings.exceljs.exceljsMod.CellHyperlinkValue
    - typings.exceljs.exceljsMod.CellFormulaValue
    - typings.exceljs.exceljsMod.CellSharedFormulaValue
  */
  type CellValue = _CellValue | Null | Double | String | Boolean | Date
  type DocumentType = `1`
  type WorksheetView = WorksheetViewCommon with (WorksheetViewNormal | WorksheetViewFrozen | WorksheetViewSplit)
}
