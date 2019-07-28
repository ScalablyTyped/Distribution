package typings.googleDashAppsDashScript.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  def setFunctionName(functionName: String): Action
  def setLoadIndicator(loadIndicator: LoadIndicator): Action
  def setMethodName(functionName: String): Action
  def setParameters(parameters: js.Object): Action
}

object Action {
  @scala.inline
  def apply(
    setFunctionName: String => Action,
    setLoadIndicator: LoadIndicator => Action,
    setMethodName: String => Action,
    setParameters: js.Object => Action
  ): Action = {
    val __obj = js.Dynamic.literal(setFunctionName = js.Any.fromFunction1(setFunctionName), setLoadIndicator = js.Any.fromFunction1(setLoadIndicator), setMethodName = js.Any.fromFunction1(setMethodName), setParameters = js.Any.fromFunction1(setParameters))
  
    __obj.asInstanceOf[Action]
  }
}

