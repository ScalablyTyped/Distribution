package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ASPxClientSpreadsheetViewMode extends js.Object

/**
  * Lists values identifying the Spreadsheet's view modes.
  */
@JSGlobal("ASPxClientSpreadsheetViewMode")
@js.native
object ASPxClientSpreadsheetViewMode extends js.Object {
  /**
    * Specifies that the Spreadsheet is in Editing view mode. In this view mode, users can edit a document's content.
    */
  @js.native
  sealed trait Editing extends ASPxClientSpreadsheetViewMode
  
  /**
    * Specifies that the Spreadsheet is in Reading view mode. In this view mode, users cannot edit a document's content.
    */
  @js.native
  sealed trait Reading extends ASPxClientSpreadsheetViewMode
  
  /* 0 */ val Editing: typings.devexpressDashWeb.ASPxClientSpreadsheetViewMode.Editing with Double = js.native
  /* 1 */ val Reading: typings.devexpressDashWeb.ASPxClientSpreadsheetViewMode.Reading with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ASPxClientSpreadsheetViewMode with Double] = js.native
}

