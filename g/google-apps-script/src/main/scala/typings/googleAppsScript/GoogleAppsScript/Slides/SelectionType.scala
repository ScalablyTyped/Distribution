package typings.googleAppsScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SelectionType extends js.Object
/**
  * Type of Selection.
  *
  * The SelectionType represents the most specific type of one or more objects that are
  * selected. As an example if one or more TableCell instances are selected in a Table, the selection type is SelectionType.TABLE_CELL. The TableCellRange can be
  * retrieved by using the Selection.getTableCellRange. The Table can be retrieved by
  * using the Selection.getPageElementRange and the Page can be retrieved from the
  * Selection.getCurrentPage.
  */
@JSGlobal("GoogleAppsScript.Slides.SelectionType")
@js.native
object SelectionType extends js.Object {
  
  @js.native
  sealed trait CURRENT_PAGE extends SelectionType
  
  @js.native
  sealed trait NONE extends SelectionType
  
  @js.native
  sealed trait PAGE extends SelectionType
  
  @js.native
  sealed trait PAGE_ELEMENT extends SelectionType
  
  @js.native
  sealed trait TABLE_CELL extends SelectionType
  
  @js.native
  sealed trait TEXT extends SelectionType
  
  @js.native
  sealed trait UNSUPPORTED extends SelectionType
}
