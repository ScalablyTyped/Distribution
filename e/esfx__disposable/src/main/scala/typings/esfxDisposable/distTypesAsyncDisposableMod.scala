package typings.esfxDisposable

import typings.esfxDisposable.distTypesAsyncDisposableStackMod._AsyncDisposableLike
import typings.esfxDisposable.distTypesDisposableMod.Disposable
import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAsyncDisposableMod {
  
  @JSImport("@esfx/disposable/dist/types/asyncDisposable", "AsyncDisposable")
  @js.native
  open class AsyncDisposable protected ()
    extends StObject
       with _AsyncDisposableLike {
    /**
      * Creates an `AsyncDisposable` wrapper around a callback used to dispose resources.
      * @deprecated Use `AsyncDisposableStack` or `{ [AsyncDisposable.asyncDispose]() { ... } }` instead.
      */
    def this(disposeAsync: js.Function0[Unit | PromiseLike[Unit]]) = this()
  }
  object AsyncDisposable {
    
    @JSImport("@esfx/disposable/dist/types/asyncDisposable", "AsyncDisposable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A well-known symbol used to define an async explicit resource disposal method on an object.
      *
      * NOTE: Uses `Symbol.asyncDispose` if present.
      */
    @JSImport("@esfx/disposable/dist/types/asyncDisposable", "AsyncDisposable.asyncDispose")
    @js.native
    val asyncDispose: js.Symbol = js.native
    
    /**
      * Creates an `AsyncDisposable` wrapper around a callback used to dispose resources.
      *
      * NOTE: This is not spec-compliant and will not be standardized. It is preferred to use an `AsyncDisposableStack`
      * or to implement `AsyncDisposable.asyncDispose` yourself instead.
      */
    inline def create(disposeAsync: js.Function0[Unit | PromiseLike[Unit]]): AsyncDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(disposeAsync.asInstanceOf[js.Any]).asInstanceOf[AsyncDisposable]
    
    /**
      * Determines whether a value is `AsyncDisposable`.
      *
      * NOTE: This is not spec-compliant and will not be standardized.
      */
    inline def hasInstance(value: Any): /* is @esfx/disposable.@esfx/disposable/dist/types/asyncDisposable.AsyncDisposable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/disposable.@esfx/disposable/dist/types/asyncDisposable.AsyncDisposable */ Boolean]
    
    /**
      * Emulate `using await const` using `for..await..of`.
      *
      * NOTE: This is not spec-compliant and will not be standardized.
      *
      * @example
      * ```ts
      * // with `using await const` (proposed)
      * {
      *   ...
      *   using await const x = expr, y = expr;
      *   ...
      * }
      *
      * // with `AsyncDisposable.scope()`:
      * for await (const { using, fail } of AsyncDisposable.scope()) {
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
    inline def scope(): AsyncGenerator[AsyncDisposableScope, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("scope")().asInstanceOf[AsyncGenerator[AsyncDisposableScope, Unit, Unit]]
    
    inline def usingEach(
      iterable: js.Iterable[
          js.UndefOr[
            AsyncDisposable | Disposable | Null | (PromiseLike[js.UndefOr[AsyncDisposable | Disposable | Null]])
          ]
        ]
    ): AsyncGenerator[js.UndefOr[AsyncDisposable | Disposable | Null], Unit, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("usingEach")(iterable.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[js.UndefOr[AsyncDisposable | Disposable | Null], Unit, Any]]
    /**
      * Yields each disposable in the iterable, disposing it when the generator resumes.
      *
      * This emulates `for (using await const x of expr)`.
      *
      * NOTE: This is not spec-compliant and will not be standardized.
      *
      * @example
      * ```ts
      * // with `using await const` (proposed)
      * for (using await const x of expr) {
      *   ...
      * }
      * for await (using await const x of expr) {
      *   ...
      * }
      *
      * // with `Disposable.usingEach()`:
      * for await (const x of Disposable.usingEach(expr)) {
      *   ...
      * }
      * ```
      */
    inline def usingEach(iterable: AsyncIterable[js.UndefOr[AsyncDisposable | Disposable | Null]]): AsyncGenerator[js.UndefOr[AsyncDisposable | Disposable | Null], Unit, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("usingEach")(iterable.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[js.UndefOr[AsyncDisposable | Disposable | Null], Unit, Any]]
  }
  
  @js.native
  trait AsyncDisposableScope extends StObject {
    
    /**
      * Tracks an exception from the body of a `for..of` statement. See {@link AsyncDisposable.scope}.
      */
    def fail(error: Any): Unit = js.native
    
    def `using`(value: Null): Null = js.native
    def `using`(value: Unit): Unit = js.native
    def `using`(value: AsyncDisposable): AsyncDisposable = js.native
    /**
      * Tracks a resource to be disposed at the end of a `for..of` statement. See {@link AsyncDisposable.scope}.
      */
    def `using`(value: Disposable): Disposable = js.native
  }
}
