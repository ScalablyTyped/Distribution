package typings.googleDashAppsDashScript.GoogleAppsScript.Sites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AttachmentType extends js.Object

/**
  * A typesafe enum for sites attachment type.
  * A rebuilt
  * version of Sites was launched on November 22, 2016. Apps Script cannot currently access or
  * modify Sites made with this version, but script can still access
  * classic Sites.
  */
@JSGlobal("GoogleAppsScript.Sites.AttachmentType")
@js.native
object AttachmentType extends js.Object {
  @js.native
  sealed trait HOSTED extends AttachmentType
  
  @js.native
  sealed trait WEB extends AttachmentType
  
  /* 1 */ val HOSTED: typings.googleDashAppsDashScript.GoogleAppsScript.Sites.AttachmentType.HOSTED with Double = js.native
  /* 0 */ val WEB: typings.googleDashAppsDashScript.GoogleAppsScript.Sites.AttachmentType.WEB with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AttachmentType with Double] = js.native
}

