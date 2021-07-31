package typings.devtools.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementId extends StObject {
  
  var elementId: String
}
object ElementId {
  
  @scala.inline
  def apply(elementId: String): ElementId = {
    val __obj = js.Dynamic.literal(elementId = elementId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementId]
  }
  
  @scala.inline
  implicit class ElementIdMutableBuilder[Self <: ElementId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElementId(value: String): Self = StObject.set(x, "elementId", value.asInstanceOf[js.Any])
  }
}
