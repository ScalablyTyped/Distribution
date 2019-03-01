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
    setFunctionName: js.Function1[java.lang.String, Action],
    setLoadIndicator: js.Function1[LoadIndicator, Action],
    setMethodName: js.Function1[java.lang.String, Action],
    setParameters: js.Function1[js.Object, Action]
  ): Action = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setFunctionName")(setFunctionName)
    __obj.updateDynamic("setLoadIndicator")(setLoadIndicator)
    __obj.updateDynamic("setMethodName")(setMethodName)
    __obj.updateDynamic("setParameters")(setParameters)
    __obj.asInstanceOf[Action]
  }
}

