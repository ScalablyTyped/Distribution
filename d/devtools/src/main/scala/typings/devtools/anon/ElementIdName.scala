package typings.devtools.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementIdName extends StObject {
  
  var elementId: String
  
  var name: String
}
object ElementIdName {
  
  @scala.inline
  def apply(elementId: String, name: String): ElementIdName = {
    val __obj = js.Dynamic.literal(elementId = elementId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementIdName]
  }
  
  @scala.inline
  implicit class ElementIdNameMutableBuilder[Self <: ElementIdName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElementId(value: String): Self = StObject.set(x, "elementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
