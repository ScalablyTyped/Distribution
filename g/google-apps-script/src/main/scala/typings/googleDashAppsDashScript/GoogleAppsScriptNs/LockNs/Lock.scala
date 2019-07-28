package typings.googleDashAppsDashScript.GoogleAppsScriptNs.LockNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lock extends js.Object {
  def hasLock(): Boolean
  def releaseLock(): Unit
  def tryLock(timeoutInMillis: Integer): Boolean
  def waitLock(timeoutInMillis: Integer): Unit
}

object Lock {
  @scala.inline
  def apply(
    hasLock: () => Boolean,
    releaseLock: () => Unit,
    tryLock: Integer => Boolean,
    waitLock: Integer => Unit
  ): Lock = {
    val __obj = js.Dynamic.literal(hasLock = js.Any.fromFunction0(hasLock), releaseLock = js.Any.fromFunction0(releaseLock), tryLock = js.Any.fromFunction1(tryLock), waitLock = js.Any.fromFunction1(waitLock))
  
    __obj.asInstanceOf[Lock]
  }
}

