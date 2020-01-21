package typings.exceljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AutoFilter = java.lang.String | typings.exceljs.AnonFrom
  type Buffer = typings.std.ArrayBuffer
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - scala.Double
    - java.lang.String
    - scala.Boolean
    - typings.std.Date
    - typings.exceljs.mod.CellErrorValue
    - typings.exceljs.mod.CellRichTextValue
    - typings.exceljs.mod.CellHyperlinkValue
    - typings.exceljs.mod.CellFormulaValue
    - typings.exceljs.mod.CellSharedFormulaValue
  */
  type CellValue = typings.exceljs.mod._CellValue | scala.Null | scala.Double | java.lang.String | scala.Boolean | typings.std.Date
  type DefinedNamesModel = js.Array[typings.exceljs.mod.DefinedNamesRanges]
  type DocumentType = typings.exceljs.exceljsNumbers.`1`
  type TableColumn = typings.std.Required[typings.exceljs.mod.TableColumnProperties]
  type WorksheetView = typings.exceljs.mod.WorksheetViewCommon with (typings.exceljs.mod.WorksheetViewNormal | typings.exceljs.mod.WorksheetViewFrozen | typings.exceljs.mod.WorksheetViewSplit)
}
