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
  
  val MultiRange: MultiRange with java.lang.String = js.native
  val Range: Range with java.lang.String = js.native
  val Single: Single with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.SpreadsheetNs.SelectionUnit with java.lang.String] = js.native
}

