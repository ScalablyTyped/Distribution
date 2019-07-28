package typings.ejDotWebDotAll.ejNs.SpreadsheetNs

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
  sealed trait Column extends SelectionType
  
  ///To select both Column/Row in Spreadsheet.
  @js.native
  sealed trait Default extends SelectionType
  
  ///To select only Row in Spreadsheet.
  @js.native
  sealed trait Row extends SelectionType
  
  /* 0 */ val Column: typings.ejDotWebDotAll.ejNs.SpreadsheetNs.SelectionType.Column with Double = js.native
  /* 2 */ val Default: typings.ejDotWebDotAll.ejNs.SpreadsheetNs.SelectionType.Default with Double = js.native
  /* 1 */ val Row: typings.ejDotWebDotAll.ejNs.SpreadsheetNs.SelectionType.Row with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionType with Double] = js.native
}

