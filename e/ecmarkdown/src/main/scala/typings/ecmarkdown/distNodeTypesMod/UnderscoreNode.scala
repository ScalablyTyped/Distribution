package typings.ecmarkdown.distNodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.underscore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnderscoreNode
  extends StObject
     with FormatNode
     with Node {
  
  var contents: String
  
  var location: LocationRange
  
  var name: underscore
}
object UnderscoreNode {
  
  inline def apply(contents: String, location: LocationRange): UnderscoreNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "underscore")
    __obj.asInstanceOf[UnderscoreNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnderscoreNode] (val x: Self) extends AnyVal {
    
    inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setName(value: underscore): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
