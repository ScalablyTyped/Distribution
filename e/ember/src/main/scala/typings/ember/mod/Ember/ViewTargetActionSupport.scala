package typings.ember.mod.Ember

import typings.emberObject.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewTargetActionSupport extends StObject {
  
  var actionContext: js.Any = js.native
  
  var target: js.Any = js.native
}
object ViewTargetActionSupport {
  
  @JSImport("ember", "Ember.ViewTargetActionSupport")
  @js.native
  val ^ : Mixin[ViewTargetActionSupport, default] = js.native
  
  @scala.inline
  implicit class ViewTargetActionSupportMutableBuilder[Self <: ViewTargetActionSupport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionContext(value: js.Any): Self = StObject.set(x, "actionContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
