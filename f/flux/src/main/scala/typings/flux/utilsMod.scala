package typings.flux

import typings.flux.libFluxContainerMod.Component
import typings.flux.libFluxContainerMod.RealOptions
import typings.flux.libFluxMixinLegacyMod.Options
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("flux/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Container {
    
    @JSImport("flux/utils", "Container")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[TProps](base: Component[TProps, Any, Any]): Component[TProps, Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(base.asInstanceOf[js.Any]).asInstanceOf[Component[TProps, Any, Any]]
    inline def create[TProps](base: Component[TProps, Any, Any], options: RealOptions): Component[TProps, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(base.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Component[TProps, Any, Any]]
    inline def create[TProps, TState, TContext, TStatic](base: (Component[TProps, TState, TContext]) & TStatic): (Component[TProps, TState, TContext]) & TStatic = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(base.asInstanceOf[js.Any]).asInstanceOf[(Component[TProps, TState, TContext]) & TStatic]
    inline def create[TProps, TState, TContext, TStatic](base: (Component[TProps, TState, TContext]) & TStatic, options: RealOptions): (Component[TProps, TState, TContext]) & TStatic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(base.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[(Component[TProps, TState, TContext]) & TStatic]
    
    inline def createFunctional[TProps, TState](
      viewFn: js.Function1[/* props */ TState, ReactElement],
      getStores: js.Function2[
          /* maybeProps */ js.UndefOr[TProps], 
          /* maybeContext */ js.UndefOr[Any], 
          js.Array[typings.flux.libFluxStoreMod.^[Any]]
        ],
      calculateState: js.Function3[
          /* prevState */ js.UndefOr[TState], 
          /* maybeProps */ js.UndefOr[TProps], 
          /* maybeContext */ js.UndefOr[Any], 
          TState
        ]
    ): Component[TProps, TState, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFunctional")(viewFn.asInstanceOf[js.Any], getStores.asInstanceOf[js.Any], calculateState.asInstanceOf[js.Any])).asInstanceOf[Component[TProps, TState, Any]]
    inline def createFunctional[TProps, TState](
      viewFn: js.Function1[/* props */ TState, ReactElement],
      getStores: js.Function2[
          /* maybeProps */ js.UndefOr[TProps], 
          /* maybeContext */ js.UndefOr[Any], 
          js.Array[typings.flux.libFluxStoreMod.^[Any]]
        ],
      calculateState: js.Function3[
          /* prevState */ js.UndefOr[TState], 
          /* maybeProps */ js.UndefOr[TProps], 
          /* maybeContext */ js.UndefOr[Any], 
          TState
        ],
      options: RealOptions
    ): Component[TProps, TState, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFunctional")(viewFn.asInstanceOf[js.Any], getStores.asInstanceOf[js.Any], calculateState.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Component[TProps, TState, Any]]
    
    inline def create_TPropsTState[TProps, TState](base: Component[TProps, TState, Any]): Component[TProps, TState, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(base.asInstanceOf[js.Any]).asInstanceOf[Component[TProps, TState, Any]]
    inline def create_TPropsTState[TProps, TState](base: Component[TProps, TState, Any], options: RealOptions): Component[TProps, TState, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(base.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Component[TProps, TState, Any]]
    
    inline def create_TPropsTStateTContext[TProps, TState, TContext](base: Component[TProps, TState, TContext]): Component[TProps, TState, TContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(base.asInstanceOf[js.Any]).asInstanceOf[Component[TProps, TState, TContext]]
    inline def create_TPropsTStateTContext[TProps, TState, TContext](base: Component[TProps, TState, TContext], options: RealOptions): Component[TProps, TState, TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(base.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Component[TProps, TState, TContext]]
  }
  
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
  inline def Mixin(stores: js.Array[typings.flux.libFluxStoreMod.^[Any]]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Mixin")(stores.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def Mixin(stores: js.Array[typings.flux.libFluxStoreMod.^[Any]], options: Options): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("Mixin")(stores.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * This is the basic building block of a Flux application. All of your stores
    * should extend this class.
    */
  /* note: abstract class */ @JSImport("flux/utils", "ReduceStore")
  @js.native
  open class ReduceStore[TState, TPayload] ()
    extends typings.flux.libFluxReduceStoreMod.^[TState, TPayload]
  
  /**
    * This class represents the most basic functionality for a FluxStore. Do not
    * extend this store directly; instead extend FluxReduceStore when creating a
    * new store.
    */
  /* note: abstract class */ @JSImport("flux/utils", "Store")
  @js.native
  open class Store[TPayload] protected ()
    extends typings.flux.libFluxStoreMod.^[TPayload] {
    /**
      * Constructs and registers an instance of this store with the given dispatcher.
      */
    def this(dispatcher: typings.flux.libDispatcherMod.^[TPayload]) = this()
  }
}
