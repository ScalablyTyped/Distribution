package typings.googleAppsScript.GoogleAppsScript.Sites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
