package typings.flowdoc.Flow

import typings.flowdoc.flowdocStrings.DOCUMENT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Document extends StObject {
  
  var children: js.Array[Page]
  
  var id: String
  
  var name: String
  
  var `type`: DOCUMENT
}
object Document {
  
  inline def apply(children: js.Array[Page], id: String, name: String): Document = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DOCUMENT")
    __obj.asInstanceOf[Document]
  }
  
  extension [Self <: Document](x: Self) {
    
    inline def setChildren(value: js.Array[Page]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: Page*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: DOCUMENT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
