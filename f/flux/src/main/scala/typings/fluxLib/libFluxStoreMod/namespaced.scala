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
@JSImport("flux/lib/FluxStore", JSImport.Namespace)
@js.native
abstract class namespaced[TPayload] protected () extends FluxStore[TPayload] {
  /**
     * Constructs and registers an instance of this store with the given dispatcher.
     */
  def this(dispatcher: fluxLib.libDispatcherMod.namespaced[TPayload]) = this()
  /* CompleteClass */
  override var __changeEvent: java.lang.String = js.native
  /* CompleteClass */
  override var __changed: scala.Boolean = js.native
  /* CompleteClass */
  override var __className: java.lang.String = js.native
  /* CompleteClass */
  override var __dispatcher: fluxLib.libDispatcherMod.namespaced[TPayload] = js.native
  /* CompleteClass */
  override var __emitter: fbemitterLib.fbemitterMod.EventEmitter = js.native
  /**
     * Emit an event notifying all listeners that this store has changed.
     * This can only be invoked when dispatching.
     * Changes are de-duplicated and resolved at the end of this store's __onDispatch function.
     */
  /* CompleteClass */
  /* protected */ override def __emitChange(): scala.Unit = js.native
  /**
     * This method encapsulates all logic for invoking __onDispatch. It should
     * be used for things like catching changes and emitting them after the
     * subclass has handled a payload.
     */
  /* CompleteClass */
  /* protected */ override def __invokeOnDispatch(payload: TPayload): scala.Unit = js.native
  /**
     * Subclasses must override this method.
     * This is how the store receives actions from the dispatcher.
     * All state mutation logic must be done during this method.
     */
  /* CompleteClass */
  /* protected */ override def __onDispatch(payload: TPayload): scala.Unit = js.native
  /**
     * Adds a listener to the store, when the store changes the given callback will be called.
     * A token is returned that can be used to remove the listener.
     * Calling the remove() function on the returned token will remove the listener.
     */
  /* CompleteClass */
  override def addListener(callback: js.Function0[scala.Unit]): fbemitterLib.fbemitterMod.EventSubscription = js.native
  /**
     * Returns the dispatch token that the dispatcher recognizes this store by.
     * Can be used to waitFor() this store.
     */
  /* CompleteClass */
  override def getDispatchToken(): java.lang.String = js.native
  /**
     * Returns the dispatcher this store is registered with.
     */
  /* CompleteClass */
  override def getDispatcher(): fluxLib.libDispatcherMod.namespaced[TPayload] = js.native
  /**
     * Ask if a store has changed during the current dispatch.
     * Can only be invoked while dispatching.
     * This can be used for constructing derived stores that depend on data from other stores.
     */
  /* CompleteClass */
  override def hasChanged(): scala.Boolean = js.native
}

