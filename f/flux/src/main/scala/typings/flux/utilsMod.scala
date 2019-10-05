package typings.flux

import typings.flux.libFluxContainerMod.Component
import typings.flux.libFluxContainerMod.RealOptions
import typings.flux.libFluxMixinLegacyMod.Options
import typings.flux.libFluxReduceStoreMod.^
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("flux/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  /**
    * This is the basic building block of a Flux application. All of your stores
    * should extend this class.
    */
  @js.native
  abstract class ReduceStore[TState, TPayload] () extends ^[TState, TPayload]
  
  /**
    * This class represents the most basic functionality for a FluxStore. Do not
    * extend this store directly; instead extend FluxReduceStore when creating a
    * new store.
    */
  @js.native
  abstract class Store[TPayload] protected ()
    extends typings.flux.libFluxStoreMod.^[TPayload] {
    /**
      * Constructs and registers an instance of this store with the given dispatcher.
      */
    def this(dispatcher: typings.flux.libDispatcherMod.^[TPayload]) = this()
  }
  
  @js.native
  object Container extends js.Object {
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
  
  @js.native
  object Mixin extends js.Object {
    /**
      * `FluxContainer` should be preferred over this mixin, but it requires using
      * react with classes. So this mixin is provided where it is not yet possible
      * to convert a container to be a class.
      *
      * This mixin should be used for React components that have state based purely
      * on stores. `this.props` will not be available inside of `calculateState()`.
      *
      * This mixin will only `setState` not replace it, so you should always return
      * every key in your state unless you know what you are doing.
      *
      * On the second calculateState when prevState is not null, the state will be
      * updated to contain the previous foo AND the bar that was just returned. Only
      * returning bar will not delete foo.
      */
    def apply(stores: js.Array[typings.flux.libFluxStoreMod.^[_]]): js.Any = js.native
    def apply(stores: js.Array[typings.flux.libFluxStoreMod.^[_]], options: Options): js.Any = js.native
  }
  
}

