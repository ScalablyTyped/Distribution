package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FeedbackType extends js.Object

@JSGlobal("GoogleAppsScript.Forms.FeedbackType")
@js.native
object FeedbackType extends js.Object {
  @js.native
  sealed trait CORRECT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs.FeedbackType
  
  @js.native
  sealed trait GENERAL
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs.FeedbackType
  
  @js.native
  sealed trait INCORRECT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs.FeedbackType
  
  /* 0 */ val CORRECT: CORRECT with scala.Double = js.native
  /* 2 */ val GENERAL: GENERAL with scala.Double = js.native
  /* 1 */ val INCORRECT: INCORRECT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs.FeedbackType with scala.Double
  ] = js.native
}

