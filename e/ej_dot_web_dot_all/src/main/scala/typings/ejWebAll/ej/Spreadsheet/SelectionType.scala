package typings.ejWebAll.ej.Spreadsheet

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
  
}

