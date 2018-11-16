package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionType extends js.Object

@JSGlobal("ej.Spreadsheet.SelectionType")
@js.native
object SelectionType extends js.Object {
  ///To select only Column in Spreadsheet.
  @js.native
  sealed trait Column
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.SelectionType
  
  ///To select both Column/Row in Spreadsheet.
  @js.native
  sealed trait Default
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.SelectionType
  
  ///To select only Row in Spreadsheet.
  @js.native
  sealed trait Row
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.SelectionType
  
  val Column: Column with java.lang.String = js.native
  val Default: Default with java.lang.String = js.native
  val Row: Row with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.SpreadsheetNs.SelectionType with java.lang.String] = js.native
}

