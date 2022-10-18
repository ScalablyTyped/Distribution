package typings.ecmarkdown.distNodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagToken
  extends StObject
     with Token {
  
  var contents: String
  
  var location: LocationRange
  
  var name: tag
}
object TagToken {
  
  inline def apply(contents: String, location: LocationRange): TagToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "tag")
    __obj.asInstanceOf[TagToken]
  }
  
  extension [Self <: TagToken](x: Self) {
    
    inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setName(value: tag): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
