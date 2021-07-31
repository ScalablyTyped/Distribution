package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.opaqueTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpaqueTagNode
  extends StObject
     with FragmentNode
     with Node {
  
  var contents: String
  
  var location: LocationRange
  
  var name: opaqueTag
}
object OpaqueTagNode {
  
  @scala.inline
  def apply(contents: String, location: LocationRange): OpaqueTagNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "opaqueTag")
    __obj.asInstanceOf[OpaqueTagNode]
  }
  
  @scala.inline
  implicit class OpaqueTagNodeMutableBuilder[Self <: OpaqueTagNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: opaqueTag): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
