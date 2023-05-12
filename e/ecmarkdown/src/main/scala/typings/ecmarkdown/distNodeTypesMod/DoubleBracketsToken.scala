package typings.ecmarkdown.distNodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.`double-brackets`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoubleBracketsToken
  extends StObject
     with Token {
  
  var contents: String
  
  var location: LocationRange
  
  var name: `double-brackets`
}
object DoubleBracketsToken {
  
  inline def apply(contents: String, location: LocationRange): DoubleBracketsToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "double-brackets")
    __obj.asInstanceOf[DoubleBracketsToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DoubleBracketsToken] (val x: Self) extends AnyVal {
    
    inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setName(value: `double-brackets`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
