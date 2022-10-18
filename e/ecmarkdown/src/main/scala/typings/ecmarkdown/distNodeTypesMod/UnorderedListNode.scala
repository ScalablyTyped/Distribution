package typings.ecmarkdown.distNodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.ul
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnorderedListNode
  extends StObject
     with ListNode
     with Node {
  
  var contents: js.Array[UnorderedListItemNode]
  
  var indent: Double
  
  var location: LocationRange
  
  var name: ul
}
object UnorderedListNode {
  
  inline def apply(contents: js.Array[UnorderedListItemNode], indent: Double, location: LocationRange): UnorderedListNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "ul")
    __obj.asInstanceOf[UnorderedListNode]
  }
  
  extension [Self <: UnorderedListNode](x: Self) {
    
    inline def setContents(value: js.Array[UnorderedListItemNode]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsVarargs(value: UnorderedListItemNode*): Self = StObject.set(x, "contents", js.Array(value*))
    
    inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setName(value: ul): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
