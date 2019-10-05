package typings.flux

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libFluxContainerMod {
  import typings.flux.libFluxStoreMod.^
  import typings.react.reactMod.ComponentClass
  import typings.react.reactMod.ComponentState
  import typings.react.reactMod.StatelessComponent

  type Component[TProps, TState, TContext] = ComponentConstructor[TProps] with (ComponentStatic[TProps, TState, TContext])
  type ComponentConstructor[TProps] = (ComponentClass[TProps, ComponentState]) | StatelessComponent[TProps]
  type StoresList = js.Array[^[js.Any]]
}
