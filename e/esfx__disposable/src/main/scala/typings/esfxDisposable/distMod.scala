package typings.esfxDisposable

import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  @js.native
  trait AsyncDisposable extends StObject
  object AsyncDisposable {
    
    @JSImport("@esfx/disposable/dist", "AsyncDisposable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A well-known symbol used to define an async explicit resource disposal method on an object.
      */
    @JSImport("@esfx/disposable/dist", "AsyncDisposable.asyncDispose")
    @js.native
    val asyncDispose: js.Symbol = js.native
    
    /**
      * Creates an `AsyncDisposable` wrapper around a callback used to dispose resources.
      */
    inline def create(dispose: js.Function0[Unit | js.Thenable[Unit]]): AsyncDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(dispose.asInstanceOf[js.Any]).asInstanceOf[AsyncDisposable]
    
    /**
      * Creates an `AsyncDisposable` wrapper around a set of other disposables.
      * @param resources An `Iterable` of `AsyncDisposable` or `Disposable` objects.
      */
    inline def from(resources: Iterable[js.UndefOr[AsyncDisposable | Disposable | Null]]): AsyncDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(resources.asInstanceOf[js.Any]).asInstanceOf[AsyncDisposable]
    
    /**
      * Determines whether a value is [[AsyncDisposable]].
      */
    inline def hasInstance(value: js.Any): /* is @esfx/disposable.@esfx/disposable/dist.AsyncDisposable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/disposable.@esfx/disposable/dist.AsyncDisposable */ Boolean]
    
    /**
      * Determines whether a value is [[AsyncDisposable]].
      * @deprecated Use `AsyncDisposable.hasInstance` instead.
      */
    inline def isAsyncDisposable(value: js.Any): /* is @esfx/disposable.@esfx/disposable/dist.AsyncDisposable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAsyncDisposable")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/disposable.@esfx/disposable/dist.AsyncDisposable */ Boolean]
    
    @JSImport("@esfx/disposable/dist", "AsyncDisposable.name")
    @js.native
    val name: /* "AsyncDisposable" */ String = js.native
    
    inline def use[U](resource: Null, callback: js.Function1[/* resource */ Null, U | js.Thenable[U]]): js.Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("use")(resource.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[U]]
    inline def use[U](resource: Unit, callback: js.Function1[/* resource */ Unit, U | js.Thenable[U]]): js.Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("use")(resource.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[U]]
    /**
      * Executes a callback with the provided `AsyncDisposable` resource, disposing the resource when the callback completes asynchronously.
      */
    inline def use[U](
      resource: AsyncDisposable,
      callback: js.Function1[/* resource */ AsyncDisposable, U | js.Thenable[U]]
    ): js.Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("use")(resource.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[U]]
    inline def use[U](resource: Disposable, callback: js.Function1[/* resource */ Disposable, U | js.Thenable[U]]): js.Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("use")(resource.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[U]]
  }
  
  @js.native
  trait Disposable extends StObject
  object Disposable {
    
    @JSImport("@esfx/disposable/dist", "Disposable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a `Disposable` wrapper around a callback used to dispose of a resource.
      */
    inline def create(dispose: js.Function0[Unit]): Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(dispose.asInstanceOf[js.Any]).asInstanceOf[Disposable]
    
    /**
      * A well-known symbol used to define an explicit resource disposal method on an object.
      */
    @JSImport("@esfx/disposable/dist", "Disposable.dispose")
    @js.native
    val dispose: js.Symbol = js.native
    
    /**
      * Creates a `Disposable` wrapper around a set of other disposables.
      * @param disposables An `Iterable` of `Disposable` objects.
      */
    inline def from(disposables: Iterable[js.UndefOr[Disposable | Null]]): Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(disposables.asInstanceOf[js.Any]).asInstanceOf[Disposable]
    
    /**
      * Determines whether a value is Disposable.
      */
    inline def hasInstance(value: js.Any): /* is @esfx/disposable.@esfx/disposable/dist.Disposable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/disposable.@esfx/disposable/dist.Disposable */ Boolean]
    
    /**
      * Determines whether a value is Disposable.
      * @deprecated Use `Disposable.hasInstance` instead.
      */
    inline def isDisposable(value: js.Any): /* is @esfx/disposable.@esfx/disposable/dist.Disposable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDisposable")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/disposable.@esfx/disposable/dist.Disposable */ Boolean]
    
    @JSImport("@esfx/disposable/dist", "Disposable.name")
    @js.native
    val name: /* "Disposable" */ String = js.native
    
    /**
      * Executes a callback with the provided `Disposable` resource, disposing the resource when the callback completes.
      */
    inline def use[T /* <: js.UndefOr[Disposable | Null] */, U](resource: T, callback: js.Function1[/* resource */ T, U]): U = (^.asInstanceOf[js.Dynamic].applyDynamic("use")(resource.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[U]
  }
}
