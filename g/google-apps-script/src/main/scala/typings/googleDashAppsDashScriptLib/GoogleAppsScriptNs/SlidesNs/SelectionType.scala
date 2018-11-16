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
  
  val CURRENT_PAGE: CURRENT_PAGE with java.lang.String = js.native
  val NONE: NONE with java.lang.String = js.native
  val PAGE: PAGE with java.lang.String = js.native
  val PAGE_ELEMENT: PAGE_ELEMENT with java.lang.String = js.native
  val TABLE_CELL: TABLE_CELL with java.lang.String = js.native
  val TEXT: TEXT with java.lang.String = js.native
  val UNSUPPORTED: UNSUPPORTED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SelectionType with java.lang.String
  ] = js.native
}

