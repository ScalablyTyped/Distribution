package typings.ejDotWebDotAll.ej.Spreadsheet

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionUnit with Double] = js.native
  /* 2 */ @js.native
  object MultiRange extends TopLevel[MultiRange with Double]
  
  /* 1 */ @js.native
  object Range extends TopLevel[Range with Double]
  
  /* 0 */ @js.native
  object Single extends TopLevel[Single with Double]
  
}

