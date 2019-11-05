package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 6 */ val CURRENT_PAGE: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.SelectionType.CURRENT_PAGE with Double = js.native
  /* 1 */ val NONE: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.SelectionType.NONE with Double = js.native
  /* 4 */ val PAGE: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.SelectionType.PAGE with Double = js.native
  /* 5 */ val PAGE_ELEMENT: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.SelectionType.PAGE_ELEMENT with Double = js.native
  /* 3 */ val TABLE_CELL: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.SelectionType.TABLE_CELL with Double = js.native
  /* 2 */ val TEXT: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.SelectionType.TEXT with Double = js.native
  /* 0 */ val UNSUPPORTED: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.SelectionType.UNSUPPORTED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionType with Double] = js.native
}

