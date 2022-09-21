package typings.firebaseUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSubscribeMod {
  
  @JSImport("@firebase/util/dist/src/subscribe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def async(fn: js.Function): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("async")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  inline def async(fn: js.Function, onError: ErrorFn): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(fn.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  inline def createSubscribe[T](executor: Executor[T]): Subscribe[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSubscribe")(executor.asInstanceOf[js.Any]).asInstanceOf[Subscribe[T]]
  inline def createSubscribe[T](executor: Executor[T], onNoObservers: Executor[T]): Subscribe[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSubscribe")(executor.asInstanceOf[js.Any], onNoObservers.asInstanceOf[js.Any])).asInstanceOf[Subscribe[T]]
  
  type CompleteFn = js.Function0[Unit]
  
  type ErrorFn = js.Function1[/* error */ js.Error, Unit]
  
  type Executor[T] = js.Function1[/* observer */ Observer[T], Unit]
  
  type NextFn[T] = js.Function1[/* value */ T, Unit]
  
  trait Observable[T] extends StObject {
    
    def subscribe(): Unsubscribe
    def subscribe(next: Unit, error: Unit, complete: CompleteFn): Unsubscribe
    def subscribe(next: Unit, error: ErrorFn): Unsubscribe
    def subscribe(next: Unit, error: ErrorFn, complete: CompleteFn): Unsubscribe
    def subscribe(next: NextFn[T]): Unsubscribe
    def subscribe(next: NextFn[T], error: Unit, complete: CompleteFn): Unsubscribe
    def subscribe(next: NextFn[T], error: ErrorFn): Unsubscribe
    def subscribe(next: NextFn[T], error: ErrorFn, complete: CompleteFn): Unsubscribe
    def subscribe(observer: PartialObserver[T]): Unsubscribe
    @JSName("subscribe")
    var subscribe_Original: Subscribe[T]
  }
  object Observable {
    
    inline def apply[T](subscribe: Subscribe[T]): Observable[T] = {
      val __obj = js.Dynamic.literal(subscribe = subscribe.asInstanceOf[js.Any])
      __obj.asInstanceOf[Observable[T]]
    }
    
    extension [Self <: Observable[?], T](x: Self & Observable[T]) {
      
      inline def setSubscribe(value: Subscribe[T]): Self = StObject.set(x, "subscribe", value.asInstanceOf[js.Any])
    }
  }
  
  trait Observer[T] extends StObject {
    
    def complete(): Unit
    @JSName("complete")
    var complete_Original: CompleteFn
    
    def error(error: js.Error): Unit
    @JSName("error")
    var error_Original: ErrorFn
    
    def next(value: T): Unit
    @JSName("next")
    var next_Original: NextFn[T]
  }
  object Observer {
    
    inline def apply[T](complete: () => Unit, error: /* error */ js.Error => Unit, next: T => Unit): Observer[T] = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), error = js.Any.fromFunction1(error), next = js.Any.fromFunction1(next))
      __obj.asInstanceOf[Observer[T]]
    }
    
    extension [Self <: Observer[?], T](x: Self & Observer[T]) {
      
      inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      inline def setError(value: /* error */ js.Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setNext(value: T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Partial<@firebase/util.@firebase/util/dist/src/subscribe.Observer<T>> */
  trait PartialObserver[T] extends StObject {
    
    var complete: js.UndefOr[CompleteFn] = js.undefined
    
    var error: js.UndefOr[ErrorFn] = js.undefined
    
    var next: js.UndefOr[NextFn[T]] = js.undefined
  }
  object PartialObserver {
    
    inline def apply[T](): PartialObserver[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialObserver[T]]
    }
    
    extension [Self <: PartialObserver[?], T](x: Self & PartialObserver[T]) {
      
      inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setError(value: /* error */ js.Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setNext(value: T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    }
  }
  
  @js.native
  trait Subscribe[T] extends StObject {
    
    def apply(): Unsubscribe = js.native
    def apply(next: Unit, error: Unit, complete: CompleteFn): Unsubscribe = js.native
    def apply(next: Unit, error: ErrorFn): Unsubscribe = js.native
    def apply(next: Unit, error: ErrorFn, complete: CompleteFn): Unsubscribe = js.native
    def apply(next: NextFn[T]): Unsubscribe = js.native
    def apply(next: NextFn[T], error: Unit, complete: CompleteFn): Unsubscribe = js.native
    def apply(next: NextFn[T], error: ErrorFn): Unsubscribe = js.native
    def apply(next: NextFn[T], error: ErrorFn, complete: CompleteFn): Unsubscribe = js.native
    def apply(observer: PartialObserver[T]): Unsubscribe = js.native
  }
  
  type Unsubscribe = js.Function0[Unit]
}
