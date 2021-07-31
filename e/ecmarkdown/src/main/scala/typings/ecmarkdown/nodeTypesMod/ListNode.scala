package typings.ecmarkdown.nodeTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.ecmarkdown.nodeTypesMod.UnorderedListNode
  - typings.ecmarkdown.nodeTypesMod.OrderedListNode
*/
trait ListNode extends StObject
object ListNode {
  
  @scala.inline
  def OrderedListNode(contents: js.Array[OrderedListItemNode], indent: Double, location: LocationRange, start: Double): typings.ecmarkdown.nodeTypesMod.OrderedListNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "ol", start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.OrderedListNode]
  }
  
  @scala.inline
  def UnorderedListNode(contents: js.Array[UnorderedListItemNode], indent: Double, location: LocationRange): typings.ecmarkdown.nodeTypesMod.UnorderedListNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "ul")
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.UnorderedListNode]
  }
}
