package typings.esfxDisposable

import typings.esfxDisposable.anon.TypeofAsyncDisposableStac
import typings.esfxDisposable.distTypesAsyncDisposableMod.AsyncDisposable
import typings.esfxDisposable.distTypesDisposableMod.Disposable
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAsyncDisposableStackMod {
  
  @JSImport("@esfx/disposable/dist/types/asyncDisposableStack", "AsyncDisposableStack")
  @js.native
  open class AsyncDisposableStack () extends AsyncDisposable {
    
    /**
      * Dispose this object's resources.
      *
      * NOTE: `disposeAsync` returns a bound method, so it can be extracted from `AsyncDisposableStack` and called independently:
      *
      * ```ts
      * const stack = new AsyncDisposableStack();
      * for (const f of files) stack.use(openFile(f));
      * const closeFiles = stack.disposeAsync;
      * ...
      * closeFiles();
      * ```
      */
    def disposeAsync: js.Function0[js.Promise[Unit]] = js.native
    
    /**
      * Moves all resources out of this `AsyncDisposableStack` and into a new `AsyncDisposableStack` and returns it.
      */
    def move(): AsyncDisposableStack = js.native
    
    @JSName(js.Symbol.species)
    var species: js.Function0[TypeofAsyncDisposableStac] = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag: String = js.native
    
    def use(value: Null): Null = js.native
    def use(value: Unit): Unit = js.native
    /**
      * Pushes a new disposable resource onto the disposable stack stack. Resources are disposed in the reverse order they were entered.
      * @param value The resource to add.
      * @returns The resource provided.
      */
    def use(value: AsyncDisposable): AsyncDisposable = js.native
    def use(value: Disposable): Disposable = js.native
    def use[T /* <: js.Function0[Unit | PromiseLike[Unit]] */](value: T): T = js.native
    /**
      * Pushes a new disposable resource onto the disposable stack stack. Resources are disposed in the reverse order they were entered.
      * @param value The resource to add.
      * @param onDispose The operation to perform when the resource is disposed.
      * @returns The resource provided.
      */
    def use[T](value: T, onDisposeAsync: js.Function1[/* value */ T, Unit | PromiseLike[Unit]]): T = js.native
  }
  /* static members */
  object AsyncDisposableStack {
    
    @JSImport("@esfx/disposable/dist/types/asyncDisposableStack", "AsyncDisposableStack")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@esfx/disposable/dist/types/asyncDisposableStack", "AsyncDisposableStack.get")
    @js.native
    def get: Any = js.native
    inline def get_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("get")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.esfxDisposable.distTypesAsyncDisposableMod.AsyncDisposable
    - typings.esfxDisposable.distTypesDisposableMod.Disposable
    - js.Function0[scala.Unit | typings.std.PromiseLike[scala.Unit]]
  */
  type AsyncDisposableLike = _AsyncDisposableLike | (js.Function0[Unit | PromiseLike[Unit]])
  
  trait _AsyncDisposableLike extends StObject
}
