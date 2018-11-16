package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VerticalAlignment extends js.Object

@JSGlobal("GoogleAppsScript.Document.VerticalAlignment")
@js.native
object VerticalAlignment extends js.Object {
  @js.native
  sealed trait BOTTOM
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs.VerticalAlignment
  
  @js.native
  sealed trait CENTER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs.VerticalAlignment
  
  @js.native
  sealed trait TOP
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs.VerticalAlignment
  
  val BOTTOM: BOTTOM with java.lang.String = js.native
  val CENTER: CENTER with java.lang.String = js.native
  val TOP: TOP with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs.VerticalAlignment with java.lang.String
  ] = js.native
}

