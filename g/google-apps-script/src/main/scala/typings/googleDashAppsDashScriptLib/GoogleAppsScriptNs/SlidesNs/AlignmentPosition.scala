package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AlignmentPosition extends js.Object

@JSGlobal("GoogleAppsScript.Slides.AlignmentPosition")
@js.native
object AlignmentPosition extends js.Object {
  @js.native
  sealed trait CENTER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.AlignmentPosition
  
  @js.native
  sealed trait HORIZONTAL_CENTER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.AlignmentPosition
  
  @js.native
  sealed trait VERTICAL_CENTER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.AlignmentPosition
  
  /* 0 */ val CENTER: CENTER with scala.Double = js.native
  /* 1 */ val HORIZONTAL_CENTER: HORIZONTAL_CENTER with scala.Double = js.native
  /* 2 */ val VERTICAL_CENTER: VERTICAL_CENTER with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.AlignmentPosition with scala.Double
  ] = js.native
}

