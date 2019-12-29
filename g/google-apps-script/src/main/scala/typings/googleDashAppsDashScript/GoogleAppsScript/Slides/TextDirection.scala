package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextDirection with Double] = js.native
  /* 1 */ @js.native
  object LEFT_TO_RIGHT extends TopLevel[LEFT_TO_RIGHT with Double]
  
  /* 2 */ @js.native
  object RIGHT_TO_LEFT extends TopLevel[RIGHT_TO_LEFT with Double]
  
  /* 0 */ @js.native
  object UNSUPPORTED extends TopLevel[UNSUPPORTED with Double]
  
}

