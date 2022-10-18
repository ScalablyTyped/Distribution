package typings.esfxDisposable

import typings.esfxDisposable.anon.TypeofDisposableStack
import typings.esfxDisposable.distTypesDisposableMod.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDisposableStackMod {
  
  @JSImport("@esfx/disposable/dist/types/disposableStack", "DisposableStack")
  @js.native
  /**
    * Creates a new DisposableStack.
    */
  open class DisposableStack () extends StObject {
    
    /**
      * Dispose this object's resources.
      *
      * NOTE: `dispose` returns a bound method, so it can be extracted from `DisposableStack` and called independently:
      *
      * ```ts
      * const stack = new DisposableStack();
      * for (const f of files) stack.use(openFile(f));
      * const closeFiles = stack.dispose;
      * ...
      * closeFiles();
      * ```
      */
    def dispose: js.Function0[Unit] = js.native
    
    /**
      * Moves all resources out of this `DisposableStack` and into a new `DisposableStack` and returns it.
      */
    def move(): DisposableStack = js.native
    
    @JSName(js.Symbol.species)
    var species: js.Function0[TypeofDisposableStack] = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag: String = js.native
    
    /**
      * Pushes a new disposable resource onto the disposable stack stack. Resources are disposed in the reverse order they were entered.
      * @param value The resource to add.
      * @returns The resource provided.
      */
    def use[T /* <: js.UndefOr[DisposableLike | Null] */](value: T): T = js.native
    /**
      * Pushes a new disposable resource onto the disposable stack stack. Resources are disposed in the reverse order they were entered.
      * @param value The resource to add.
      * @param onDispose The operation to perform when the resource is disposed.
      * @returns The resource provided.
      */
    def use[T](value: T, onDispose: js.Function1[/* value */ T, Unit]): T = js.native
  }
  /* static members */
  object DisposableStack {
    
    @JSImport("@esfx/disposable/dist/types/disposableStack", "DisposableStack")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@esfx/disposable/dist/types/disposableStack", "DisposableStack.get")
    @js.native
    def get: Any = js.native
    inline def get_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("get")(x.asInstanceOf[js.Any])
  }
  
  type DisposableLike = Disposable | js.Function0[Unit]
}
