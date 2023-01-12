package typings.ecmarkdown.distNodeTypesMod

import typings.ecmarkdown.anon.Key
import typings.ecmarkdown.ecmarkdownStrings.`ordered-list-item`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderedListItemNode
  extends StObject
     with Node {
  
  var attrs: js.Array[Key]
  
  var contents: js.Array[FragmentNode]
  
  var location: LocationRange
  
  var name: `ordered-list-item`
  
  var sublist: ListNode | Null
}
object OrderedListItemNode {
  
  inline def apply(attrs: js.Array[Key], contents: js.Array[FragmentNode], location: LocationRange): OrderedListItemNode = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "ordered-list-item", sublist = null)
    __obj.asInstanceOf[OrderedListItemNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrderedListItemNode] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: js.Array[Key]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setAttrsVarargs(value: Key*): Self = StObject.set(x, "attrs", js.Array(value*))
    
    inline def setContents(value: js.Array[FragmentNode]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsVarargs(value: FragmentNode*): Self = StObject.set(x, "contents", js.Array(value*))
    
    inline def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setName(value: `ordered-list-item`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSublist(value: ListNode): Self = StObject.set(x, "sublist", value.asInstanceOf[js.Any])
    
    inline def setSublistNull: Self = StObject.set(x, "sublist", null)
  }
}
