package typings.devtools

import typings.devtools.anon.Actions
import typings.devtools.anon.PointerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object performActionsMod {
  
  @JSImport("devtools/build/commands/performActions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(hasActions: Actions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasActions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  trait Action extends StObject {
    
    var button: js.UndefOr[Double] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var origin: js.UndefOr[js.Any] = js.undefined
    
    var `type`: String
    
    var value: js.UndefOr[String] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object Action {
    
    @scala.inline
    def apply(`type`: String): Action = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    @scala.inline
    implicit class ActionMutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setOrigin(value: js.Any): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait ActionsParameter extends StObject {
    
    var actions: js.Array[Action]
    
    var parameters: js.UndefOr[PointerType] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ActionsParameter {
    
    @scala.inline
    def apply(actions: js.Array[Action]): ActionsParameter = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionsParameter]
    }
    
    @scala.inline
    implicit class ActionsParameterMutableBuilder[Self <: ActionsParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: js.Array[Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
      @scala.inline
      def setParameters(value: PointerType): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
