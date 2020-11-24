package typings.flux

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object fluxContainerMod {
  
  type Component[TProps, TState, TContext] = typings.flux.fluxContainerMod.ComponentConstructor[TProps] with (typings.flux.fluxContainerMod.ComponentStatic[TProps, TState, TContext])
  
  type ComponentConstructor[TProps] = (typings.react.mod.ComponentClass[TProps, typings.react.mod.ComponentState]) | typings.react.mod.StatelessComponent[TProps]
  
  type StoresList = js.Array[typings.flux.fluxStoreMod.^[js.Any]]
}
