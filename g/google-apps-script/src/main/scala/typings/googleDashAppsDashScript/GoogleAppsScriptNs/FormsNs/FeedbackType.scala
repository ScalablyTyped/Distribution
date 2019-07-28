package typings.googleDashAppsDashScript.GoogleAppsScriptNs.FormsNs

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
  
  /* 0 */ val CORRECT: typings.googleDashAppsDashScript.GoogleAppsScriptNs.FormsNs.FeedbackType.CORRECT with Double = js.native
  /* 2 */ val GENERAL: typings.googleDashAppsDashScript.GoogleAppsScriptNs.FormsNs.FeedbackType.GENERAL with Double = js.native
  /* 1 */ val INCORRECT: typings.googleDashAppsDashScript.GoogleAppsScriptNs.FormsNs.FeedbackType.INCORRECT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FeedbackType with Double] = js.native
}

