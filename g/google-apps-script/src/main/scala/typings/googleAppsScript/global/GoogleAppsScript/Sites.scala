package typings.googleAppsScript.global.GoogleAppsScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GoogleAppsScript.Sites")
@js.native
object Sites extends js.Object {
  /**
    * A typesafe enum for sites attachment type.
    * A rebuilt
    * version of Sites was launched on November 22, 2016. Apps Script cannot currently access or
    * modify Sites made with this version, but script can still access
    * classic Sites.
    */
  @js.native
  object AttachmentType extends js.Object {
    /* 1 */ val HOSTED: typings.googleAppsScript.GoogleAppsScript.Sites.AttachmentType.HOSTED with Double = js.native
    /* 0 */ val WEB: typings.googleAppsScript.GoogleAppsScript.Sites.AttachmentType.WEB with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Sites.AttachmentType with Double] = js.native
  }
  
  /**
    * A typesafe enum for sites page type.
    * A rebuilt
    * version of Sites was launched on November 22, 2016. Apps Script cannot currently access or
    * modify Sites made with this version, but script can still access
    * classic Sites.
    */
  @js.native
  object PageType extends js.Object {
    /* 2 */ val ANNOUNCEMENT: typings.googleAppsScript.GoogleAppsScript.Sites.PageType.ANNOUNCEMENT with Double = js.native
    /* 3 */ val ANNOUNCEMENTS_PAGE: typings.googleAppsScript.GoogleAppsScript.Sites.PageType.ANNOUNCEMENTS_PAGE with Double = js.native
    /* 4 */ val FILE_CABINET_PAGE: typings.googleAppsScript.GoogleAppsScript.Sites.PageType.FILE_CABINET_PAGE with Double = js.native
    /* 1 */ val LIST_PAGE: typings.googleAppsScript.GoogleAppsScript.Sites.PageType.LIST_PAGE with Double = js.native
    /* 0 */ val WEB_PAGE: typings.googleAppsScript.GoogleAppsScript.Sites.PageType.WEB_PAGE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Sites.PageType with Double] = js.native
  }
  
}

