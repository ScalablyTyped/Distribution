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

