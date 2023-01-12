package typings.esfxDisposable

import typings.esfxDisposable.distTypesAsyncDisposableStackMod._AsyncDisposableLike
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDisposableMod {
  
  @JSImport("@esfx/disposable/dist/types/disposable", "Disposable")
  @js.native
  open class Disposable protected ()
    extends StObject
       with _AsyncDisposableLike {
    /**
      * Creates a `Disposable` wrapper around a callback used to dispose of a resource.
      * @deprecated Use `DisposableStack` or `{ [Disposable.dispose]() { ... } }` instead.
      */
    def this(dispose: js.Function0[Unit]) = this()
  }
  object Disposable {
    
    @JSImport("@esfx/disposable/dist/types/disposable", "Disposable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a `Disposable` wrapper around a callback used to dispose of a resource.
      *
      * NOTE: This is not spec-compliant and will not be standardized. It is preferred to use a `DisposableStack`
      * or to implement `Disposable.dispose` yourself instead.
      */
    inline def create(dispose: js.Function0[Unit]): Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(dispose.asInstanceOf[js.Any]).asInstanceOf[Disposable]
    
    /**
      * A well-known symbol used to define an explicit resource disposal method on an object.
      *
      * NOTE: Uses `Symbol.dispose` if present.
      */
    @JSImport("@esfx/disposable/dist/types/disposable", "Disposable.dispose")
    @js.native
    val dispose: js.Symbol = js.native
    
    /**
      * Determines whether a value is Disposable.
      *
      * NOTE: This is not spec-compliant and will not be standardized.
      */
    inline def hasInstance(value: Any): /* is @esfx/disposable.@esfx/disposable/dist/types/disposable.Disposable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/disposable.@esfx/disposable/dist/types/disposable.Disposable */ Boolean]
    
    /**
      * Emulate `using const` using `for..of`.
      *
      * NOTE: This is not spec-compliant and will not be standardized.
      *
      * @example
      * ```ts
      * // with `using const` (proposed)
      * {
      *   ...
      *   using const x = expr, y = expr;
      *   ...
      * }
      *
      * // with `Disposable.scope()`:
      * for (const { using, fail } of Disposable.scope()) {
      *   try {
      *     ...
      *     const x = using(expr), y = using(expr);
      *     ...
      *   }
      *   catch (e) {
      *     fail(e);
      *   }
      * }
      * ```
      */
    inline def scope(): Generator[DisposableScope, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("scope")().asInstanceOf[Generator[DisposableScope, Unit, Unit]]
    
    /**
      * Yields each disposable in the iterable, disposing it when the generator resumes.
      *
      * This emulates `for (using const x of expr)`.
      *
      * NOTE: This is not spec-compliant and will not be standardized.
      *
      * @example
      * ```ts
      * // with `using const` (proposed)
      * for (using const x of expr) {
      *   ...
      * }
      *
      * // with `Disposable.usingEach()`:
      * for (const x of Disposable.usingEach(expr)) {
      *   ...
      * }
      * ```
      */
    inline def usingEach(iterable: js.Iterable[js.UndefOr[Disposable | Null]]): Generator[js.UndefOr[Disposable | Null], Unit, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("usingEach")(iterable.asInstanceOf[js.Any]).asInstanceOf[Generator[js.UndefOr[Disposable | Null], Unit, Any]]
  }
  
  trait DisposableScope extends StObject {
    
    /**
      * Tracks an exception from the body of a `for..of` statement. See {@link Disposable.scope}.
      */
    def fail(error: Any): Unit
    
    /**
      * Tracks a resource to be disposed at the end of a `for..of` statement. See {@link Disposable.scope}.
      */
    def `using`[T /* <: js.UndefOr[Disposable | Null] */](value: T): T
  }
  object DisposableScope {
    
    inline def apply(fail: Any => Unit, `using`: Any => Any): DisposableScope = {
      val __obj = js.Dynamic.literal(fail = js.Any.fromFunction1(fail))
      __obj.updateDynamic("using")(js.Any.fromFunction1(`using`))
      __obj.asInstanceOf[DisposableScope]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DisposableScope] (val x: Self) extends AnyVal {
      
      inline def setFail(value: Any => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
      
      inline def setUsing(value: Any => Any): Self = StObject.set(x, "using", js.Any.fromFunction1(value))
    }
  }
}
