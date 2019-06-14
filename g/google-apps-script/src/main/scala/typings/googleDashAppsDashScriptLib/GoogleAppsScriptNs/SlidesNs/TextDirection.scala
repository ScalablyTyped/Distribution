package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextDirection extends js.Object

@JSGlobal("GoogleAppsScript.Slides.TextDirection")
@js.native
object TextDirection extends js.Object {
  @js.native
  sealed trait LEFT_TO_RIGHT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.TextDirection
  
  @js.native
  sealed trait RIGHT_TO_LEFT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.TextDirection
  
  @js.native
  sealed trait UNSUPPORTED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.TextDirection
  
  /* 1 */ val LEFT_TO_RIGHT: LEFT_TO_RIGHT with scala.Double = js.native
  /* 2 */ val RIGHT_TO_LEFT: RIGHT_TO_LEFT with scala.Double = js.native
  /* 0 */ val UNSUPPORTED: UNSUPPORTED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.TextDirection with scala.Double
  ] = js.native
}

