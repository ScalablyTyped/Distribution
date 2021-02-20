package typings.emberComponent

import typings.emberObject.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object targetActionSupportMod {
  
  @js.native
  trait TargetActionSupport extends StObject {
    
    def triggerAction(opts: TriggerActionOptions): Boolean = js.native
  }
  object TargetActionSupport {
    
    @scala.inline
    def apply(triggerAction: TriggerActionOptions => Boolean): TargetActionSupport = {
      val __obj = js.Dynamic.literal(triggerAction = js.Any.fromFunction1(triggerAction))
      __obj.asInstanceOf[TargetActionSupport]
    }
    
    @scala.inline
    implicit class TargetActionSupportMutableBuilder[Self <: TargetActionSupport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTriggerAction(value: TriggerActionOptions => Boolean): Self = StObject.set(x, "triggerAction", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TriggerActionOptions extends StObject {
    
    var action: js.UndefOr[String] = js.native
    
    var actionContext: js.UndefOr[default] = js.native
    
    var target: js.UndefOr[default] = js.native
  }
  object TriggerActionOptions {
    
    @scala.inline
    def apply(): TriggerActionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TriggerActionOptions]
    }
    
    @scala.inline
    implicit class TriggerActionOptionsMutableBuilder[Self <: TriggerActionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionContext(value: default): Self = StObject.set(x, "actionContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionContextUndefined: Self = StObject.set(x, "actionContext", js.undefined)
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setTarget(value: default): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
