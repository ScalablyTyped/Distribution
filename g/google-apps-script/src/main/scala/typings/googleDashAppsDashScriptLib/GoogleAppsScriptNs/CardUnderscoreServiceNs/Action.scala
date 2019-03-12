package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  def setFunctionName(functionName: java.lang.String): Action
  def setLoadIndicator(loadIndicator: LoadIndicator): Action
  def setMethodName(functionName: java.lang.String): Action
  def setParameters(parameters: js.Object): Action
}

object Action {
  @scala.inline
  def apply(
    setFunctionName: java.lang.String => Action,
    setLoadIndicator: LoadIndicator => Action,
    setMethodName: java.lang.String => Action,
    setParameters: js.Object => Action
  ): Action = {
    val __obj = js.Dynamic.literal(setFunctionName = js.Any.fromFunction1(setFunctionName), setLoadIndicator = js.Any.fromFunction1(setLoadIndicator), setMethodName = js.Any.fromFunction1(setMethodName), setParameters = js.Any.fromFunction1(setParameters))
  
    __obj.asInstanceOf[Action]
  }
}

