package typings.flux.fluxContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentStatic[TProps, TState, TContext] extends js.Object {
  def calculateState(prevState: TState): TState = js.native
  def calculateState(prevState: TState, maybeProps: TProps): TState = js.native
  def calculateState(prevState: TState, maybeProps: TProps, maybeContext: TContext): TState = js.native
  def getStores(): StoresList = js.native
  def getStores(maybeProps: TProps): StoresList = js.native
  def getStores(maybeProps: TProps, maybeContext: TContext): StoresList = js.native
}

