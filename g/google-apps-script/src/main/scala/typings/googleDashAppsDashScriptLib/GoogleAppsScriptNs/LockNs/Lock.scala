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

object Lock {
  @scala.inline
  def apply(
    hasLock: js.Function0[scala.Boolean],
    releaseLock: js.Function0[scala.Unit],
    tryLock: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, scala.Boolean],
    waitLock: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, scala.Unit]
  ): Lock = {
    val __obj = js.Dynamic.literal(hasLock = hasLock, releaseLock = releaseLock, tryLock = tryLock, waitLock = waitLock)
  
    __obj.asInstanceOf[Lock]
  }
}

