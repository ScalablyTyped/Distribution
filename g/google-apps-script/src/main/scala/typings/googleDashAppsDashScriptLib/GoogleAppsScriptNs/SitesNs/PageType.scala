package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageType extends js.Object

@JSGlobal("GoogleAppsScript.Sites.PageType")
@js.native
object PageType extends js.Object {
  @js.native
  sealed trait ANNOUNCEMENT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SitesNs.PageType
  
  @js.native
  sealed trait ANNOUNCEMENTS_PAGE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SitesNs.PageType
  
  @js.native
  sealed trait FILE_CABINET_PAGE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SitesNs.PageType
  
  @js.native
  sealed trait LIST_PAGE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SitesNs.PageType
  
  @js.native
  sealed trait WEB_PAGE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SitesNs.PageType
  
  val ANNOUNCEMENT: ANNOUNCEMENT with java.lang.String = js.native
  val ANNOUNCEMENTS_PAGE: ANNOUNCEMENTS_PAGE with java.lang.String = js.native
  val FILE_CABINET_PAGE: FILE_CABINET_PAGE with java.lang.String = js.native
  val LIST_PAGE: LIST_PAGE with java.lang.String = js.native
  val WEB_PAGE: WEB_PAGE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SitesNs.PageType with java.lang.String
  ] = js.native
}

