package typings.ecmarkdown.distNodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.star
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StarNode
  extends StObject
     with FormatNode
     with Node {
  
  var contents: js.Array[FragmentNode]
  
  var location: LocationRange
  
  var name: star
}
object StarNode {
  
  inline def apply(contents: js.Array[FragmentNode], location: LocationRange): StarNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "star")
    __obj.asInstanceOf[StarNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StarNode] (val x: Self) extends AnyVal {
    
    inline def setContents(value: js.Array[FragmentNode]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsVarargs(value: FragmentNode*): Self = StObject.set(x, "contents", js.Array(value*))
    
    inline def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setName(value: star): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
