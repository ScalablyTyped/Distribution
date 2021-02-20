package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.algorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlgorithmNode extends Node {
  
  var contents: OrderedListNode = js.native
  
  var location: LocationRange = js.native
  
  var name: algorithm = js.native
}
object AlgorithmNode {
  
  @scala.inline
  def apply(contents: OrderedListNode, location: LocationRange, name: algorithm): AlgorithmNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlgorithmNode]
  }
  
  @scala.inline
  implicit class AlgorithmNodeMutableBuilder[Self <: AlgorithmNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContents(value: OrderedListNode): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: algorithm): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
