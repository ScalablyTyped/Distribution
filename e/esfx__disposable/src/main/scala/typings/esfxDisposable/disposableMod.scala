package typings.esfxDisposable

import typings.esfxDisposable.distTypesDisposableMod.DisposableScope
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object disposableMod {
  
  @JSImport("@esfx/disposable/disposable", "Disposable")
  @js.native
  open class Disposable protected ()
    extends typings.esfxDisposable.distTypesDisposableMod.Disposable {
    /**
      * Creates a `Disposable` wrapper around a callback used to dispose of a resource.
      * @deprecated Use `DisposableStack` or `{ [Disposable.dispose]() { ... } }` instead.
      */
    def this(dispose: js.Function0[Unit]) = this()
  }
  object Disposable {
    
    @JSImport("@esfx/disposable/disposable", "Disposable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a `Disposable` wrapper around a callback used to dispose of a resource.
      *
      * NOTE: This is not spec-compliant and will not be standardized. It is preferred to use a `DisposableStack`
      * or to implement `Disposable.dispose` yourself instead.
      */
    inline def create(dispose: js.Function0[Unit]): typings.esfxDisposable.distTypesDisposableMod.Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(dispose.asInstanceOf[js.Any]).asInstanceOf[typings.esfxDisposable.distTypesDisposableMod.Disposable]
    
    /**
      * A well-known symbol used to define an explicit resource disposal method on an object.
      *
      * NOTE: Uses `Symbol.dispose` if present.
      */
    @JSImport("@esfx/disposable/disposable", "Disposable.dispose")
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
    inline def usingEach(iterable: js.Iterable[js.UndefOr[typings.esfxDisposable.distTypesDisposableMod.Disposable | Null]]): Generator[
        js.UndefOr[typings.esfxDisposable.distTypesDisposableMod.Disposable | Null], 
        Unit, 
        Any
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("usingEach")(iterable.asInstanceOf[js.Any]).asInstanceOf[Generator[
        js.UndefOr[typings.esfxDisposable.distTypesDisposableMod.Disposable | Null], 
        Unit, 
        Any
      ]]
  }
}
