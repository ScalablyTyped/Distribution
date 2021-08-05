package typings.fortawesomeFontawesomeSvgCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbstractElement extends StObject {
  
  var attributes: js.Any
  
  var children: js.UndefOr[js.Array[AbstractElement]] = js.undefined
  
  var tag: String
}
object AbstractElement {
  
  inline def apply(attributes: js.Any, tag: String): AbstractElement = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractElement]
  }
  
  extension [Self <: AbstractElement](x: Self) {
    
    inline def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: js.Array[AbstractElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: AbstractElement*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
