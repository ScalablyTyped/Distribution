package typings.estree.mod

import typings.estree.anon.Cooked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateElement
  extends StObject
     with BaseNode {
  
  var tail: Boolean
  
  @JSName("type")
  var type_TemplateElement: typings.estree.estreeStrings.TemplateElement
  
  var value: Cooked
}
object TemplateElement {
  
  inline def apply(tail: Boolean, value: Cooked): TemplateElement = {
    val __obj = js.Dynamic.literal(tail = tail.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TemplateElement")
    __obj.asInstanceOf[TemplateElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemplateElement] (val x: Self) extends AnyVal {
    
    inline def setTail(value: Boolean): Self = StObject.set(x, "tail", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.estree.estreeStrings.TemplateElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Cooked): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
