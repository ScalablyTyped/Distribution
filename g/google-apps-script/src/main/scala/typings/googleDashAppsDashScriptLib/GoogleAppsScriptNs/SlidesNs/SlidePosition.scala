package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SlidePosition extends js.Object

@JSGlobal("GoogleAppsScript.Slides.SlidePosition")
@js.native
object SlidePosition extends js.Object {
  @js.native
  sealed trait FIRST_SLIDE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SlidePosition
  
  @js.native
  sealed trait LAST_SLIDE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SlidePosition
  
  @js.native
  sealed trait NEXT_SLIDE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SlidePosition
  
  @js.native
  sealed trait PREVIOUS_SLIDE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SlidePosition
  
  /* 2 */ val FIRST_SLIDE: FIRST_SLIDE with scala.Double = js.native
  /* 3 */ val LAST_SLIDE: LAST_SLIDE with scala.Double = js.native
  /* 0 */ val NEXT_SLIDE: NEXT_SLIDE with scala.Double = js.native
  /* 1 */ val PREVIOUS_SLIDE: PREVIOUS_SLIDE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SlidePosition with scala.Double
  ] = js.native
}

