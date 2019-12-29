package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionType with Double] = js.native
  /* 6 */ @js.native
  object CURRENT_PAGE extends TopLevel[CURRENT_PAGE with Double]
  
  /* 1 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  /* 4 */ @js.native
  object PAGE extends TopLevel[PAGE with Double]
  
  /* 5 */ @js.native
  object PAGE_ELEMENT extends TopLevel[PAGE_ELEMENT with Double]
  
  /* 3 */ @js.native
  object TABLE_CELL extends TopLevel[TABLE_CELL with Double]
  
  /* 2 */ @js.native
  object TEXT extends TopLevel[TEXT with Double]
  
  /* 0 */ @js.native
  object UNSUPPORTED extends TopLevel[UNSUPPORTED with Double]
  
}

