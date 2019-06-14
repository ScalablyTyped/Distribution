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
  
  /* 2 */ val BOTTOM: BOTTOM with scala.Double = js.native
  /* 1 */ val MIDDLE: MIDDLE with scala.Double = js.native
  /* 0 */ val TOP: TOP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs.VerticalAlignment with scala.Double
  ] = js.native
}

