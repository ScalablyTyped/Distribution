package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextBaselineOffset extends js.Object

@JSGlobal("GoogleAppsScript.Slides.TextBaselineOffset")
@js.native
object TextBaselineOffset extends js.Object {
  @js.native
  sealed trait NONE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.TextBaselineOffset
  
  @js.native
  sealed trait SUBSCRIPT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.TextBaselineOffset
  
  @js.native
  sealed trait SUPERSCRIPT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.TextBaselineOffset
  
  @js.native
  sealed trait UNSUPPORTED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.TextBaselineOffset
  
  /* 1 */ val NONE: NONE with scala.Double = js.native
  /* 3 */ val SUBSCRIPT: SUBSCRIPT with scala.Double = js.native
  /* 2 */ val SUPERSCRIPT: SUPERSCRIPT with scala.Double = js.native
  /* 0 */ val UNSUPPORTED: UNSUPPORTED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.TextBaselineOffset with scala.Double
  ] = js.native
}

