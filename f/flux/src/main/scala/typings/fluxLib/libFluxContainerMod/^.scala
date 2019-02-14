package typings
package fluxLib.libFluxContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("flux/lib/FluxContainer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def create[TProps](base: fluxLib.libFluxContainerMod.Component[TProps, _, _]): fluxLib.libFluxContainerMod.Component[TProps, _, _] = js.native
  def create[TProps](
    base: fluxLib.libFluxContainerMod.Component[TProps, _, _],
    options: fluxLib.libFluxContainerMod.RealOptions
  ): fluxLib.libFluxContainerMod.Component[TProps, _, _] = js.native
  def createFunctional[TProps, TState](
    viewFn: js.Function1[/* props */ TProps, reactLib.reactMod.ReactNs.ReactElement],
    getStores: js.Function2[
      /* maybeProps */ js.UndefOr[TProps], 
      /* maybeContext */ js.UndefOr[js.Any], 
      js.Array[fluxLib.libFluxStoreMod.namespaced[_]]
    ],
    calculateState: js.Function3[
      /* prevState */ js.UndefOr[TState], 
      /* maybeProps */ js.UndefOr[TProps], 
      /* maybeContext */ js.UndefOr[js.Any], 
      TState
    ]
  ): fluxLib.libFluxContainerMod.Component[TProps, TState, _] = js.native
  def createFunctional[TProps, TState](
    viewFn: js.Function1[/* props */ TProps, reactLib.reactMod.ReactNs.ReactElement],
    getStores: js.Function2[
      /* maybeProps */ js.UndefOr[TProps], 
      /* maybeContext */ js.UndefOr[js.Any], 
      js.Array[fluxLib.libFluxStoreMod.namespaced[_]]
    ],
    calculateState: js.Function3[
      /* prevState */ js.UndefOr[TState], 
      /* maybeProps */ js.UndefOr[TProps], 
      /* maybeContext */ js.UndefOr[js.Any], 
      TState
    ],
    options: fluxLib.libFluxContainerMod.RealOptions
  ): fluxLib.libFluxContainerMod.Component[TProps, TState, _] = js.native
  @JSName("create")
  def create_TPropsTState[TProps, TState](base: fluxLib.libFluxContainerMod.Component[TProps, TState, _]): fluxLib.libFluxContainerMod.Component[TProps, TState, _] = js.native
  @JSName("create")
  def create_TPropsTState[TProps, TState](
    base: fluxLib.libFluxContainerMod.Component[TProps, TState, _],
    options: fluxLib.libFluxContainerMod.RealOptions
  ): fluxLib.libFluxContainerMod.Component[TProps, TState, _] = js.native
  @JSName("create")
  def create_TPropsTStateTContext[TProps, TState, TContext](base: fluxLib.libFluxContainerMod.Component[TProps, TState, TContext]): fluxLib.libFluxContainerMod.Component[TProps, TState, TContext] = js.native
  @JSName("create")
  def create_TPropsTStateTContext[TProps, TState, TContext](
    base: fluxLib.libFluxContainerMod.Component[TProps, TState, TContext],
    options: fluxLib.libFluxContainerMod.RealOptions
  ): fluxLib.libFluxContainerMod.Component[TProps, TState, TContext] = js.native
  @JSName("create")
  def `create_TPropsTStateTContextTStatic<intersection>`[TProps, TState, TContext, TStatic](base: (fluxLib.libFluxContainerMod.Component[TProps, TState, TContext]) with TStatic): (fluxLib.libFluxContainerMod.Component[TProps, TState, TContext]) with TStatic = js.native
  @JSName("create")
  def `create_TPropsTStateTContextTStatic<intersection>`[TProps, TState, TContext, TStatic](
    base: (fluxLib.libFluxContainerMod.Component[TProps, TState, TContext]) with TStatic,
    options: fluxLib.libFluxContainerMod.RealOptions
  ): (fluxLib.libFluxContainerMod.Component[TProps, TState, TContext]) with TStatic = js.native
}

