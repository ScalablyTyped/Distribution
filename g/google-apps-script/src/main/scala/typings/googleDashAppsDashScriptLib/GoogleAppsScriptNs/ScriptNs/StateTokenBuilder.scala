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
    createToken: () => java.lang.String,
    withArgument: (java.lang.String, java.lang.String) => StateTokenBuilder,
    withMethod: java.lang.String => StateTokenBuilder,
    withTimeout: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => StateTokenBuilder
  ): StateTokenBuilder = {
    val __obj = js.Dynamic.literal(createToken = js.Any.fromFunction0(createToken), withArgument = js.Any.fromFunction2(withArgument), withMethod = js.Any.fromFunction1(withMethod), withTimeout = js.Any.fromFunction1(withTimeout))
  
    __obj.asInstanceOf[StateTokenBuilder]
  }
}

