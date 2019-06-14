package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionType extends js.Object

@JSGlobal("GoogleAppsScript.Slides.SelectionType")
@js.native
object SelectionType extends js.Object {
  @js.native
  sealed trait CURRENT_PAGE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SelectionType
  
  @js.native
  sealed trait NONE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SelectionType
  
  @js.native
  sealed trait PAGE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SelectionType
  
  @js.native
  sealed trait PAGE_ELEMENT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SelectionType
  
  @js.native
  sealed trait TABLE_CELL
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SelectionType
  
  @js.native
  sealed trait TEXT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SelectionType
  
  @js.native
  sealed trait UNSUPPORTED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SelectionType
  
  /* 6 */ val CURRENT_PAGE: CURRENT_PAGE with scala.Double = js.native
  /* 1 */ val NONE: NONE with scala.Double = js.native
  /* 4 */ val PAGE: PAGE with scala.Double = js.native
  /* 5 */ val PAGE_ELEMENT: PAGE_ELEMENT with scala.Double = js.native
  /* 3 */ val TABLE_CELL: TABLE_CELL with scala.Double = js.native
  /* 2 */ val TEXT: TEXT with scala.Double = js.native
  /* 0 */ val UNSUPPORTED: UNSUPPORTED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SelectionType with scala.Double
  ] = js.native
}

