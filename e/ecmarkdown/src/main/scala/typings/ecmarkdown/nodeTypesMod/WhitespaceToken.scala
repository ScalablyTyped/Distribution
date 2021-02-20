package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.whitespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WhitespaceToken extends Token {
  
  var contents: String = js.native
  
  var location: LocationRange = js.native
  
  var name: whitespace = js.native
}
object WhitespaceToken {
  
  @scala.inline
  def apply(contents: String, location: LocationRange, name: whitespace): WhitespaceToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhitespaceToken]
  }
  
  @scala.inline
  implicit class WhitespaceTokenMutableBuilder[Self <: WhitespaceToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: whitespace): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
