package typings.emberTestWaiters

import org.scalablytyped.runtime.StringDictionary
import typings.emberTestWaiters.emberTestWaitersBooleans.`true`
import typings.rsvp.mod.default.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packageTypesMod {
  
  trait PendingWaiterState extends StObject {
    
    var pending: Double
    
    var waiters: StringDictionary[js.Array[TestWaiterDebugInfo] | `true`]
  }
  object PendingWaiterState {
    
    inline def apply(pending: Double, waiters: StringDictionary[js.Array[TestWaiterDebugInfo] | `true`]): PendingWaiterState = {
      val __obj = js.Dynamic.literal(pending = pending.asInstanceOf[js.Any], waiters = waiters.asInstanceOf[js.Any])
      __obj.asInstanceOf[PendingWaiterState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PendingWaiterState] (val x: Self) extends AnyVal {
      
      inline def setPending(value: Double): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setWaiters(value: StringDictionary[js.Array[TestWaiterDebugInfo] | `true`]): Self = StObject.set(x, "waiters", value.asInstanceOf[js.Any])
    }
  }
  
  type Primitive = String | Double | Boolean | js.Symbol | js.BigInt
  
  type PromiseType[T] = js.Promise[T] | Promise[T]
  
  @js.native
  trait TestWaiter[T /* <: js.Object | Primitive | Any */]
    extends StObject
       with Waiter {
    
    /**
      * Should be used to signal the beginning of an async operation that
      * is to be waited for. Invocation of this method should be paired with a subsequent
      * `endAsync` call to indicate to the waiter system that the async operation is completed.
      *
      * @public
      * @method beginAsync
      * @param item {T} The item to register for waiting
      * @param label {string} An optional label to identify the item
      */
    def beginAsync(): T = js.native
    def beginAsync(token: T): T = js.native
    def beginAsync(token: T, label: String): T = js.native
    def beginAsync(token: Unit, label: String): T = js.native
    
    /**
      * Should be used to signal the end of an async operation. Invocation of this
      * method should be paired with a preceding `beginAsync` call from this instance,
      * which would indicate the beginning of an async operation.
      *
      * @public
      * @method endAsync
      * @param item {T} The item to that was registered for waiting
      */
    def endAsync(token: T): Unit = js.native
    
    /**
      * Resets the waiter state, clearing items tracking async operations in this waiter.
      *
      * @public
      * @method reset
      */
    def reset(): Unit = js.native
  }
  
  trait TestWaiterDebugInfo extends StObject {
    
    var label: js.UndefOr[String] = js.undefined
    
    var stack: js.UndefOr[String] = js.undefined
  }
  object TestWaiterDebugInfo {
    
    inline def apply(): TestWaiterDebugInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TestWaiterDebugInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TestWaiterDebugInfo] (val x: Self) extends AnyVal {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  @js.native
  trait Thenable[T, Return /* <: PromiseType[T] */] extends StObject {
    
    def `then`(resolve: js.Function1[/* value */ T, T]): Return = js.native
    def `then`(resolve: js.Function1[/* value */ T, T], reject: js.Function1[/* error */ js.Error, T]): Return = js.native
  }
  
  type Token = Primitive | Any
  
  trait Waiter extends StObject {
    
    /**
      * Returns the `debugInfo` for each item tracking async operations in this waiter.
      *
      * @public
      * @method debugInfo
      * @returns {TestWaiterDebugInfo}
      */
    def debugInfo(): js.Array[TestWaiterDebugInfo]
    
    /**
      * A string representing the test waiter name.
      *
      * @public
      * @property name {WaiterName}
      */
    var name: WaiterName
    
    /**
      * Used to determine if the waiter system should still wait for async
      * operations to complete.
      *
      * @public
      * @method waitUntil
      * @returns {boolean}
      */
    def waitUntil(): Boolean
  }
  object Waiter {
    
    inline def apply(debugInfo: () => js.Array[TestWaiterDebugInfo], name: WaiterName, waitUntil: () => Boolean): Waiter = {
      val __obj = js.Dynamic.literal(debugInfo = js.Any.fromFunction0(debugInfo), name = name.asInstanceOf[js.Any], waitUntil = js.Any.fromFunction0(waitUntil))
      __obj.asInstanceOf[Waiter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Waiter] (val x: Self) extends AnyVal {
      
      inline def setDebugInfo(value: () => js.Array[TestWaiterDebugInfo]): Self = StObject.set(x, "debugInfo", js.Any.fromFunction0(value))
      
      inline def setName(value: WaiterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setWaitUntil(value: () => Boolean): Self = StObject.set(x, "waitUntil", js.Any.fromFunction0(value))
    }
  }
  
  type WaiterName = String
}
