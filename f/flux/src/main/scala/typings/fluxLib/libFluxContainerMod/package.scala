package typings
package fluxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libFluxContainerMod {
  type Component[TProps, TState, TContext] = ComponentConstructor[TProps] with (ComponentStatic[TProps, TState, TContext])
  type ComponentConstructor[TProps] = (reactLib.reactMod.ReactNs.ComponentClass[TProps, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.StatelessComponent[TProps]
  type StoresList = js.Array[fluxLib.libFluxStoreMod.namespaced[js.Any]]
}
