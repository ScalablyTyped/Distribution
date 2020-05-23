package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ASPxClientSpreadsheetEditMode extends js.Object

/**
  * Lists values identifying a type of the element currently being edited in the Spreadsheet control.
  */
@JSGlobal("ASPxClientSpreadsheetEditMode")
@js.native
object ASPxClientSpreadsheetEditMode extends js.Object {
  /**
    * Specifies that the element currently being edited is the spreadsheet cell.
    */
  @js.native
  sealed trait Cell extends ASPxClientSpreadsheetEditMode
  
  /**
    * Specifies that the element currently being edited is the cell's comment.
    */
  @js.native
  sealed trait Comment extends ASPxClientSpreadsheetEditMode
  
  /**
    * Specifies that no elements are currently being edited.
    */
  @js.native
  sealed trait None extends ASPxClientSpreadsheetEditMode
  
}

