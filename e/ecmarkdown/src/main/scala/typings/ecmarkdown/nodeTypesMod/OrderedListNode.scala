package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.ol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderedListNode
  extends StObject
     with ListNode
     with Node {
  
  var contents: js.Array[OrderedListItemNode]
  
  var indent: Double
  
  var location: LocationRange
  
  var name: ol
  
  var start: Double
}
object OrderedListNode {
  
  @scala.inline
  def apply(contents: js.Array[OrderedListItemNode], indent: Double, location: LocationRange, start: Double): OrderedListNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "ol", start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderedListNode]
  }
  
  @scala.inline
  implicit class OrderedListNodeMutableBuilder[Self <: OrderedListNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContents(value: js.Array[OrderedListItemNode]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentsVarargs(value: OrderedListItemNode*): Self = StObject.set(x, "contents", js.Array(value :_*))
    
    @scala.inline
    def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ol): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
