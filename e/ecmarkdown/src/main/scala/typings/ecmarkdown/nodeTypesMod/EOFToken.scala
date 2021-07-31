package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownBooleans.`true`
import typings.ecmarkdown.ecmarkdownStrings.EOF
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EOFToken
  extends StObject
     with Token {
  
  var done: `true`
  
  var location: LocationRange
  
  var name: EOF
}
object EOFToken {
  
  @scala.inline
  def apply(location: LocationRange): EOFToken = {
    val __obj = js.Dynamic.literal(done = true, location = location.asInstanceOf[js.Any], name = "EOF")
    __obj.asInstanceOf[EOFToken]
  }
  
  @scala.inline
  implicit class EOFTokenMutableBuilder[Self <: EOFToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDone(value: `true`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: EOF): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
