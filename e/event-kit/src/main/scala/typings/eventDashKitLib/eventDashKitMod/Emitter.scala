package typings
package eventDashKitLib.eventDashKitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("event-kit", "Emitter")
@js.native
/** Construct an emitter. */
class Emitter[OptionalEmissions, RequiredEmissions] () extends DisposableLike {
  var disposed: scala.Boolean = js.native
  /** Clear out any existing subscribers. */
  def clear(): scala.Unit = js.native
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  // Event Emission
  /** Invoke the handlers registered via ::on for the given event name. */
  def emit[T /* <: java.lang.String */](eventName: T): scala.Unit = js.native
  def emit[T /* <: java.lang.String */](
    eventName: T,
    value: /* import warning: ImportType.apply Failed type conversion: OptionalEmissions[T] */ js.Any
  ): scala.Unit = js.native
  /**
    *  Asynchronously invoke the handlers registered via ::on for the given event name.
    *  @return A promise that will be fulfilled once all handlers have been invoked.
    */
  def emitAsync[T /* <: java.lang.String */](eventName: T): js.Promise[scala.Unit] = js.native
  def emitAsync[T /* <: java.lang.String */](
    eventName: T,
    value: /* import warning: ImportType.apply Failed type conversion: OptionalEmissions[T] */ js.Any
  ): js.Promise[scala.Unit] = js.native
  // Event Subscription
  /** Registers a handler to be invoked whenever the given event is emitted. */
  def on[T /* <: java.lang.String */](
    eventName: T,
    handler: js.Function1[
      js.UndefOr[
        /* import warning: ImportType.apply Failed type conversion: RequiredEmissions[T] */ /* value */ js.Any
      ], 
      scala.Unit
    ]
  ): Disposable = js.native
  /**
    *  Register the given handler function to be invoked the next time an event
    *  with the given name is emitted via ::emit.
    */
  def once[T /* <: java.lang.String */](
    eventName: T,
    handler: js.Function1[
      js.UndefOr[
        /* import warning: ImportType.apply Failed type conversion: RequiredEmissions[T] */ /* value */ js.Any
      ], 
      scala.Unit
    ]
  ): Disposable = js.native
  /**
    *  Register the given handler function to be invoked before all other
    *  handlers existing at the time of subscription whenever events by the
    *  given name are emitted via ::emit.
    */
  def preempt[T /* <: java.lang.String */](
    eventName: T,
    handler: js.Function1[
      js.UndefOr[
        /* import warning: ImportType.apply Failed type conversion: RequiredEmissions[T] */ /* value */ js.Any
      ], 
      scala.Unit
    ]
  ): Disposable = js.native
}

