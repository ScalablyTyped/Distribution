package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AlignmentPosition extends js.Object

@JSGlobal("GoogleAppsScript.Slides.AlignmentPosition")
@js.native
object AlignmentPosition extends js.Object {
  @js.native
  sealed trait CENTER extends AlignmentPosition
  
  @js.native
  sealed trait HORIZONTAL_CENTER extends AlignmentPosition
  
  @js.native
  sealed trait VERTICAL_CENTER extends AlignmentPosition
  
  /* 0 */ val CENTER: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.AlignmentPosition.CENTER with Double = js.native
  /* 1 */ val HORIZONTAL_CENTER: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.AlignmentPosition.HORIZONTAL_CENTER with Double = js.native
  /* 2 */ val VERTICAL_CENTER: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.AlignmentPosition.VERTICAL_CENTER with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AlignmentPosition with Double] = js.native
}

