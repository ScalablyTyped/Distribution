package typings.atFirebaseDatabase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddExpectedEvents extends js.Object {
  var initPromise: js.Promise[_]
  var promise: js.Promise[_]
  def addExpectedEvents(moreEvents: js.Any): Unit
  def unregister(): Unit
  def waiter(): Boolean
  def watchesInitializedWaiter(): Boolean
}

object Anon_AddExpectedEvents {
  @scala.inline
  def apply(
    addExpectedEvents: js.Any => Unit,
    initPromise: js.Promise[_],
    promise: js.Promise[_],
    unregister: () => Unit,
    waiter: () => Boolean,
    watchesInitializedWaiter: () => Boolean
  ): Anon_AddExpectedEvents = {
    val __obj = js.Dynamic.literal(addExpectedEvents = js.Any.fromFunction1(addExpectedEvents), initPromise = initPromise.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], unregister = js.Any.fromFunction0(unregister), waiter = js.Any.fromFunction0(waiter), watchesInitializedWaiter = js.Any.fromFunction0(watchesInitializedWaiter))
  
    __obj.asInstanceOf[Anon_AddExpectedEvents]
  }
}

