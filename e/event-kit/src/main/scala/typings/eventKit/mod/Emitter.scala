package typings.eventKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("event-kit", "Emitter")
@js.native
/** Construct an emitter. */
class Emitter[OptionalEmissions, RequiredEmissions] () extends DisposableLike {
  var disposed: Boolean = js.native
  /** Clear out any existing subscribers. */
  def clear(): Unit = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
  // Event Emission
  /** Invoke the handlers registered via ::on for the given event name. */
  def emit[T /* <: String */](eventName: T): Unit = js.native
  def emit[T /* <: String */](
    eventName: T,
    value: /* import warning: importer.ImportType#apply Failed type conversion: OptionalEmissions[T] */ js.Any
  ): Unit = js.native
  /**
    *  Asynchronously invoke the handlers registered via ::on for the given event name.
    *  @return A promise that will be fulfilled once all handlers have been invoked.
    */
  def emitAsync[T /* <: String */](eventName: T): js.Promise[Unit] = js.native
  def emitAsync[T /* <: String */](
    eventName: T,
    value: /* import warning: importer.ImportType#apply Failed type conversion: OptionalEmissions[T] */ js.Any
  ): js.Promise[Unit] = js.native
  // Event Subscription
  /** Registers a handler to be invoked whenever the given event is emitted. */
  def on[T /* <: String */](
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
  def once[T /* <: String */](
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
  def preempt[T /* <: String */](
    eventName: T,
    handler: js.Function1[
      js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: RequiredEmissions[T] */ /* value */ js.Any
      ], 
      Unit
    ]
  ): Disposable = js.native
}

