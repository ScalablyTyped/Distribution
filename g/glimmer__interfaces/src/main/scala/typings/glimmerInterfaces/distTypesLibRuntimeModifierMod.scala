package typings.glimmerInterfaces

import typings.glimmerInterfaces.distTypesLibManagersInternalModifierMod.InternalModifierManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibRuntimeModifierMod {
  
  trait ModifierDefinition[I, D /* <: ModifierDefinitionState */] extends StObject {
    
    var manager: InternalModifierManager[I, D]
    
    var resolvedName: String | Null
    
    var state: ModifierDefinitionState
  }
  object ModifierDefinition {
    
    inline def apply[I, D /* <: ModifierDefinitionState */](manager: InternalModifierManager[I, D], state: ModifierDefinitionState): ModifierDefinition[I, D] = {
      val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], resolvedName = null)
      __obj.asInstanceOf[ModifierDefinition[I, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModifierDefinition[?, ?], I, D /* <: ModifierDefinitionState */] (val x: Self & (ModifierDefinition[I, D])) extends AnyVal {
      
      inline def setManager(value: InternalModifierManager[I, D]): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
      
      inline def setResolvedName(value: String): Self = StObject.set(x, "resolvedName", value.asInstanceOf[js.Any])
      
      inline def setResolvedNameNull: Self = StObject.set(x, "resolvedName", null)
      
      inline def setState(value: ModifierDefinitionState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  type ModifierDefinitionState = js.Object
  
  trait ModifierInstance extends StObject {
    
    var definition: ModifierDefinition[Any, ModifierDefinitionState]
    
    var manager: InternalModifierManager[ModifierInstanceState, ModifierDefinitionState]
    
    var state: ModifierInstanceState
  }
  object ModifierInstance {
    
    inline def apply(
      definition: ModifierDefinition[Any, ModifierDefinitionState],
      manager: InternalModifierManager[ModifierInstanceState, ModifierDefinitionState],
      state: ModifierInstanceState
    ): ModifierInstance = {
      val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModifierInstance]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModifierInstance] (val x: Self) extends AnyVal {
      
      inline def setDefinition(value: ModifierDefinition[Any, ModifierDefinitionState]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      inline def setManager(value: InternalModifierManager[ModifierInstanceState, ModifierDefinitionState]): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
      
      inline def setState(value: ModifierInstanceState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  type ModifierInstanceState = Any
}
