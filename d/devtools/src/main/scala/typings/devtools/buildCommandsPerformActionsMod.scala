package typings.devtools

import typings.devtools.anon.Actions
import typings.devtools.anon.PointerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsPerformActionsMod {
  
  @JSImport("devtools/build/commands/performActions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasActions: Actions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasActions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  trait Action extends StObject {
    
    var button: js.UndefOr[Double] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var origin: js.UndefOr[Any] = js.undefined
    
    var `type`: String
    
    var value: js.UndefOr[String] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object Action {
    
    inline def apply(`type`: String): Action = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    extension [Self <: Action](x: Self) {
      
      inline def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setOrigin(value: Any): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait ActionsParameter extends StObject {
    
    var actions: js.Array[Action]
    
    var parameters: js.UndefOr[PointerType] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ActionsParameter {
    
    inline def apply(actions: js.Array[Action]): ActionsParameter = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionsParameter]
    }
    
    extension [Self <: ActionsParameter](x: Self) {
      
      inline def setActions(value: js.Array[Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setParameters(value: PointerType): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
