package typings.flux.fluxReduceStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is the basic building block of a Flux application. All of your stores
  * should extend this class.
  */
@js.native
trait FluxReduceStore[TState, TPayload]
  extends typings.flux.fluxStoreMod.^[TPayload] {
  /**
    * Checks if two versions of state are the same.
    * You do not need to override this if your state is immutable.
    */
  def areEqual(one: TState, two: TState): Boolean = js.native
  /**
    * Constructs the initial state for this store.
    * This is called once during construction of the store.
    */
  def getInitialState(): TState = js.native
  /**
    * Getter that exposes the entire state of this store.
    * If your state is not immutable you should override this and not expose state directly.
    */
  def getState(): TState = js.native
  /**
    * Reduces the current state, and an action to the new state of this store.
    * All subclasses must implement this method.
    * This method should be pure and have no side-effects.
    */
  def reduce(state: TState, action: TPayload): TState = js.native
}

