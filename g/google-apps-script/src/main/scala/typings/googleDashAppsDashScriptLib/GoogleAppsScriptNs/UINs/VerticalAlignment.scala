package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VerticalAlignment extends js.Object

@JSGlobal("GoogleAppsScript.UI.VerticalAlignment")
@js.native
object VerticalAlignment extends js.Object {
  @js.native
  sealed trait BOTTOM
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs.VerticalAlignment
  
  @js.native
  sealed trait MIDDLE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs.VerticalAlignment
  
  @js.native
  sealed trait TOP
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs.VerticalAlignment
  
  val BOTTOM: BOTTOM with java.lang.String = js.native
  val MIDDLE: MIDDLE with java.lang.String = js.native
  val TOP: TOP with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs.VerticalAlignment with java.lang.String
  ] = js.native
}

