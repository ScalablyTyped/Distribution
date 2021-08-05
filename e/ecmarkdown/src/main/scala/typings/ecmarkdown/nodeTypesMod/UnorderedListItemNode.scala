package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.`unordered-list-item`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnorderedListItemNode
  extends StObject
     with Node {
  
  var contents: js.Array[FragmentNode]
  
  var id: String | Null
  
  var location: LocationRange
  
  var name: `unordered-list-item`
  
  var sublist: ListNode | Null
}
object UnorderedListItemNode {
  
  inline def apply(contents: js.Array[FragmentNode], location: LocationRange): UnorderedListItemNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "unordered-list-item", id = null, sublist = null)
    __obj.asInstanceOf[UnorderedListItemNode]
  }
  
  extension [Self <: UnorderedListItemNode](x: Self) {
    
    inline def setContents(value: js.Array[FragmentNode]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsVarargs(value: FragmentNode*): Self = StObject.set(x, "contents", js.Array(value :_*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setName(value: `unordered-list-item`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSublist(value: ListNode): Self = StObject.set(x, "sublist", value.asInstanceOf[js.Any])
    
    inline def setSublistNull: Self = StObject.set(x, "sublist", null)
  }
}
