package typings.flux

import typings.flux.fluxStoreMod.^
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.react.mod.StatelessComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fluxContainerMod {
  
  @JSImport("flux/lib/FluxContainer", "create")
  @js.native
  def create[TProps](base: Component[TProps, _, _]): Component[TProps, _, _] = js.native
  @JSImport("flux/lib/FluxContainer", "create")
  @js.native
  def create[TProps](base: Component[TProps, _, _], options: RealOptions): Component[TProps, _, _] = js.native
  
  @JSImport("flux/lib/FluxContainer", "createFunctional")
  @js.native
  def createFunctional[TProps, TState](
    viewFn: js.Function1[/* props */ TState, ReactElement],
    getStores: js.Function2[
      /* maybeProps */ js.UndefOr[TProps], 
      /* maybeContext */ js.UndefOr[js.Any], 
      js.Array[^[_]]
    ],
    calculateState: js.Function3[
      /* prevState */ js.UndefOr[TState], 
      /* maybeProps */ js.UndefOr[TProps], 
      /* maybeContext */ js.UndefOr[js.Any], 
      TState
    ]
  ): Component[TProps, TState, _] = js.native
  @JSImport("flux/lib/FluxContainer", "createFunctional")
  @js.native
  def createFunctional[TProps, TState](
    viewFn: js.Function1[/* props */ TState, ReactElement],
    getStores: js.Function2[
      /* maybeProps */ js.UndefOr[TProps], 
      /* maybeContext */ js.UndefOr[js.Any], 
      js.Array[^[_]]
    ],
    calculateState: js.Function3[
      /* prevState */ js.UndefOr[TState], 
      /* maybeProps */ js.UndefOr[TProps], 
      /* maybeContext */ js.UndefOr[js.Any], 
      TState
    ],
    options: RealOptions
  ): Component[TProps, TState, _] = js.native
  
  @JSImport("flux/lib/FluxContainer", "create")
  @js.native
  def create_TPropsTState[TProps, TState](base: Component[TProps, TState, _]): Component[TProps, TState, _] = js.native
  @JSImport("flux/lib/FluxContainer", "create")
  @js.native
  def create_TPropsTState[TProps, TState](base: Component[TProps, TState, _], options: RealOptions): Component[TProps, TState, _] = js.native
  @JSImport("flux/lib/FluxContainer", "create")
  @js.native
  def create_TPropsTStateTContext[TProps, TState, TContext](base: Component[TProps, TState, TContext]): Component[TProps, TState, TContext] = js.native
  @JSImport("flux/lib/FluxContainer", "create")
  @js.native
  def create_TPropsTStateTContext[TProps, TState, TContext](base: Component[TProps, TState, TContext], options: RealOptions): Component[TProps, TState, TContext] = js.native
  @JSImport("flux/lib/FluxContainer", "create")
  @js.native
  def create_TPropsTStateTContextTStatic_Intersection[TProps, TState, TContext, TStatic](base: (Component[TProps, TState, TContext]) with TStatic): (Component[TProps, TState, TContext]) with TStatic = js.native
  @JSImport("flux/lib/FluxContainer", "create")
  @js.native
  def create_TPropsTStateTContextTStatic_Intersection[TProps, TState, TContext, TStatic](base: (Component[TProps, TState, TContext]) with TStatic, options: RealOptions): (Component[TProps, TState, TContext]) with TStatic = js.native
  
  type Component[TProps, TState, TContext] = ComponentConstructor[TProps] with (ComponentStatic[TProps, TState, TContext])
  
  type ComponentConstructor[TProps] = (ComponentClass[TProps, ComponentState]) | StatelessComponent[TProps]
  
  @js.native
  trait ComponentStatic[TProps, TState, TContext] extends StObject {
    
    def calculateState(prevState: TState): TState = js.native
    def calculateState(prevState: TState, maybeProps: TProps): TState = js.native
    def calculateState(prevState: TState, maybeProps: TProps, maybeContext: TContext): TState = js.native
    def calculateState(prevState: TState, maybeProps: js.UndefOr[scala.Nothing], maybeContext: TContext): TState = js.native
    
    def getStores(): StoresList = js.native
    def getStores(maybeProps: TProps): StoresList = js.native
    def getStores(maybeProps: TProps, maybeContext: TContext): StoresList = js.native
    def getStores(maybeProps: js.UndefOr[scala.Nothing], maybeContext: TContext): StoresList = js.native
  }
  
  @js.native
  trait RealOptions extends StObject {
    
    /** @default true */
    var pure: js.UndefOr[Boolean] = js.native
    
    /** @default false */
    var withContext: js.UndefOr[Boolean] = js.native
    
    /** @default false */
    var withProps: js.UndefOr[Boolean] = js.native
  }
  object RealOptions {
    
    @scala.inline
    def apply(): RealOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RealOptions]
    }
    
    @scala.inline
    implicit class RealOptionsMutableBuilder[Self <: RealOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPure(value: Boolean): Self = StObject.set(x, "pure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPureUndefined: Self = StObject.set(x, "pure", js.undefined)
      
      @scala.inline
      def setWithContext(value: Boolean): Self = StObject.set(x, "withContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithContextUndefined: Self = StObject.set(x, "withContext", js.undefined)
      
      @scala.inline
      def setWithProps(value: Boolean): Self = StObject.set(x, "withProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithPropsUndefined: Self = StObject.set(x, "withProps", js.undefined)
    }
  }
  
  type StoresList = js.Array[^[js.Any]]
}
