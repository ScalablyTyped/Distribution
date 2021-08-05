package typings.flux

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.react.mod.StatelessComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fluxContainerMod {
  
  @JSImport("flux/lib/FluxContainer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create[TProps](base: Component[TProps, js.Any, js.Any]): Component[TProps, js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(base.asInstanceOf[js.Any]).asInstanceOf[Component[TProps, js.Any, js.Any]]
  inline def create[TProps](base: Component[TProps, js.Any, js.Any], options: RealOptions): Component[TProps, js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(base.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Component[TProps, js.Any, js.Any]]
  inline def create[TProps, TState, TContext, TStatic](base: (Component[TProps, TState, TContext]) & TStatic): (Component[TProps, TState, TContext]) & TStatic = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(base.asInstanceOf[js.Any]).asInstanceOf[(Component[TProps, TState, TContext]) & TStatic]
  inline def create[TProps, TState, TContext, TStatic](base: (Component[TProps, TState, TContext]) & TStatic, options: RealOptions): (Component[TProps, TState, TContext]) & TStatic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(base.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[(Component[TProps, TState, TContext]) & TStatic]
  
  inline def createFunctional[TProps, TState](
    viewFn: js.Function1[/* props */ TState, ReactElement],
    getStores: js.Function2[
      /* maybeProps */ js.UndefOr[TProps], 
      /* maybeContext */ js.UndefOr[js.Any], 
      js.Array[typings.flux.fluxStoreMod.^[js.Any]]
    ],
    calculateState: js.Function3[
      /* prevState */ js.UndefOr[TState], 
      /* maybeProps */ js.UndefOr[TProps], 
      /* maybeContext */ js.UndefOr[js.Any], 
      TState
    ]
  ): Component[TProps, TState, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFunctional")(viewFn.asInstanceOf[js.Any], getStores.asInstanceOf[js.Any], calculateState.asInstanceOf[js.Any])).asInstanceOf[Component[TProps, TState, js.Any]]
  inline def createFunctional[TProps, TState](
    viewFn: js.Function1[/* props */ TState, ReactElement],
    getStores: js.Function2[
      /* maybeProps */ js.UndefOr[TProps], 
      /* maybeContext */ js.UndefOr[js.Any], 
      js.Array[typings.flux.fluxStoreMod.^[js.Any]]
    ],
    calculateState: js.Function3[
      /* prevState */ js.UndefOr[TState], 
      /* maybeProps */ js.UndefOr[TProps], 
      /* maybeContext */ js.UndefOr[js.Any], 
      TState
    ],
    options: RealOptions
  ): Component[TProps, TState, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFunctional")(viewFn.asInstanceOf[js.Any], getStores.asInstanceOf[js.Any], calculateState.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Component[TProps, TState, js.Any]]
  
  inline def create_TPropsTState[TProps, TState](base: Component[TProps, TState, js.Any]): Component[TProps, TState, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(base.asInstanceOf[js.Any]).asInstanceOf[Component[TProps, TState, js.Any]]
  inline def create_TPropsTState[TProps, TState](base: Component[TProps, TState, js.Any], options: RealOptions): Component[TProps, TState, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(base.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Component[TProps, TState, js.Any]]
  
  inline def create_TPropsTStateTContext[TProps, TState, TContext](base: Component[TProps, TState, TContext]): Component[TProps, TState, TContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(base.asInstanceOf[js.Any]).asInstanceOf[Component[TProps, TState, TContext]]
  inline def create_TPropsTStateTContext[TProps, TState, TContext](base: Component[TProps, TState, TContext], options: RealOptions): Component[TProps, TState, TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(base.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Component[TProps, TState, TContext]]
  
  type Component[TProps, TState, TContext] = ComponentConstructor[TProps] & (ComponentStatic[TProps, TState, TContext])
  
  type ComponentConstructor[TProps] = (ComponentClass[TProps, ComponentState]) | StatelessComponent[TProps]
  
  @js.native
  trait ComponentStatic[TProps, TState, TContext] extends StObject {
    
    def calculateState(prevState: TState): TState = js.native
    def calculateState(prevState: TState, maybeProps: TProps): TState = js.native
    def calculateState(prevState: TState, maybeProps: TProps, maybeContext: TContext): TState = js.native
    def calculateState(prevState: TState, maybeProps: Unit, maybeContext: TContext): TState = js.native
    
    def getStores(): StoresList = js.native
    def getStores(maybeProps: TProps): StoresList = js.native
    def getStores(maybeProps: TProps, maybeContext: TContext): StoresList = js.native
    def getStores(maybeProps: Unit, maybeContext: TContext): StoresList = js.native
  }
  
  trait RealOptions extends StObject {
    
    /** @default true */
    var pure: js.UndefOr[Boolean] = js.undefined
    
    /** @default false */
    var withContext: js.UndefOr[Boolean] = js.undefined
    
    /** @default false */
    var withProps: js.UndefOr[Boolean] = js.undefined
  }
  object RealOptions {
    
    inline def apply(): RealOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RealOptions]
    }
    
    extension [Self <: RealOptions](x: Self) {
      
      inline def setPure(value: Boolean): Self = StObject.set(x, "pure", value.asInstanceOf[js.Any])
      
      inline def setPureUndefined: Self = StObject.set(x, "pure", js.undefined)
      
      inline def setWithContext(value: Boolean): Self = StObject.set(x, "withContext", value.asInstanceOf[js.Any])
      
      inline def setWithContextUndefined: Self = StObject.set(x, "withContext", js.undefined)
      
      inline def setWithProps(value: Boolean): Self = StObject.set(x, "withProps", value.asInstanceOf[js.Any])
      
      inline def setWithPropsUndefined: Self = StObject.set(x, "withProps", js.undefined)
    }
  }
  
  type StoresList = js.Array[typings.flux.fluxStoreMod.^[js.Any]]
}
