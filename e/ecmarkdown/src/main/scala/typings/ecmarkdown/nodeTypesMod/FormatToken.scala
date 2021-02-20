package typings.ecmarkdown.nodeTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatToken extends Token {
  
  var contents: String = js.native
  
  var location: LocationRange = js.native
  
  var name: Format = js.native
}
object FormatToken {
  
  @scala.inline
  def apply(contents: String, location: LocationRange, name: Format): FormatToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatToken]
  }
  
  @scala.inline
  implicit class FormatTokenMutableBuilder[Self <: FormatToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Format): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
