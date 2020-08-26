package typings.googleAppsScript.GoogleAppsScript.Lock

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of a mutual-exclusion lock.
  *
  * This class allows scripts to make sure that only one instance of the script is executing a
  * given section of code at a time. This is particularly useful for callbacks and triggers, where a
  * user action may cause changes to a shared resource and you want to ensure that aren't collisions.
  *
  * The following examples shows how to use a lock in a form submit handler.
  *
  *     // Generates a unique ticket number for every form submission.
  *     function onFormSubmit(e) {
  *       var targetCell = e.range.offset(0, e.range.getNumColumns(), 1, 1);
  *
  *       // Get a script lock, because we're about to modify a shared resource.
  *       var lock = LockService.getScriptLock();
  *       // Wait for up to 30 seconds for other processes to finish.
  *       lock.waitLock(30000);
  *
  *       var ticketNumber = Number(ScriptProperties.getProperty('lastTicketNumber')) + 1;
  *       ScriptProperties.setProperty('lastTicketNumber', ticketNumber);
  *
  *       // Release the lock so that other processes can continue.
  *       lock.releaseLock();
  *
  *       targetCell.setValue(ticketNumber);
  *     }
  *
  * lastTicketNumber
  * ScriptProperties
  */
@js.native
trait Lock extends js.Object {
  def hasLock(): Boolean = js.native
  def releaseLock(): Unit = js.native
  def tryLock(timeoutInMillis: Integer): Boolean = js.native
  def waitLock(timeoutInMillis: Integer): Unit = js.native
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
  @scala.inline
  implicit class LockOps[Self <: typings.googleAppsScript.GoogleAppsScript.Lock.Lock] (val x: Self) extends AnyVal {
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
    def setHasLock(value: () => Boolean): Self = this.set("hasLock", js.Any.fromFunction0(value))
    @scala.inline
    def setReleaseLock(value: () => Unit): Self = this.set("releaseLock", js.Any.fromFunction0(value))
    @scala.inline
    def setTryLock(value: Integer => Boolean): Self = this.set("tryLock", js.Any.fromFunction1(value))
    @scala.inline
    def setWaitLock(value: Integer => Unit): Self = this.set("waitLock", js.Any.fromFunction1(value))
  }
  
}

