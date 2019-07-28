package typings.googleDashAppsDashScript.GoogleAppsScriptNs.LockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LockService extends js.Object {
  def getDocumentLock(): Lock
  def getScriptLock(): Lock
  def getUserLock(): Lock
}

object LockService {
  @scala.inline
  def apply(getDocumentLock: () => Lock, getScriptLock: () => Lock, getUserLock: () => Lock): LockService = {
    val __obj = js.Dynamic.literal(getDocumentLock = js.Any.fromFunction0(getDocumentLock), getScriptLock = js.Any.fromFunction0(getScriptLock), getUserLock = js.Any.fromFunction0(getUserLock))
  
    __obj.asInstanceOf[LockService]
  }
}

