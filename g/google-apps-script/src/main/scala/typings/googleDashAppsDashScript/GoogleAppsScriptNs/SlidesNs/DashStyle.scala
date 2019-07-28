package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DashStyle extends js.Object

@JSGlobal("GoogleAppsScript.Slides.DashStyle")
@js.native
object DashStyle extends js.Object {
  @js.native
  sealed trait DASH extends DashStyle
  
  @js.native
  sealed trait DASH_DOT extends DashStyle
  
  @js.native
  sealed trait DOT extends DashStyle
  
  @js.native
  sealed trait LONG_DASH extends DashStyle
  
  @js.native
  sealed trait LONG_DASH_DOT extends DashStyle
  
  @js.native
  sealed trait SOLID extends DashStyle
  
  @js.native
  sealed trait UNSUPPORTED extends DashStyle
  
  /* 3 */ val DASH: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.DashStyle.DASH with Double = js.native
  /* 4 */ val DASH_DOT: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.DashStyle.DASH_DOT with Double = js.native
  /* 2 */ val DOT: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.DashStyle.DOT with Double = js.native
  /* 5 */ val LONG_DASH: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.DashStyle.LONG_DASH with Double = js.native
  /* 6 */ val LONG_DASH_DOT: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.DashStyle.LONG_DASH_DOT with Double = js.native
  /* 1 */ val SOLID: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.DashStyle.SOLID with Double = js.native
  /* 0 */ val UNSUPPORTED: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.DashStyle.UNSUPPORTED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DashStyle with Double] = js.native
}

