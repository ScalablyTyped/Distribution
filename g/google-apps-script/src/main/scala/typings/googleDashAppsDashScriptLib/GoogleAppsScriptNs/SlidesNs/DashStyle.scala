package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DashStyle extends js.Object

@JSGlobal("GoogleAppsScript.Slides.DashStyle")
@js.native
object DashStyle extends js.Object {
  @js.native
  sealed trait DASH
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.DashStyle
  
  @js.native
  sealed trait DASH_DOT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.DashStyle
  
  @js.native
  sealed trait DOT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.DashStyle
  
  @js.native
  sealed trait LONG_DASH
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.DashStyle
  
  @js.native
  sealed trait LONG_DASH_DOT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.DashStyle
  
  @js.native
  sealed trait SOLID
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.DashStyle
  
  @js.native
  sealed trait UNSUPPORTED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.DashStyle
  
  /* 3 */ val DASH: DASH with scala.Double = js.native
  /* 4 */ val DASH_DOT: DASH_DOT with scala.Double = js.native
  /* 2 */ val DOT: DOT with scala.Double = js.native
  /* 5 */ val LONG_DASH: LONG_DASH with scala.Double = js.native
  /* 6 */ val LONG_DASH_DOT: LONG_DASH_DOT with scala.Double = js.native
  /* 1 */ val SOLID: SOLID with scala.Double = js.native
  /* 0 */ val UNSUPPORTED: UNSUPPORTED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.DashStyle with scala.Double
  ] = js.native
}

