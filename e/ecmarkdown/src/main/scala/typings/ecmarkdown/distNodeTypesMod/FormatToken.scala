package typings.ecmarkdown.distNodeTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatToken
  extends StObject
     with Token {
  
  var contents: String
  
  var location: LocationRange
  
  var name: Format
}
object FormatToken {
  
  inline def apply(contents: String, location: LocationRange, name: Format): FormatToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormatToken] (val x: Self) extends AnyVal {
    
    inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setName(value: Format): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
