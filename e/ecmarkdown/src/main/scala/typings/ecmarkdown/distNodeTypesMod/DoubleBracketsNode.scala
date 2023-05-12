package typings.ecmarkdown.distNodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.`double-brackets`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoubleBracketsNode
  extends StObject
     with FragmentNode
     with Node {
  
  var contents: String
  
  var location: LocationRange
  
  var name: `double-brackets`
}
object DoubleBracketsNode {
  
  inline def apply(contents: String, location: LocationRange): DoubleBracketsNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "double-brackets")
    __obj.asInstanceOf[DoubleBracketsNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DoubleBracketsNode] (val x: Self) extends AnyVal {
    
    inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setName(value: `double-brackets`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
