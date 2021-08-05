package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.ol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderedListToken
  extends StObject
     with Token {
  
  var contents: String
  
  var location: LocationRange
  
  var name: ol
}
object OrderedListToken {
  
  inline def apply(contents: String, location: LocationRange): OrderedListToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "ol")
    __obj.asInstanceOf[OrderedListToken]
  }
  
  extension [Self <: OrderedListToken](x: Self) {
    
    inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setName(value: ol): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
