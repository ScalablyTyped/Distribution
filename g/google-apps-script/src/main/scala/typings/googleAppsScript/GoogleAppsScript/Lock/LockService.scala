package typings.googleAppsScript.GoogleAppsScript.Lock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Prevents concurrent access to sections of code. This can be useful when you have multiple users
  * or processes modifying a shared resource and want to prevent collisions.
  */
@js.native
trait LockService extends js.Object {
  
  def getDocumentLock(): typings.googleAppsScript.GoogleAppsScript.Lock.Lock = js.native
  
  def getScriptLock(): typings.googleAppsScript.GoogleAppsScript.Lock.Lock = js.native
  
  def getUserLock(): typings.googleAppsScript.GoogleAppsScript.Lock.Lock = js.native
}
object LockService {
  
  @scala.inline
  def apply(
    getDocumentLock: () => typings.googleAppsScript.GoogleAppsScript.Lock.Lock,
    getScriptLock: () => typings.googleAppsScript.GoogleAppsScript.Lock.Lock,
    getUserLock: () => typings.googleAppsScript.GoogleAppsScript.Lock.Lock
  ): LockService = {
    val __obj = js.Dynamic.literal(getDocumentLock = js.Any.fromFunction0(getDocumentLock), getScriptLock = js.Any.fromFunction0(getScriptLock), getUserLock = js.Any.fromFunction0(getUserLock))
    __obj.asInstanceOf[LockService]
  }
  
  @scala.inline
  implicit class LockServiceOps[Self <: LockService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetDocumentLock(value: () => typings.googleAppsScript.GoogleAppsScript.Lock.Lock): Self = this.set("getDocumentLock", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScriptLock(value: () => typings.googleAppsScript.GoogleAppsScript.Lock.Lock): Self = this.set("getScriptLock", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUserLock(value: () => typings.googleAppsScript.GoogleAppsScript.Lock.Lock): Self = this.set("getUserLock", js.Any.fromFunction0(value))
  }
}
