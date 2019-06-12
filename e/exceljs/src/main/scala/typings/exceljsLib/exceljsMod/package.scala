package typings
package exceljsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object exceljsMod {
  type AutoFilter = java.lang.String | exceljsLib.Anon_From
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - scala.Double
    - java.lang.String
    - scala.Boolean
    - stdLib.Date
    - CellErrorValue
    - CellRichTextValue
    - CellHyperlinkValue
    - CellFormulaValue
    - CellSharedFormulaValue
  */
  type CellValue = _CellValue | scala.Null | scala.Double | java.lang.String | scala.Boolean | stdLib.Date
  type DocumentType = exceljsLib.exceljsLibNumbers.`1`
  type WorksheetView = WorksheetViewCommon with (WorksheetViewNormal | WorksheetViewFrozen | WorksheetViewSplit)
}
