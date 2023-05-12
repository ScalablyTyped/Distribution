package typings.glimmerInterfaces

import typings.glimmerInterfaces.distTypesLibCoreMod.Dict
import typings.glimmerInterfaces.distTypesLibManagersInternalComponentMod.InternalComponentCapability
import typings.glimmerInterfaces.distTypesLibManagersInternalComponentMod.InternalComponentManager
import typings.glimmerInterfaces.distTypesLibRuntimeScopeMod.ScopeSlot
import typings.glimmerInterfaces.distTypesLibTemplateMod.CompilableProgram
import typings.glimmerInterfaces.distTypesLibTier1SymbolTableMod.ProgramSymbolTable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibComponentsMod {
  
  trait ComponentDefinition[D /* <: ComponentDefinitionState */, I, M /* <: InternalComponentManager[I, D] */] extends StObject {
    
    var capabilities: InternalComponentCapability
    
    var compilable: CompilableProgram | Null
    
    var handle: Double
    
    var manager: M
    
    var resolvedName: String | Null
    
    var state: D
  }
  object ComponentDefinition {
    
    inline def apply[D /* <: ComponentDefinitionState */, I, M /* <: InternalComponentManager[I, D] */](capabilities: InternalComponentCapability, handle: Double, manager: M, state: D): ComponentDefinition[D, I, M] = {
      val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], compilable = null, resolvedName = null)
      __obj.asInstanceOf[ComponentDefinition[D, I, M]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComponentDefinition[?, ?, ?], D /* <: ComponentDefinitionState */, I, M /* <: InternalComponentManager[I, D] */] (val x: Self & (ComponentDefinition[D, I, M])) extends AnyVal {
      
      inline def setCapabilities(value: InternalComponentCapability): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      inline def setCompilable(value: CompilableProgram): Self = StObject.set(x, "compilable", value.asInstanceOf[js.Any])
      
      inline def setCompilableNull: Self = StObject.set(x, "compilable", null)
      
      inline def setHandle(value: Double): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setManager(value: M): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
      
      inline def setResolvedName(value: String): Self = StObject.set(x, "resolvedName", value.asInstanceOf[js.Any])
      
      inline def setResolvedNameNull: Self = StObject.set(x, "resolvedName", null)
      
      inline def setState(value: D): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  type ComponentDefinitionState = js.Object
  
  trait ComponentInstance[D /* <: ComponentDefinitionState */, I, M /* <: InternalComponentManager[I, D] */] extends StObject {
    
    var capabilities: InternalComponentCapability
    
    var definition: ComponentDefinition[D, I, InternalComponentManager[I, D]]
    
    var handle: Double
    
    var lookup: (Record[String, ScopeSlot]) | Null
    
    var manager: M
    
    var state: I
    
    var table: ProgramSymbolTable
  }
  object ComponentInstance {
    
    inline def apply[D /* <: ComponentDefinitionState */, I, M /* <: InternalComponentManager[I, D] */](
      capabilities: InternalComponentCapability,
      definition: ComponentDefinition[D, I, InternalComponentManager[I, D]],
      handle: Double,
      manager: M,
      state: I,
      table: ProgramSymbolTable
    ): ComponentInstance[D, I, M] = {
      val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], lookup = null)
      __obj.asInstanceOf[ComponentInstance[D, I, M]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComponentInstance[?, ?, ?], D /* <: ComponentDefinitionState */, I, M /* <: InternalComponentManager[I, D] */] (val x: Self & (ComponentInstance[D, I, M])) extends AnyVal {
      
      inline def setCapabilities(value: InternalComponentCapability): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      inline def setDefinition(value: ComponentDefinition[D, I, InternalComponentManager[I, D]]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      inline def setHandle(value: Double): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setLookup(value: Record[String, ScopeSlot]): Self = StObject.set(x, "lookup", value.asInstanceOf[js.Any])
      
      inline def setLookupNull: Self = StObject.set(x, "lookup", null)
      
      inline def setManager(value: M): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
      
      inline def setState(value: I): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setTable(value: ProgramSymbolTable): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    }
  }
  
  type ComponentInstanceState = Any
  
  trait PreparedArguments extends StObject {
    
    var named: Dict[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reference */ Any
      ]
    
    var positional: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reference */ Any
      ]
  }
  object PreparedArguments {
    
    inline def apply(
      named: Dict[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reference */ Any
        ],
      positional: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reference */ Any
        ]
    ): PreparedArguments = {
      val __obj = js.Dynamic.literal(named = named.asInstanceOf[js.Any], positional = positional.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreparedArguments]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PreparedArguments] (val x: Self) extends AnyVal {
      
      inline def setNamed(
        value: Dict[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reference */ Any
            ]
      ): Self = StObject.set(x, "named", value.asInstanceOf[js.Any])
      
      inline def setPositional(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reference */ Any
            ]
      ): Self = StObject.set(x, "positional", value.asInstanceOf[js.Any])
      
      inline def setPositionalVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reference */ Any)*
      ): Self = StObject.set(x, "positional", js.Array(value*))
    }
  }
}
