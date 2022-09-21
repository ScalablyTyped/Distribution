package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.tilde
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TildeNode
  extends StObject
     with FormatNode
     with Node {
  
  var contents: js.Array[FragmentNode]
  
  var location: LocationRange
  
  var name: tilde
}
object TildeNode {
  
  inline def apply(contents: js.Array[FragmentNode], location: LocationRange): TildeNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "tilde")
    __obj.asInstanceOf[TildeNode]
  }
  
  extension [Self <: TildeNode](x: Self) {
    
    inline def setContents(value: js.Array[FragmentNode]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsVarargs(value: FragmentNode*): Self = StObject.set(x, "contents", js.Array(value*))
    
    inline def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setName(value: tilde): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
