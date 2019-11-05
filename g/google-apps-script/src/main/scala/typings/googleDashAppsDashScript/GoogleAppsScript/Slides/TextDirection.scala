package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextDirection extends js.Object

/**
  * The directions text can flow in.
  */
@JSGlobal("GoogleAppsScript.Slides.TextDirection")
@js.native
object TextDirection extends js.Object {
  @js.native
  sealed trait LEFT_TO_RIGHT extends TextDirection
  
  @js.native
  sealed trait RIGHT_TO_LEFT extends TextDirection
  
  @js.native
  sealed trait UNSUPPORTED extends TextDirection
  
  /* 1 */ val LEFT_TO_RIGHT: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.TextDirection.LEFT_TO_RIGHT with Double = js.native
  /* 2 */ val RIGHT_TO_LEFT: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.TextDirection.RIGHT_TO_LEFT with Double = js.native
  /* 0 */ val UNSUPPORTED: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.TextDirection.UNSUPPORTED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextDirection with Double] = js.native
}

