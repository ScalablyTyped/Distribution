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
  
  /* 2 */ val ANNOUNCEMENT: ANNOUNCEMENT with scala.Double = js.native
  /* 3 */ val ANNOUNCEMENTS_PAGE: ANNOUNCEMENTS_PAGE with scala.Double = js.native
  /* 4 */ val FILE_CABINET_PAGE: FILE_CABINET_PAGE with scala.Double = js.native
  /* 1 */ val LIST_PAGE: LIST_PAGE with scala.Double = js.native
  /* 0 */ val WEB_PAGE: WEB_PAGE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SitesNs.PageType with scala.Double
  ] = js.native
}

