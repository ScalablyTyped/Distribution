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
    hasLock: () => scala.Boolean,
    releaseLock: () => scala.Unit,
    tryLock: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => scala.Boolean,
    waitLock: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => scala.Unit
  ): Lock = {
    val __obj = js.Dynamic.literal(hasLock = js.Any.fromFunction0(hasLock), releaseLock = js.Any.fromFunction0(releaseLock), tryLock = js.Any.fromFunction1(tryLock), waitLock = js.Any.fromFunction1(waitLock))
  
    __obj.asInstanceOf[Lock]
  }
}

