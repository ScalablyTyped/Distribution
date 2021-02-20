package typings.googleAppsScript.GoogleAppsScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Lock {
  
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
  trait Lock extends StObject {
    
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
    ): typings.googleAppsScript.GoogleAppsScript.Lock.Lock = {
      val __obj = js.Dynamic.literal(hasLock = js.Any.fromFunction0(hasLock), releaseLock = js.Any.fromFunction0(releaseLock), tryLock = js.Any.fromFunction1(tryLock), waitLock = js.Any.fromFunction1(waitLock))
      __obj.asInstanceOf[typings.googleAppsScript.GoogleAppsScript.Lock.Lock]
    }
    
    @scala.inline
    implicit class LockMutableBuilder[Self <: typings.googleAppsScript.GoogleAppsScript.Lock.Lock] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasLock(value: () => Boolean): Self = StObject.set(x, "hasLock", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReleaseLock(value: () => Unit): Self = StObject.set(x, "releaseLock", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTryLock(value: Integer => Boolean): Self = StObject.set(x, "tryLock", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWaitLock(value: Integer => Unit): Self = StObject.set(x, "waitLock", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Prevents concurrent access to sections of code. This can be useful when you have multiple users
    * or processes modifying a shared resource and want to prevent collisions.
    */
  @js.native
  trait LockService extends StObject {
    
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
    implicit class LockServiceMutableBuilder[Self <: LockService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetDocumentLock(value: () => typings.googleAppsScript.GoogleAppsScript.Lock.Lock): Self = StObject.set(x, "getDocumentLock", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetScriptLock(value: () => typings.googleAppsScript.GoogleAppsScript.Lock.Lock): Self = StObject.set(x, "getScriptLock", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetUserLock(value: () => typings.googleAppsScript.GoogleAppsScript.Lock.Lock): Self = StObject.set(x, "getUserLock", js.Any.fromFunction0(value))
    }
  }
}
