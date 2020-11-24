package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.`unordered-list-item`
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
  implicit class UnorderedListItemNodeOps[Self <: UnorderedListItemNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContentsVarargs(value: FragmentNode*): Self = this.set("contents", js.Array(value :_*))
    
    @scala.inline
    def setContents(value: js.Array[FragmentNode]): Self = this.set("contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: LocationRange): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: `unordered-list-item`): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    
    @scala.inline
    def setSublist(value: ListNode): Self = this.set("sublist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSublistNull: Self = this.set("sublist", null)
  }
}
