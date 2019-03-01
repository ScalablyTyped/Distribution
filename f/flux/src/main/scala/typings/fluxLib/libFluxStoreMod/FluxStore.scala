package typings
package fluxLib.libFluxStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class represents the most basic functionality for a FluxStore. Do not
  * extend this store directly; instead extend FluxReduceStore when creating a
  * new store.
  */
trait FluxStore[TPayload] extends js.Object {
  var __changeEvent: java.lang.String
  var __changed: scala.Boolean
  var __className: java.lang.String
  var __dispatcher: fluxLib.libDispatcherMod.namespaced[TPayload]
  var __emitter: fbemitterLib.fbemitterMod.EventEmitter
  /**
    * Emit an event notifying all listeners that this store has changed.
    * This can only be invoked when dispatching.
    * Changes are de-duplicated and resolved at the end of this store's __onDispatch function.
    */
  /* protected */ def __emitChange(): scala.Unit
  /**
    * This method encapsulates all logic for invoking __onDispatch. It should
    * be used for things like catching changes and emitting them after the
    * subclass has handled a payload.
    */
  /* protected */ def __invokeOnDispatch(payload: TPayload): scala.Unit
  /**
    * Subclasses must override this method.
    * This is how the store receives actions from the dispatcher.
    * All state mutation logic must be done during this method.
    */
  /* protected */ def __onDispatch(payload: TPayload): scala.Unit
  /**
    * Adds a listener to the store, when the store changes the given callback will be called.
    * A token is returned that can be used to remove the listener.
    * Calling the remove() function on the returned token will remove the listener.
    */
  def addListener(callback: js.Function0[scala.Unit]): fbemitterLib.fbemitterMod.EventSubscription
  /**
    * Returns the dispatch token that the dispatcher recognizes this store by.
    * Can be used to waitFor() this store.
    */
  def getDispatchToken(): java.lang.String
  /**
    * Returns the dispatcher this store is registered with.
    */
  def getDispatcher(): fluxLib.libDispatcherMod.namespaced[TPayload]
  /**
    * Ask if a store has changed during the current dispatch.
    * Can only be invoked while dispatching.
    * This can be used for constructing derived stores that depend on data from other stores.
    */
  def hasChanged(): scala.Boolean
}

object FluxStore {
  @scala.inline
  def apply[TPayload](
    __changeEvent: java.lang.String,
    __changed: scala.Boolean,
    __className: java.lang.String,
    __dispatcher: fluxLib.libDispatcherMod.namespaced[TPayload],
    __emitChange: js.Function0[scala.Unit],
    __emitter: fbemitterLib.fbemitterMod.EventEmitter,
    __invokeOnDispatch: js.Function1[TPayload, scala.Unit],
    __onDispatch: js.Function1[TPayload, scala.Unit],
    addListener: js.Function1[js.Function0[scala.Unit], fbemitterLib.fbemitterMod.EventSubscription],
    getDispatchToken: js.Function0[java.lang.String],
    getDispatcher: js.Function0[fluxLib.libDispatcherMod.namespaced[TPayload]],
    hasChanged: js.Function0[scala.Boolean]
  ): FluxStore[TPayload] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("__changeEvent")(__changeEvent)
    __obj.updateDynamic("__changed")(__changed)
    __obj.updateDynamic("__className")(__className)
    __obj.updateDynamic("__dispatcher")(__dispatcher)
    __obj.updateDynamic("__emitChange")(__emitChange)
    __obj.updateDynamic("__emitter")(__emitter)
    __obj.updateDynamic("__invokeOnDispatch")(__invokeOnDispatch)
    __obj.updateDynamic("__onDispatch")(__onDispatch)
    __obj.updateDynamic("addListener")(addListener)
    __obj.updateDynamic("getDispatchToken")(getDispatchToken)
    __obj.updateDynamic("getDispatcher")(getDispatcher)
    __obj.updateDynamic("hasChanged")(hasChanged)
    __obj.asInstanceOf[FluxStore[TPayload]]
  }
}

