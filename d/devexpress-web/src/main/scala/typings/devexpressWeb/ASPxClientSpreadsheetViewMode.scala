package typings.devexpressWeb

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ASPxClientSpreadsheetViewMode with Double] = js.native
  /* 0 */ @js.native
  object Editing extends TopLevel[Editing with Double]
  
  /* 1 */ @js.native
  object Reading extends TopLevel[Reading with Double]
  
}

