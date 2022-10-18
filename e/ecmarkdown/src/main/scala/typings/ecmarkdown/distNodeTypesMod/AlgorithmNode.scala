package typings.ecmarkdown.distNodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.algorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlgorithmNode
  extends StObject
     with Node {
  
  var contents: OrderedListNode
  
  var location: LocationRange
  
  var name: algorithm
}
object AlgorithmNode {
  
  inline def apply(contents: OrderedListNode, location: LocationRange): AlgorithmNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "algorithm")
    __obj.asInstanceOf[AlgorithmNode]
  }
  
  extension [Self <: AlgorithmNode](x: Self) {
    
    inline def setContents(value: OrderedListNode): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setName(value: algorithm): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
