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
  
  @scala.inline
  def apply(contents: String, location: LocationRange): OrderedListToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "ol")
    __obj.asInstanceOf[OrderedListToken]
  }
  
  @scala.inline
  implicit class OrderedListTokenMutableBuilder[Self <: OrderedListToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ol): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
