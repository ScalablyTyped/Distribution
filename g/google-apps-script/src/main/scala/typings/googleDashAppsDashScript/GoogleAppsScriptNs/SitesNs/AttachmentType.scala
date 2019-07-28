package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AttachmentType extends js.Object

@JSGlobal("GoogleAppsScript.Sites.AttachmentType")
@js.native
object AttachmentType extends js.Object {
  @js.native
  sealed trait HOSTED extends AttachmentType
  
  @js.native
  sealed trait WEB extends AttachmentType
  
  /* 1 */ val HOSTED: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SitesNs.AttachmentType.HOSTED with Double = js.native
  /* 0 */ val WEB: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SitesNs.AttachmentType.WEB with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AttachmentType with Double] = js.native
}

