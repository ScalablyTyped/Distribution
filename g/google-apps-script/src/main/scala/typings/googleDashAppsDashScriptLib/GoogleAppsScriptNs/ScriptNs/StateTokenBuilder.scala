package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateTokenBuilder extends js.Object {
  def createToken(): java.lang.String
  def withArgument(name: java.lang.String, value: java.lang.String): StateTokenBuilder
  def withMethod(method: java.lang.String): StateTokenBuilder
  def withTimeout(seconds: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): StateTokenBuilder
}

object StateTokenBuilder {
  @scala.inline
  def apply(
    createToken: js.Function0[java.lang.String],
    withArgument: js.Function2[java.lang.String, java.lang.String, StateTokenBuilder],
    withMethod: js.Function1[java.lang.String, StateTokenBuilder],
    withTimeout: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, StateTokenBuilder]
  ): StateTokenBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createToken")(createToken)
    __obj.updateDynamic("withArgument")(withArgument)
    __obj.updateDynamic("withMethod")(withMethod)
    __obj.updateDynamic("withTimeout")(withTimeout)
    __obj.asInstanceOf[StateTokenBuilder]
  }
}

