package typings.firebaseDatabase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddExpectedEvents extends StObject {
  
  def addExpectedEvents(moreEvents: js.Any): Unit
  
  var initPromise: js.Promise[js.Any]
  
  var promise: js.Promise[js.Any]
  
  def unregister(): Unit
  
  def waiter(): Boolean
  
  def watchesInitializedWaiter(): Boolean
}
object AddExpectedEvents {
  
  inline def apply(
    addExpectedEvents: js.Any => Unit,
    initPromise: js.Promise[js.Any],
    promise: js.Promise[js.Any],
    unregister: () => Unit,
    waiter: () => Boolean,
    watchesInitializedWaiter: () => Boolean
  ): AddExpectedEvents = {
    val __obj = js.Dynamic.literal(addExpectedEvents = js.Any.fromFunction1(addExpectedEvents), initPromise = initPromise.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], unregister = js.Any.fromFunction0(unregister), waiter = js.Any.fromFunction0(waiter), watchesInitializedWaiter = js.Any.fromFunction0(watchesInitializedWaiter))
    __obj.asInstanceOf[AddExpectedEvents]
  }
  
  extension [Self <: AddExpectedEvents](x: Self) {
    
    inline def setAddExpectedEvents(value: js.Any => Unit): Self = StObject.set(x, "addExpectedEvents", js.Any.fromFunction1(value))
    
    inline def setInitPromise(value: js.Promise[js.Any]): Self = StObject.set(x, "initPromise", value.asInstanceOf[js.Any])
    
    inline def setPromise(value: js.Promise[js.Any]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    
    inline def setUnregister(value: () => Unit): Self = StObject.set(x, "unregister", js.Any.fromFunction0(value))
    
    inline def setWaiter(value: () => Boolean): Self = StObject.set(x, "waiter", js.Any.fromFunction0(value))
    
    inline def setWatchesInitializedWaiter(value: () => Boolean): Self = StObject.set(x, "watchesInitializedWaiter", js.Any.fromFunction0(value))
  }
}
