package typings.googleDashAppsDashScript.GoogleAppsScript.Sites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageType extends js.Object

/**
  * A typesafe enum for sites page type.
  * A rebuilt
  * version of Sites was launched on November 22, 2016. Apps Script cannot currently access or
  * modify Sites made with this version, but script can still access
  * classic Sites.
  */
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
  
  /* 2 */ val ANNOUNCEMENT: typings.googleDashAppsDashScript.GoogleAppsScript.Sites.PageType.ANNOUNCEMENT with Double = js.native
  /* 3 */ val ANNOUNCEMENTS_PAGE: typings.googleDashAppsDashScript.GoogleAppsScript.Sites.PageType.ANNOUNCEMENTS_PAGE with Double = js.native
  /* 4 */ val FILE_CABINET_PAGE: typings.googleDashAppsDashScript.GoogleAppsScript.Sites.PageType.FILE_CABINET_PAGE with Double = js.native
  /* 1 */ val LIST_PAGE: typings.googleDashAppsDashScript.GoogleAppsScript.Sites.PageType.LIST_PAGE with Double = js.native
  /* 0 */ val WEB_PAGE: typings.googleDashAppsDashScript.GoogleAppsScript.Sites.PageType.WEB_PAGE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PageType with Double] = js.native
}

