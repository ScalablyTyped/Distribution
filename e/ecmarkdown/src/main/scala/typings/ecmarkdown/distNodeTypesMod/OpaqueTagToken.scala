package typings.ecmarkdown.distNodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.opaqueTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpaqueTagToken
  extends StObject
     with Token {
  
  var contents: String
  
  var location: LocationRange
  
  var name: opaqueTag
}
object OpaqueTagToken {
  
  inline def apply(contents: String, location: LocationRange): OpaqueTagToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "opaqueTag")
    __obj.asInstanceOf[OpaqueTagToken]
  }
  
  extension [Self <: OpaqueTagToken](x: Self) {
    
    inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setName(value: opaqueTag): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
