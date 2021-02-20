package typings.firebaseUtil

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscribeMod {
  
  @JSImport("@firebase/util/dist/src/subscribe", "async")
  @js.native
  def async(fn: js.Function): js.Function = js.native
  @JSImport("@firebase/util/dist/src/subscribe", "async")
  @js.native
  def async(fn: js.Function, onError: ErrorFn): js.Function = js.native
  
  @JSImport("@firebase/util/dist/src/subscribe", "createSubscribe")
  @js.native
  def createSubscribe[T](executor: Executor[T]): Subscribe[T] = js.native
  @JSImport("@firebase/util/dist/src/subscribe", "createSubscribe")
  @js.native
  def createSubscribe[T](executor: Executor[T], onNoObservers: Executor[T]): Subscribe[T] = js.native
  
  type CompleteFn = js.Function0[Unit]
  
  type ErrorFn = js.Function1[/* error */ Error, Unit]
  
  type Executor[T] = js.Function1[/* observer */ Observer[T], Unit]
  
  type NextFn[T] = js.Function1[/* value */ T, Unit]
  
  @js.native
  trait Observable[T] extends StObject {
    
    def subscribe(): Unsubscribe = js.native
    def subscribe(next: js.UndefOr[scala.Nothing], error: js.UndefOr[scala.Nothing], complete: CompleteFn): Unsubscribe = js.native
    def subscribe(next: js.UndefOr[scala.Nothing], error: ErrorFn): Unsubscribe = js.native
    def subscribe(next: js.UndefOr[scala.Nothing], error: ErrorFn, complete: CompleteFn): Unsubscribe = js.native
    def subscribe(next: NextFn[T]): Unsubscribe = js.native
    def subscribe(next: NextFn[T], error: js.UndefOr[scala.Nothing], complete: CompleteFn): Unsubscribe = js.native
    def subscribe(next: NextFn[T], error: ErrorFn): Unsubscribe = js.native
    def subscribe(next: NextFn[T], error: ErrorFn, complete: CompleteFn): Unsubscribe = js.native
    def subscribe(observer: PartialObserver[T]): Unsubscribe = js.native
    @JSName("subscribe")
    var subscribe_Original: Subscribe[T] = js.native
  }
  
  @js.native
  trait Observer[T] extends StObject {
    
    def complete(): Unit = js.native
    @JSName("complete")
    var complete_Original: CompleteFn = js.native
    
    def error(error: Error): Unit = js.native
    @JSName("error")
    var error_Original: ErrorFn = js.native
    
    def next(value: T): Unit = js.native
    @JSName("next")
    var next_Original: NextFn[T] = js.native
  }
  
  /* Inlined std.Partial<@firebase/util.@firebase/util/dist/src/subscribe.Observer<T>> */
  @js.native
  trait PartialObserver[T] extends StObject {
    
    var complete: js.UndefOr[CompleteFn] = js.native
    
    var error: js.UndefOr[ErrorFn] = js.native
    
    var next: js.UndefOr[NextFn[T]] = js.native
  }
  object PartialObserver {
    
    @scala.inline
    def apply[T](): PartialObserver[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialObserver[T]]
    }
    
    @scala.inline
    implicit class PartialObserverMutableBuilder[Self <: PartialObserver[_], T] (val x: Self with PartialObserver[T]) extends AnyVal {
      
      @scala.inline
      def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      @scala.inline
      def setError(value: /* error */ Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setNext(value: T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    }
  }
  
  @js.native
  trait Subscribe[T] extends StObject {
    
    def apply(): Unsubscribe = js.native
    def apply(next: js.UndefOr[scala.Nothing], error: js.UndefOr[scala.Nothing], complete: CompleteFn): Unsubscribe = js.native
    def apply(next: js.UndefOr[scala.Nothing], error: ErrorFn): Unsubscribe = js.native
    def apply(next: js.UndefOr[scala.Nothing], error: ErrorFn, complete: CompleteFn): Unsubscribe = js.native
    def apply(next: NextFn[T]): Unsubscribe = js.native
    def apply(next: NextFn[T], error: js.UndefOr[scala.Nothing], complete: CompleteFn): Unsubscribe = js.native
    def apply(next: NextFn[T], error: ErrorFn): Unsubscribe = js.native
    def apply(next: NextFn[T], error: ErrorFn, complete: CompleteFn): Unsubscribe = js.native
    def apply(observer: PartialObserver[T]): Unsubscribe = js.native
  }
  
  type Unsubscribe = js.Function0[Unit]
}
