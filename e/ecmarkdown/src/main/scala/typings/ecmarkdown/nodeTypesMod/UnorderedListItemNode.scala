package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.`unordered-list-item`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnorderedListItemNode extends Node {
  
  var contents: js.Array[FragmentNode] = js.native
  
  var id: String | Null = js.native
  
  var location: LocationRange = js.native
  
  var name: `unordered-list-item` = js.native
  
  var sublist: ListNode | Null = js.native
}
object UnorderedListItemNode {
  
  @scala.inline
  def apply(contents: js.Array[FragmentNode], location: LocationRange, name: `unordered-list-item`): UnorderedListItemNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnorderedListItemNode]
  }
  
  @scala.inline
  implicit class UnorderedListItemNodeMutableBuilder[Self <: UnorderedListItemNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContents(value: js.Array[FragmentNode]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentsVarargs(value: FragmentNode*): Self = StObject.set(x, "contents", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: `unordered-list-item`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSublist(value: ListNode): Self = StObject.set(x, "sublist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSublistNull: Self = StObject.set(x, "sublist", null)
  }
}
