package typings.glimmerInterfaces

import typings.glimmerInterfaces.distTypesLibComponentsMod.ComponentDefinitionState
import typings.glimmerInterfaces.distTypesLibComponentsMod.ComponentInstanceState
import typings.glimmerInterfaces.distTypesLibCoreMod.Option
import typings.glimmerInterfaces.distTypesLibManagersInternalComponentMod.InternalComponentCapability
import typings.glimmerInterfaces.distTypesLibManagersInternalComponentMod.InternalComponentManager
import typings.glimmerInterfaces.distTypesLibRuntimeHelperMod.HelperDefinitionState
import typings.glimmerInterfaces.distTypesLibRuntimeModifierMod.ModifierDefinitionState
import typings.glimmerInterfaces.distTypesLibRuntimeOwnerMod.Owner
import typings.glimmerInterfaces.distTypesLibTemplateMod.CompilableProgram
import typings.glimmerInterfaces.distTypesLibTemplateMod.Template
import typings.glimmerInterfaces.glimmerInterfacesInts.`0`
import typings.glimmerInterfaces.glimmerInterfacesInts.`1`
import typings.glimmerInterfaces.glimmerInterfacesInts.`2`
import typings.glimmerInterfaces.glimmerInterfacesInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibSerializeMod {
  
  trait CompileTimeComponent extends StObject {
    
    var capabilities: InternalComponentCapability
    
    var compilable: Option[CompilableProgram]
    
    var handle: Double
  }
  object CompileTimeComponent {
    
    inline def apply(capabilities: InternalComponentCapability, handle: Double): CompileTimeComponent = {
      val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], compilable = null)
      __obj.asInstanceOf[CompileTimeComponent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompileTimeComponent] (val x: Self) extends AnyVal {
      
      inline def setCapabilities(value: InternalComponentCapability): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      inline def setCompilable(value: Option[CompilableProgram]): Self = StObject.set(x, "compilable", value.asInstanceOf[js.Any])
      
      inline def setCompilableNull: Self = StObject.set(x, "compilable", null)
      
      inline def setHandle(value: Double): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    }
  }
  
  trait CompileTimeResolver[O /* <: Owner */] extends StObject {
    
    // TODO: These are used to lookup keywords that are implemented as helpers/modifiers.
    // We should try to figure out a cleaner way to do this.
    def lookupBuiltInHelper(name: String): Option[HelperDefinitionState]
    
    def lookupBuiltInModifier(name: String): Option[ModifierDefinitionState]
    
    def lookupComponent(name: String, owner: O): Option[
        ResolvedComponentDefinition[
          ComponentDefinitionState, 
          ComponentInstanceState, 
          InternalComponentManager[ComponentInstanceState, ComponentDefinitionState]
        ]
      ]
    
    def lookupHelper(name: String, owner: O): Option[HelperDefinitionState]
    
    def lookupModifier(name: String, owner: O): Option[ModifierDefinitionState]
  }
  object CompileTimeResolver {
    
    inline def apply[O /* <: Owner */](
      lookupBuiltInHelper: String => Option[HelperDefinitionState],
      lookupBuiltInModifier: String => Option[ModifierDefinitionState],
      lookupComponent: (String, O) => Option[
          ResolvedComponentDefinition[
            ComponentDefinitionState, 
            ComponentInstanceState, 
            InternalComponentManager[ComponentInstanceState, ComponentDefinitionState]
          ]
        ],
      lookupHelper: (String, O) => Option[HelperDefinitionState],
      lookupModifier: (String, O) => Option[ModifierDefinitionState]
    ): CompileTimeResolver[O] = {
      val __obj = js.Dynamic.literal(lookupBuiltInHelper = js.Any.fromFunction1(lookupBuiltInHelper), lookupBuiltInModifier = js.Any.fromFunction1(lookupBuiltInModifier), lookupComponent = js.Any.fromFunction2(lookupComponent), lookupHelper = js.Any.fromFunction2(lookupHelper), lookupModifier = js.Any.fromFunction2(lookupModifier))
      __obj.asInstanceOf[CompileTimeResolver[O]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompileTimeResolver[?], O /* <: Owner */] (val x: Self & CompileTimeResolver[O]) extends AnyVal {
      
      inline def setLookupBuiltInHelper(value: String => Option[HelperDefinitionState]): Self = StObject.set(x, "lookupBuiltInHelper", js.Any.fromFunction1(value))
      
      inline def setLookupBuiltInModifier(value: String => Option[ModifierDefinitionState]): Self = StObject.set(x, "lookupBuiltInModifier", js.Any.fromFunction1(value))
      
      inline def setLookupComponent(
        value: (String, O) => Option[
              ResolvedComponentDefinition[
                ComponentDefinitionState, 
                ComponentInstanceState, 
                InternalComponentManager[ComponentInstanceState, ComponentDefinitionState]
              ]
            ]
      ): Self = StObject.set(x, "lookupComponent", js.Any.fromFunction2(value))
      
      inline def setLookupHelper(value: (String, O) => Option[HelperDefinitionState]): Self = StObject.set(x, "lookupHelper", js.Any.fromFunction2(value))
      
      inline def setLookupModifier(value: (String, O) => Option[ModifierDefinitionState]): Self = StObject.set(x, "lookupModifier", js.Any.fromFunction2(value))
    }
  }
  
  trait ResolvedComponentDefinition[D, I, M /* <: InternalComponentManager[I, D] */] extends StObject {
    
    var manager: M
    
    var state: D
    
    var template: Template | Null
  }
  object ResolvedComponentDefinition {
    
    inline def apply[D, I, M /* <: InternalComponentManager[I, D] */](manager: M, state: D): ResolvedComponentDefinition[D, I, M] = {
      val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], template = null)
      __obj.asInstanceOf[ResolvedComponentDefinition[D, I, M]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResolvedComponentDefinition[?, ?, ?], D, I, M /* <: InternalComponentManager[I, D] */] (val x: Self & (ResolvedComponentDefinition[D, I, M])) extends AnyVal {
      
      inline def setManager(value: M): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
      
      inline def setState(value: D): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setTemplate(value: Template): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateNull: Self = StObject.set(x, "template", null)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.glimmerInterfaces.glimmerInterfacesInts.`0`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`1`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`2`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`3`
  */
  trait ResolverContext extends StObject
  object ResolverContext {
    
    inline def Component: `0` = 0.asInstanceOf[`0`]
    
    inline def Helper: `2` = 2.asInstanceOf[`2`]
    
    inline def HelperOrComponent: `3` = 3.asInstanceOf[`3`]
    
    inline def Modifier: `1` = 1.asInstanceOf[`1`]
  }
  
  trait RuntimeResolver[O /* <: Owner */] extends StObject {
    
    def lookupComponent(name: String, owner: O): Option[
        ResolvedComponentDefinition[
          ComponentDefinitionState, 
          ComponentInstanceState, 
          InternalComponentManager[ComponentInstanceState, ComponentDefinitionState]
        ]
      ]
  }
  object RuntimeResolver {
    
    inline def apply[O /* <: Owner */](
      lookupComponent: (String, O) => Option[
          ResolvedComponentDefinition[
            ComponentDefinitionState, 
            ComponentInstanceState, 
            InternalComponentManager[ComponentInstanceState, ComponentDefinitionState]
          ]
        ]
    ): RuntimeResolver[O] = {
      val __obj = js.Dynamic.literal(lookupComponent = js.Any.fromFunction2(lookupComponent))
      __obj.asInstanceOf[RuntimeResolver[O]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RuntimeResolver[?], O /* <: Owner */] (val x: Self & RuntimeResolver[O]) extends AnyVal {
      
      inline def setLookupComponent(
        value: (String, O) => Option[
              ResolvedComponentDefinition[
                ComponentDefinitionState, 
                ComponentInstanceState, 
                InternalComponentManager[ComponentInstanceState, ComponentDefinitionState]
              ]
            ]
      ): Self = StObject.set(x, "lookupComponent", js.Any.fromFunction2(value))
    }
  }
}
