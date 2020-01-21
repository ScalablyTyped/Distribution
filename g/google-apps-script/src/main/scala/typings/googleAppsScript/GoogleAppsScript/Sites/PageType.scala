package typings.googleAppsScript.GoogleAppsScript.Sites

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PageType with Double] = js.native
  /* 2 */ @js.native
  object ANNOUNCEMENT extends TopLevel[ANNOUNCEMENT with Double]
  
  /* 3 */ @js.native
  object ANNOUNCEMENTS_PAGE extends TopLevel[ANNOUNCEMENTS_PAGE with Double]
  
  /* 4 */ @js.native
  object FILE_CABINET_PAGE extends TopLevel[FILE_CABINET_PAGE with Double]
  
  /* 1 */ @js.native
  object LIST_PAGE extends TopLevel[LIST_PAGE with Double]
  
  /* 0 */ @js.native
  object WEB_PAGE extends TopLevel[WEB_PAGE with Double]
  
}

