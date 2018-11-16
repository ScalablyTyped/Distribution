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
  
  val CORRECT: CORRECT with java.lang.String = js.native
  val GENERAL: GENERAL with java.lang.String = js.native
  val INCORRECT: INCORRECT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs.FeedbackType with java.lang.String
  ] = js.native
}

