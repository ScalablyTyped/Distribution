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
  
  val HOSTED: HOSTED with java.lang.String = js.native
  val WEB: WEB with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SitesNs.AttachmentType with java.lang.String
  ] = js.native
}

