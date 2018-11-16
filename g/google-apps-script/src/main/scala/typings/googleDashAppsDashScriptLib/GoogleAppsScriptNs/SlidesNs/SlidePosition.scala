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
  
  val FIRST_SLIDE: FIRST_SLIDE with java.lang.String = js.native
  val LAST_SLIDE: LAST_SLIDE with java.lang.String = js.native
  val NEXT_SLIDE: NEXT_SLIDE with java.lang.String = js.native
  val PREVIOUS_SLIDE: PREVIOUS_SLIDE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SlidePosition with java.lang.String
  ] = js.native
}

