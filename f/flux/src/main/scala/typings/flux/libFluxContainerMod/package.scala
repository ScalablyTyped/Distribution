package typings.flux

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libFluxContainerMod {
  type Component[TProps, TState, TContext] = ComponentConstructor[TProps] with (ComponentStatic[TProps, TState, TContext])
  type ComponentConstructor[TProps] = (ComponentClass[TProps, ComponentState]) | StatelessComponent[TProps]
  type StoresList = js.Array[typings.flux.libFluxStoreMod.^[js.Any]]
}
