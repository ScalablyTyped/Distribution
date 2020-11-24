package typings.firebaseDatabase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddExpectedEvents extends js.Object {
  
  def addExpectedEvents(moreEvents: js.Any): Unit = js.native
  
  var initPromise: js.Promise[_] = js.native
  
  var promise: js.Promise[_] = js.native
  
  def unregister(): Unit = js.native
  
  def waiter(): Boolean = js.native
  
  def watchesInitializedWaiter(): Boolean = js.native
}
object AddExpectedEvents {
  
  @scala.inline
  def apply(
    addExpectedEvents: js.Any => Unit,
    initPromise: js.Promise[_],
    promise: js.Promise[_],
    unregister: () => Unit,
    waiter: () => Boolean,
    watchesInitializedWaiter: () => Boolean
  ): AddExpectedEvents = {
    val __obj = js.Dynamic.literal(addExpectedEvents = js.Any.fromFunction1(addExpectedEvents), initPromise = initPromise.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], unregister = js.Any.fromFunction0(unregister), waiter = js.Any.fromFunction0(waiter), watchesInitializedWaiter = js.Any.fromFunction0(watchesInitializedWaiter))
    __obj.asInstanceOf[AddExpectedEvents]
  }
  
  @scala.inline
  implicit class AddExpectedEventsOps[Self <: AddExpectedEvents] (val x: Self) extends AnyVal {
    
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
    def setAddExpectedEvents(value: js.Any => Unit): Self = this.set("addExpectedEvents", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitPromise(value: js.Promise[_]): Self = this.set("initPromise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromise(value: js.Promise[_]): Self = this.set("promise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnregister(value: () => Unit): Self = this.set("unregister", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWaiter(value: () => Boolean): Self = this.set("waiter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWatchesInitializedWaiter(value: () => Boolean): Self = this.set("watchesInitializedWaiter", js.Any.fromFunction0(value))
  }
}
