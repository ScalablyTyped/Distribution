package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionUnit extends js.Object

@JSGlobal("ej.Spreadsheet.SelectionUnit")
@js.native
object SelectionUnit extends js.Object {
  ///To enable MultiRange selection in Spreadsheet
  @js.native
  sealed trait MultiRange
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.SelectionUnit
  
  ///To enable Range selection in Spreadsheet
  @js.native
  sealed trait Range
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.SelectionUnit
  
  ///To enable Single selection in Spreadsheet
  @js.native
  sealed trait Single
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.SelectionUnit
  
  /* 2 */ val MultiRange: MultiRange with scala.Double = js.native
  /* 1 */ val Range: Range with scala.Double = js.native
  /* 0 */ val Single: Single with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.SpreadsheetNs.SelectionUnit with scala.Double] = js.native
}

