package typings
package fluxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libFluxContainerMod {
  type Component[TProps, TState, TContext] = ComponentConstructor[TProps] with (ComponentStatic[TProps, TState, TContext])
  type ComponentConstructor[TProps] = (reactLib.reactMod.ComponentClass[TProps, reactLib.reactMod.ComponentState]) | reactLib.reactMod.StatelessComponent[TProps]
  type StoresList = js.Array[fluxLib.libFluxStoreMod.^[js.Any]]
}
