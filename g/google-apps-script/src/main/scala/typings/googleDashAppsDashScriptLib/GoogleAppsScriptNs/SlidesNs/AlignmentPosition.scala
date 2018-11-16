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
  
  val CENTER: CENTER with java.lang.String = js.native
  val HORIZONTAL_CENTER: HORIZONTAL_CENTER with java.lang.String = js.native
  val VERTICAL_CENTER: VERTICAL_CENTER with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.AlignmentPosition with java.lang.String
  ] = js.native
}

