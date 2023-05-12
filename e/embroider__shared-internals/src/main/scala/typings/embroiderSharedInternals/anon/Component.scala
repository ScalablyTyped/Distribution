package typings.embroiderSharedInternals.anon

import typings.babelTypes.mod.Identifier_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Component extends StObject {
  
  var component: Identifier_
  
  var template: Identifier_
}
object Component {
  
  inline def apply(component: Identifier_, template: Identifier_): Component = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Component] (val x: Self) extends AnyVal {
    
    inline def setComponent(value: Identifier_): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setTemplate(value: Identifier_): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
