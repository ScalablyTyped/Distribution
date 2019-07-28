package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VerticalAlignment extends js.Object

@JSGlobal("GoogleAppsScript.UI.VerticalAlignment")
@js.native
object VerticalAlignment extends js.Object {
  @js.native
  sealed trait BOTTOM extends VerticalAlignment
  
  @js.native
  sealed trait MIDDLE extends VerticalAlignment
  
  @js.native
  sealed trait TOP extends VerticalAlignment
  
  /* 2 */ val BOTTOM: typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs.VerticalAlignment.BOTTOM with Double = js.native
  /* 1 */ val MIDDLE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs.VerticalAlignment.MIDDLE with Double = js.native
  /* 0 */ val TOP: typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs.VerticalAlignment.TOP with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VerticalAlignment with Double] = js.native
}

