package typings.ejDotWebDotAll.ej.Spreadsheet

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
  
  /* 0 */ val Column: typings.ejDotWebDotAll.ej.Spreadsheet.SelectionType.Column with Double = js.native
  /* 2 */ val Default: typings.ejDotWebDotAll.ej.Spreadsheet.SelectionType.Default with Double = js.native
  /* 1 */ val Row: typings.ejDotWebDotAll.ej.Spreadsheet.SelectionType.Row with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionType with Double] = js.native
}

