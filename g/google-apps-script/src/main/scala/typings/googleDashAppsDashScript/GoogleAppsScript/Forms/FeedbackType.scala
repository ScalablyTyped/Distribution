package typings.googleDashAppsDashScript.GoogleAppsScript.Forms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FeedbackType extends js.Object

@JSGlobal("GoogleAppsScript.Forms.FeedbackType")
@js.native
object FeedbackType extends js.Object {
  @js.native
  sealed trait CORRECT extends FeedbackType
  
  @js.native
  sealed trait GENERAL extends FeedbackType
  
  @js.native
  sealed trait INCORRECT extends FeedbackType
  
  /* 0 */ val CORRECT: typings.googleDashAppsDashScript.GoogleAppsScript.Forms.FeedbackType.CORRECT with Double = js.native
  /* 2 */ val GENERAL: typings.googleDashAppsDashScript.GoogleAppsScript.Forms.FeedbackType.GENERAL with Double = js.native
  /* 1 */ val INCORRECT: typings.googleDashAppsDashScript.GoogleAppsScript.Forms.FeedbackType.INCORRECT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FeedbackType with Double] = js.native
}

