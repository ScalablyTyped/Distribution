package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ASPxClientSpreadsheetViewMode extends js.Object

@JSGlobal("ASPxClientSpreadsheetViewMode")
@js.native
object ASPxClientSpreadsheetViewMode extends js.Object {
  @js.native
  sealed trait Editing
    extends devexpressDashWebLib.ASPxClientSpreadsheetViewMode
  
  @js.native
  sealed trait Reading
    extends devexpressDashWebLib.ASPxClientSpreadsheetViewMode
  
  /* 0 */ val Editing: Editing with scala.Double = js.native
  /* 1 */ val Reading: Reading with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[devexpressDashWebLib.ASPxClientSpreadsheetViewMode with scala.Double] = js.native
}

