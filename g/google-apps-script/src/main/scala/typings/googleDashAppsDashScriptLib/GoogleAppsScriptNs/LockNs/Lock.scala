package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.LockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Lock extends js.Object {
  def hasLock(): scala.Boolean
  def releaseLock(): scala.Unit
  def tryLock(timeoutInMillis: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Boolean
  def waitLock(timeoutInMillis: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit
}

