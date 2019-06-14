package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AttachmentType extends js.Object

@JSGlobal("GoogleAppsScript.Sites.AttachmentType")
@js.native
object AttachmentType extends js.Object {
  @js.native
  sealed trait HOSTED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SitesNs.AttachmentType
  
  @js.native
  sealed trait WEB
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SitesNs.AttachmentType
  
  /* 1 */ val HOSTED: HOSTED with scala.Double = js.native
  /* 0 */ val WEB: WEB with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SitesNs.AttachmentType with scala.Double
  ] = js.native
}

