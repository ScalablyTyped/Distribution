package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.ul
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnorderedListToken
  extends StObject
     with Token {
  
  var contents: String
  
  var location: LocationRange
  
  var name: ul
}
object UnorderedListToken {
  
  inline def apply(contents: String, location: LocationRange): UnorderedListToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "ul")
    __obj.asInstanceOf[UnorderedListToken]
  }
  
  extension [Self <: UnorderedListToken](x: Self) {
    
    inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setName(value: ul): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
