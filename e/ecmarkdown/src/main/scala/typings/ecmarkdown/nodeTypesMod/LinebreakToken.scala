package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.linebreak
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinebreakToken extends Token {
  
  var contents: String = js.native
  
  var location: LocationRange = js.native
  
  var name: linebreak = js.native
}
object LinebreakToken {
  
  @scala.inline
  def apply(contents: String, location: LocationRange, name: linebreak): LinebreakToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinebreakToken]
  }
  
  @scala.inline
  implicit class LinebreakTokenMutableBuilder[Self <: LinebreakToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: linebreak): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
