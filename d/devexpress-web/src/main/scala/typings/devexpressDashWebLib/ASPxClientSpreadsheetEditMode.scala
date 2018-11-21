package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ASPxClientSpreadsheetEditMode extends js.Object

@JSGlobal("ASPxClientSpreadsheetEditMode")
@js.native
object ASPxClientSpreadsheetEditMode extends js.Object {
  @js.native
  sealed trait Cell
    extends devexpressDashWebLib.ASPxClientSpreadsheetEditMode
  
  @js.native
  sealed trait Comment
    extends devexpressDashWebLib.ASPxClientSpreadsheetEditMode
  
  @js.native
  sealed trait None
    extends devexpressDashWebLib.ASPxClientSpreadsheetEditMode
  
  /* 1 */ val Cell: Cell with scala.Double = js.native
  /* 2 */ val Comment: Comment with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[devexpressDashWebLib.ASPxClientSpreadsheetEditMode with scala.Double] = js.native
}

