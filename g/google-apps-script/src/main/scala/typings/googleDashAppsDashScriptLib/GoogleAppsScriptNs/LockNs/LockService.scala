package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.LockNs

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
  def apply(
    getDocumentLock: js.Function0[Lock],
    getScriptLock: js.Function0[Lock],
    getUserLock: js.Function0[Lock]
  ): LockService = {
    val __obj = js.Dynamic.literal(getDocumentLock = getDocumentLock, getScriptLock = getScriptLock, getUserLock = getUserLock)
  
    __obj.asInstanceOf[LockService]
  }
}

