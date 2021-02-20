package typings.flowdoc.Flow

import typings.flowdoc.flowdocStrings.DOCUMENT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Document extends StObject {
  
  var children: js.Array[Page] = js.native
  
  var id: String = js.native
  
  var name: String = js.native
  
  var `type`: DOCUMENT = js.native
}
object Document {
  
  @scala.inline
  def apply(children: js.Array[Page], id: String, name: String, `type`: DOCUMENT): Document = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
  
  @scala.inline
  implicit class DocumentMutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[Page]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: Page*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: DOCUMENT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
