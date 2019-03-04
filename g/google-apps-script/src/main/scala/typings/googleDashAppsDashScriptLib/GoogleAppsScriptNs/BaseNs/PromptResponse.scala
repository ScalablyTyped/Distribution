package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromptResponse extends js.Object {
  def getResponseText(): java.lang.String
  def getSelectedButton(): Button
}

object PromptResponse {
  @scala.inline
  def apply(getResponseText: js.Function0[java.lang.String], getSelectedButton: js.Function0[Button]): PromptResponse = {
    val __obj = js.Dynamic.literal(getResponseText = getResponseText, getSelectedButton = getSelectedButton)
  
    __obj.asInstanceOf[PromptResponse]
  }
}

