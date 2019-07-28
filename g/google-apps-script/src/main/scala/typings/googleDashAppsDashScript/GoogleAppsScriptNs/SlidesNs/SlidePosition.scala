package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SlidePosition extends js.Object

@JSGlobal("GoogleAppsScript.Slides.SlidePosition")
@js.native
object SlidePosition extends js.Object {
  @js.native
  sealed trait FIRST_SLIDE extends SlidePosition
  
  @js.native
  sealed trait LAST_SLIDE extends SlidePosition
  
  @js.native
  sealed trait NEXT_SLIDE extends SlidePosition
  
  @js.native
  sealed trait PREVIOUS_SLIDE extends SlidePosition
  
  /* 2 */ val FIRST_SLIDE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SlidePosition.FIRST_SLIDE with Double = js.native
  /* 3 */ val LAST_SLIDE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SlidePosition.LAST_SLIDE with Double = js.native
  /* 0 */ val NEXT_SLIDE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SlidePosition.NEXT_SLIDE with Double = js.native
  /* 1 */ val PREVIOUS_SLIDE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SlidePosition.PREVIOUS_SLIDE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SlidePosition with Double] = js.native
}

