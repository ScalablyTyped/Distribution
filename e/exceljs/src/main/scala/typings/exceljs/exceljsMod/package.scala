package typings.exceljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object exceljsMod {
  import typings.exceljs.Anon_From
  import typings.exceljs.exceljsNumbers.`1`
  import typings.std.ArrayBuffer
  import typings.std.Date
  import typings.std.Required

  type AutoFilter = String | Anon_From
  type Buffer = ArrayBuffer
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
  type DefinedNamesModel = js.Array[DefinedNamesRanges]
  type DocumentType = `1`
  type TableColumn = Required[TableColumnProperties]
  type WorksheetView = WorksheetViewCommon with (WorksheetViewNormal | WorksheetViewFrozen | WorksheetViewSplit)
}
