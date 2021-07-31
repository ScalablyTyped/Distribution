package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextToken
  extends StObject
     with Token {
  
  var contents: String
  
  var location: LocationRange
  
  var name: text
}
object TextToken {
  
  @scala.inline
  def apply(contents: String, location: LocationRange): TextToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "text")
    __obj.asInstanceOf[TextToken]
  }
  
  @scala.inline
  implicit class TextTokenMutableBuilder[Self <: TextToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: text): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
