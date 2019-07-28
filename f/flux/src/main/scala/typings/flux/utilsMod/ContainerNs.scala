package typings.flux.utilsMod

import typings.flux.libFluxContainerMod.Component
import typings.flux.libFluxContainerMod.RealOptions
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("flux/utils", "Container")
@js.native
object ContainerNs extends js.Object {
  def create[TProps](base: Component[TProps, _, _]): Component[TProps, _, _] = js.native
  def create[TProps](base: Component[TProps, _, _], options: RealOptions): Component[TProps, _, _] = js.native
  def createFunctional[TProps, TState](
    viewFn: js.Function1[/* props */ TState, ReactElement],
    getStores: js.Function2[
      /* maybeProps */ js.UndefOr[TProps], 
      /* maybeContext */ js.UndefOr[js.Any], 
      js.Array[typings.flux.libFluxStoreMod.^[_]]
    ],
    calculateState: js.Function3[
      /* prevState */ js.UndefOr[TState], 
      /* maybeProps */ js.UndefOr[TProps], 
      /* maybeContext */ js.UndefOr[js.Any], 
      TState
    ]
  ): Component[TProps, TState, _] = js.native
  def createFunctional[TProps, TState](
    viewFn: js.Function1[/* props */ TState, ReactElement],
    getStores: js.Function2[
      /* maybeProps */ js.UndefOr[TProps], 
      /* maybeContext */ js.UndefOr[js.Any], 
      js.Array[typings.flux.libFluxStoreMod.^[_]]
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
  def create_TPropsTStateTContextTStatic_Intersection[TProps, TState, TContext, TStatic](base: (Component[TProps, TState, TContext]) with TStatic): (Component[TProps, TState, TContext]) with TStatic = js.native
  @JSName("create")
  def create_TPropsTStateTContextTStatic_Intersection[TProps, TState, TContext, TStatic](base: (Component[TProps, TState, TContext]) with TStatic, options: RealOptions): (Component[TProps, TState, TContext]) with TStatic = js.native
}

