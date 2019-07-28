package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextBaselineOffset extends js.Object

@JSGlobal("GoogleAppsScript.Slides.TextBaselineOffset")
@js.native
object TextBaselineOffset extends js.Object {
  @js.native
  sealed trait NONE extends TextBaselineOffset
  
  @js.native
  sealed trait SUBSCRIPT extends TextBaselineOffset
  
  @js.native
  sealed trait SUPERSCRIPT extends TextBaselineOffset
  
  @js.native
  sealed trait UNSUPPORTED extends TextBaselineOffset
  
  /* 1 */ val NONE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.TextBaselineOffset.NONE with Double = js.native
  /* 3 */ val SUBSCRIPT: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.TextBaselineOffset.SUBSCRIPT with Double = js.native
  /* 2 */ val SUPERSCRIPT: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.TextBaselineOffset.SUPERSCRIPT with Double = js.native
  /* 0 */ val UNSUPPORTED: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.TextBaselineOffset.UNSUPPORTED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextBaselineOffset with Double] = js.native
}

