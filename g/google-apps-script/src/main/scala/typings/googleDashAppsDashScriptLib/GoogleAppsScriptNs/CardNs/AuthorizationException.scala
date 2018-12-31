package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizationException extends js.Object {
  def printJson(): java.lang.String
  def setAuthorizationUrl(authUrl: java.lang.String): AuthorizationException
  def setCustomUiCallback(callback: java.lang.String): AuthorizationException
  def setResourceDisplayName(name: java.lang.String): AuthorizationException
  def throwException(): scala.Unit
}

