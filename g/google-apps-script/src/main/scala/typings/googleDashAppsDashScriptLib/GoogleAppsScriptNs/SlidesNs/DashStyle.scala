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
  
  val DASH: DASH with java.lang.String = js.native
  val DASH_DOT: DASH_DOT with java.lang.String = js.native
  val DOT: DOT with java.lang.String = js.native
  val LONG_DASH: LONG_DASH with java.lang.String = js.native
  val LONG_DASH_DOT: LONG_DASH_DOT with java.lang.String = js.native
  val SOLID: SOLID with java.lang.String = js.native
  val UNSUPPORTED: UNSUPPORTED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.DashStyle with java.lang.String
  ] = js.native
}

