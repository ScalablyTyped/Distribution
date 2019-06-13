package typings
package fluxLib.libFluxContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("flux/lib/FluxContainer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def create[TProps](base: Component[TProps, _, _]): Component[TProps, _, _] = js.native
  def create[TProps](base: Component[TProps, _, _], options: RealOptions): Component[TProps, _, _] = js.native
  def createFunctional[TProps, TState](
    viewFn: js.Function1[/* props */ TState, reactLib.reactMod.ReactElement[TState]],
    getStores: js.Function2[
      /* maybeProps */ js.UndefOr[TProps], 
      /* maybeContext */ js.UndefOr[js.Any], 
      js.Array[fluxLib.libFluxStoreMod.^[_]]
    ],
    calculateState: js.Function3[
      /* prevState */ js.UndefOr[TState], 
      /* maybeProps */ js.UndefOr[TProps], 
      /* maybeContext */ js.UndefOr[js.Any], 
      TState
    ]
  ): Component[TProps, TState, _] = js.native
  def createFunctional[TProps, TState](
    viewFn: js.Function1[/* props */ TState, reactLib.reactMod.ReactElement[TState]],
    getStores: js.Function2[
      /* maybeProps */ js.UndefOr[TProps], 
      /* maybeContext */ js.UndefOr[js.Any], 
      js.Array[fluxLib.libFluxStoreMod.^[_]]
    ],
    calculateState: js.Function3[
      /* prevState */ js.UndefOr[TState], 
      /* maybeProps */ js.UndefOr[TProps], 
      /* maybeContext */ js.UndefOr[js.Any], 
      TState
    ],
    options: RealOptions
  ): Component[TProps, TState, _] = js.native
  @JSName("create")
  def create_TPropsTState[TProps, TState](base: Component[TProps, TState, _]): Component[TProps, TState, _] = js.native
  @JSName("create")
  def create_TPropsTState[TProps, TState](base: Component[TProps, TState, _], options: RealOptions): Component[TProps, TState, _] = js.native
  @JSName("create")
  def create_TPropsTStateTContext[TProps, TState, TContext](base: Component[TProps, TState, TContext]): Component[TProps, TState, TContext] = js.native
  @JSName("create")
  def create_TPropsTStateTContext[TProps, TState, TContext](base: Component[TProps, TState, TContext], options: RealOptions): Component[TProps, TState, TContext] = js.native
  @JSName("create")
  def `create_TPropsTStateTContextTStatic<intersection>`[TProps, TState, TContext, TStatic](base: (Component[TProps, TState, TContext]) with TStatic): (Component[TProps, TState, TContext]) with TStatic = js.native
  @JSName("create")
  def `create_TPropsTStateTContextTStatic<intersection>`[TProps, TState, TContext, TStatic](base: (Component[TProps, TState, TContext]) with TStatic, options: RealOptions): (Component[TProps, TState, TContext]) with TStatic = js.native
}

