package typings.eventKit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("event-kit", "CompositeDisposable")
  @js.native
  class CompositeDisposable protected ()
    extends StObject
       with DisposableLike {
    /** Construct an instance, optionally with one or more disposables. */
    def this(disposables: DisposableLike*) = this()
    
    // Managing Disposables
    /**
      *  Add disposables to be disposed when the composite is disposed.
      *  If this object has already been disposed, this method has no effect.
      */
    def add(disposables: DisposableLike*): Unit = js.native
    
    /**
      *  Clear all disposables. They will not be disposed by the next call to
      *  dispose.
      */
    def clear(): Unit = js.native
    
    /** Alias to CompositeDisposable::remove. */
    def delete(disposable: DisposableLike): Unit = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    var disposed: Boolean = js.native
    
    /** Remove a previously added disposable. */
    def remove(disposable: DisposableLike): Unit = js.native
  }
  
  @JSImport("event-kit", "Disposable")
  @js.native
  /** Construct a Disposable. */
  class Disposable ()
    extends StObject
       with DisposableLike {
    def this(disposableAction: js.Function0[Unit]) = this()
    
    /** A callback which will be called within dispose(). */
    var disposalAction: js.UndefOr[js.Function0[Unit]] = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    var disposed: Boolean = js.native
  }
  /* static members */
  object Disposable {
    
    @JSImport("event-kit", "Disposable")
    @js.native
    val ^ : js.Any = js.native
    
    /** Ensure that Object correctly implements the Disposable contract. */
    @scala.inline
    def isDisposable(`object`: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDisposable")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("event-kit", "Emitter")
  @js.native
  /** Construct an emitter. */
  class Emitter[OptionalEmissions, RequiredEmissions] ()
    extends StObject
       with DisposableLike {
    
    /** Clear out any existing subscribers. */
    def clear(): Unit = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    var disposed: Boolean = js.native
    
    // Event Emission
    /** Invoke the handlers registered via ::on for the given event name. */
    def emit[T /* <: /* keyof OptionalEmissions */ String */](eventName: T): Unit = js.native
    def emit[T /* <: /* keyof OptionalEmissions */ String */](
      eventName: T,
      value: /* import warning: importer.ImportType#apply Failed type conversion: OptionalEmissions[T] */ js.Any
    ): Unit = js.native
    
    /**
      *  Asynchronously invoke the handlers registered via ::on for the given event name.
      *  @return A promise that will be fulfilled once all handlers have been invoked.
      */
    def emitAsync[T /* <: /* keyof OptionalEmissions */ String */](eventName: T): js.Promise[Unit] = js.native
    def emitAsync[T /* <: /* keyof OptionalEmissions */ String */](
      eventName: T,
      value: /* import warning: importer.ImportType#apply Failed type conversion: OptionalEmissions[T] */ js.Any
    ): js.Promise[Unit] = js.native
    
    // Event Subscription
    /** Registers a handler to be invoked whenever the given event is emitted. */
    def on[T /* <: /* keyof OptionalEmissions */ String */](
      eventName: T,
      handler: js.Function1[
          js.UndefOr[
            /* import warning: importer.ImportType#apply Failed type conversion: RequiredEmissions[T] */ /* value */ js.Any
          ], 
          Unit
        ]
    ): Disposable = js.native
    
    /**
      *  Register the given handler function to be invoked the next time an event
      *  with the given name is emitted via ::emit.
      */
    def once[T /* <: /* keyof OptionalEmissions */ String */](
      eventName: T,
      handler: js.Function1[
          js.UndefOr[
            /* import warning: importer.ImportType#apply Failed type conversion: RequiredEmissions[T] */ /* value */ js.Any
          ], 
          Unit
        ]
    ): Disposable = js.native
    
    /**
      *  Register the given handler function to be invoked before all other
      *  handlers existing at the time of subscription whenever events by the
      *  given name are emitted via ::emit.
      */
    def preempt[T /* <: /* keyof OptionalEmissions */ String */](
      eventName: T,
      handler: js.Function1[
          js.UndefOr[
            /* import warning: importer.ImportType#apply Failed type conversion: RequiredEmissions[T] */ /* value */ js.Any
          ], 
          Unit
        ]
    ): Disposable = js.native
  }
  
  trait DisposableLike extends StObject {
    
    def dispose(): Unit
  }
  object DisposableLike {
    
    @scala.inline
    def apply(dispose: () => Unit): DisposableLike = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
      __obj.asInstanceOf[DisposableLike]
    }
    
    @scala.inline
    implicit class DisposableLikeMutableBuilder[Self <: DisposableLike] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    }
  }
}
