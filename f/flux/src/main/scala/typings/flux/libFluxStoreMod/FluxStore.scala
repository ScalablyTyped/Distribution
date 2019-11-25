package typings.flux.libFluxStoreMod

import typings.fbemitter.fbemitterMod.EventEmitter
import typings.fbemitter.fbemitterMod.EventSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class represents the most basic functionality for a FluxStore. Do not
  * extend this store directly; instead extend FluxReduceStore when creating a
  * new store.
  */
trait FluxStore[TPayload] extends js.Object {
  var __changeEvent: String
  var __changed: Boolean
  var __className: String
  var __dispatcher: typings.flux.libDispatcherMod.^[TPayload]
  var __emitter: EventEmitter
  /**
    * Emit an event notifying all listeners that this store has changed.
    * This can only be invoked when dispatching.
    * Changes are de-duplicated and resolved at the end of this store's __onDispatch function.
    */
  /* protected */ def __emitChange(): Unit
  /**
    * This method encapsulates all logic for invoking __onDispatch. It should
    * be used for things like catching changes and emitting them after the
    * subclass has handled a payload.
    */
  /* protected */ def __invokeOnDispatch(payload: TPayload): Unit
  /**
    * Subclasses must override this method.
    * This is how the store receives actions from the dispatcher.
    * All state mutation logic must be done during this method.
    */
  /* protected */ def __onDispatch(payload: TPayload): Unit
  /**
    * Adds a listener to the store, when the store changes the given callback will be called.
    * A token is returned that can be used to remove the listener.
    * Calling the remove() function on the returned token will remove the listener.
    */
  def addListener(callback: js.Function0[Unit]): EventSubscription
  /**
    * Returns the dispatch token that the dispatcher recognizes this store by.
    * Can be used to waitFor() this store.
    */
  def getDispatchToken(): String
  /**
    * Returns the dispatcher this store is registered with.
    */
  def getDispatcher(): typings.flux.libDispatcherMod.^[TPayload]
  /**
    * Ask if a store has changed during the current dispatch.
    * Can only be invoked while dispatching.
    * This can be used for constructing derived stores that depend on data from other stores.
    */
  def hasChanged(): Boolean
}

object FluxStore {
  @scala.inline
  def apply[TPayload](
    __changeEvent: String,
    __changed: Boolean,
    __className: String,
    __dispatcher: typings.flux.libDispatcherMod.^[TPayload],
    __emitChange: () => Unit,
    __emitter: EventEmitter,
    __invokeOnDispatch: TPayload => Unit,
    __onDispatch: TPayload => Unit,
    addListener: js.Function0[Unit] => EventSubscription,
    getDispatchToken: () => String,
    getDispatcher: () => typings.flux.libDispatcherMod.^[TPayload],
    hasChanged: () => Boolean
  ): FluxStore[TPayload] = {
    val __obj = js.Dynamic.literal(__changeEvent = __changeEvent.asInstanceOf[js.Any], __changed = __changed.asInstanceOf[js.Any], __className = __className.asInstanceOf[js.Any], __dispatcher = __dispatcher.asInstanceOf[js.Any], __emitChange = js.Any.fromFunction0(__emitChange), __emitter = __emitter.asInstanceOf[js.Any], __invokeOnDispatch = js.Any.fromFunction1(__invokeOnDispatch), __onDispatch = js.Any.fromFunction1(__onDispatch), addListener = js.Any.fromFunction1(addListener), getDispatchToken = js.Any.fromFunction0(getDispatchToken), getDispatcher = js.Any.fromFunction0(getDispatcher), hasChanged = js.Any.fromFunction0(hasChanged))
  
    __obj.asInstanceOf[FluxStore[TPayload]]
  }
}

