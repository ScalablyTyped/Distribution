package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageType extends js.Object

@JSGlobal("GoogleAppsScript.Sites.PageType")
@js.native
object PageType extends js.Object {
  @js.native
  sealed trait ANNOUNCEMENT extends PageType
  
  @js.native
  sealed trait ANNOUNCEMENTS_PAGE extends PageType
  
  @js.native
  sealed trait FILE_CABINET_PAGE extends PageType
  
  @js.native
  sealed trait LIST_PAGE extends PageType
  
  @js.native
  sealed trait WEB_PAGE extends PageType
  
  /* 2 */ val ANNOUNCEMENT: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SitesNs.PageType.ANNOUNCEMENT with Double = js.native
  /* 3 */ val ANNOUNCEMENTS_PAGE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SitesNs.PageType.ANNOUNCEMENTS_PAGE with Double = js.native
  /* 4 */ val FILE_CABINET_PAGE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SitesNs.PageType.FILE_CABINET_PAGE with Double = js.native
  /* 1 */ val LIST_PAGE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SitesNs.PageType.LIST_PAGE with Double = js.native
  /* 0 */ val WEB_PAGE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SitesNs.PageType.WEB_PAGE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PageType with Double] = js.native
}

