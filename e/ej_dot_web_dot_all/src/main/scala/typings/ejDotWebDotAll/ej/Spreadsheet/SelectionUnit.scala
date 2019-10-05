package typings.ejDotWebDotAll.ej.Spreadsheet

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
  sealed trait MultiRange extends SelectionUnit
  
  ///To enable Range selection in Spreadsheet
  @js.native
  sealed trait Range extends SelectionUnit
  
  ///To enable Single selection in Spreadsheet
  @js.native
  sealed trait Single extends SelectionUnit
  
  /* 2 */ val MultiRange: typings.ejDotWebDotAll.ej.Spreadsheet.SelectionUnit.MultiRange with Double = js.native
  /* 1 */ val Range: typings.ejDotWebDotAll.ej.Spreadsheet.SelectionUnit.Range with Double = js.native
  /* 0 */ val Single: typings.ejDotWebDotAll.ej.Spreadsheet.SelectionUnit.Single with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionUnit with Double] = js.native
}

