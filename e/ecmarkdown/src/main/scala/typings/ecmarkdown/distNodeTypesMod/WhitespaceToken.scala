package typings.ecmarkdown.distNodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.whitespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WhitespaceToken
  extends StObject
     with Token {
  
  var contents: String
  
  var location: LocationRange
  
  var name: whitespace
}
object WhitespaceToken {
  
  inline def apply(contents: String, location: LocationRange): WhitespaceToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "whitespace")
    __obj.asInstanceOf[WhitespaceToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WhitespaceToken] (val x: Self) extends AnyVal {
    
    inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setName(value: whitespace): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
