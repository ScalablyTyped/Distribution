package typings.esfxDisposable

import typings.esfxDisposable.asyncDisposableMod.AsyncDisposableScope
import typings.esfxDisposable.disposableMod.DisposableScope
import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import typings.std.Generator
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@esfx/disposable", "AsyncDisposable")
  @js.native
  open class AsyncDisposable protected ()
    extends typings.esfxDisposable.asyncDisposableMod.AsyncDisposable {
    /**
      * Creates an `AsyncDisposable` wrapper around a callback used to dispose resources.
      * @deprecated Use `AsyncDisposableStack` or `{ [AsyncDisposable.asyncDispose]() { ... } }` instead.
      */
    def this(disposeAsync: js.Function0[Unit | PromiseLike[Unit]]) = this()
  }
  object AsyncDisposable {
    
    @JSImport("@esfx/disposable", "AsyncDisposable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A well-known symbol used to define an async explicit resource disposal method on an object.
      *
      * NOTE: Uses `Symbol.asyncDispose` if present.
      */
    @JSImport("@esfx/disposable", "AsyncDisposable.asyncDispose")
    @js.native
    val asyncDispose: js.Symbol = js.native
    
    /**
      * Creates an `AsyncDisposable` wrapper around a callback used to dispose resources.
      *
      * NOTE: This is not spec-compliant and will not be standardized. It is preferred to use an `AsyncDisposableStack`
      * or to implement `AsyncDisposable.asyncDispose` yourself instead.
      */
    inline def create(disposeAsync: js.Function0[Unit | PromiseLike[Unit]]): typings.esfxDisposable.asyncDisposableMod.AsyncDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(disposeAsync.asInstanceOf[js.Any]).asInstanceOf[typings.esfxDisposable.asyncDisposableMod.AsyncDisposable]
    
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
            typings.esfxDisposable.asyncDisposableMod.AsyncDisposable | typings.esfxDisposable.disposableMod.Disposable | Null | (PromiseLike[
              js.UndefOr[
                typings.esfxDisposable.asyncDisposableMod.AsyncDisposable | typings.esfxDisposable.disposableMod.Disposable | Null
              ]
            ])
          ]
        ]
    ): AsyncGenerator[
        js.UndefOr[
          typings.esfxDisposable.asyncDisposableMod.AsyncDisposable | typings.esfxDisposable.disposableMod.Disposable | Null
        ], 
        Unit, 
        Any
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("usingEach")(iterable.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[
        js.UndefOr[
          typings.esfxDisposable.asyncDisposableMod.AsyncDisposable | typings.esfxDisposable.disposableMod.Disposable | Null
        ], 
        Unit, 
        Any
      ]]
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
    inline def usingEach(
      iterable: AsyncIterable[
          js.UndefOr[
            typings.esfxDisposable.asyncDisposableMod.AsyncDisposable | typings.esfxDisposable.disposableMod.Disposable | Null
          ]
        ]
    ): AsyncGenerator[
        js.UndefOr[
          typings.esfxDisposable.asyncDisposableMod.AsyncDisposable | typings.esfxDisposable.disposableMod.Disposable | Null
        ], 
        Unit, 
        Any
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("usingEach")(iterable.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[
        js.UndefOr[
          typings.esfxDisposable.asyncDisposableMod.AsyncDisposable | typings.esfxDisposable.disposableMod.Disposable | Null
        ], 
        Unit, 
        Any
      ]]
  }
  
  @JSImport("@esfx/disposable", "AsyncDisposableStack")
  @js.native
  open class AsyncDisposableStack ()
    extends typings.esfxDisposable.asyncDisposableStackMod.AsyncDisposableStack
  /* static members */
  object AsyncDisposableStack {
    
    @JSImport("@esfx/disposable", "AsyncDisposableStack")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@esfx/disposable", "AsyncDisposableStack.get")
    @js.native
    def get: Any = js.native
    inline def get_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("get")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@esfx/disposable", "Disposable")
  @js.native
  open class Disposable protected ()
    extends typings.esfxDisposable.disposableMod.Disposable {
    /**
      * Creates a `Disposable` wrapper around a callback used to dispose of a resource.
      * @deprecated Use `DisposableStack` or `{ [Disposable.dispose]() { ... } }` instead.
      */
    def this(dispose: js.Function0[Unit]) = this()
  }
  object Disposable {
    
    @JSImport("@esfx/disposable", "Disposable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a `Disposable` wrapper around a callback used to dispose of a resource.
      *
      * NOTE: This is not spec-compliant and will not be standardized. It is preferred to use a `DisposableStack`
      * or to implement `Disposable.dispose` yourself instead.
      */
    inline def create(dispose: js.Function0[Unit]): typings.esfxDisposable.disposableMod.Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(dispose.asInstanceOf[js.Any]).asInstanceOf[typings.esfxDisposable.disposableMod.Disposable]
    
    /**
      * A well-known symbol used to define an explicit resource disposal method on an object.
      *
      * NOTE: Uses `Symbol.dispose` if present.
      */
    @JSImport("@esfx/disposable", "Disposable.dispose")
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
    inline def usingEach(iterable: js.Iterable[js.UndefOr[typings.esfxDisposable.disposableMod.Disposable | Null]]): Generator[js.UndefOr[typings.esfxDisposable.disposableMod.Disposable | Null], Unit, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("usingEach")(iterable.asInstanceOf[js.Any]).asInstanceOf[Generator[js.UndefOr[typings.esfxDisposable.disposableMod.Disposable | Null], Unit, Any]]
  }
  
  @JSImport("@esfx/disposable", "DisposableStack")
  @js.native
  /**
    * Creates a new DisposableStack.
    */
  open class DisposableStack ()
    extends typings.esfxDisposable.disposableStackMod.DisposableStack
  /* static members */
  object DisposableStack {
    
    @JSImport("@esfx/disposable", "DisposableStack")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@esfx/disposable", "DisposableStack.get")
    @js.native
    def get: Any = js.native
    inline def get_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("get")(x.asInstanceOf[js.Any])
  }
}
