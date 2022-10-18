package typings.ecmarkdown.distNodeTypesMod

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
  
  inline def apply(location: LocationRange): EOFToken = {
    val __obj = js.Dynamic.literal(done = true, location = location.asInstanceOf[js.Any], name = "EOF")
    __obj.asInstanceOf[EOFToken]
  }
  
  extension [Self <: EOFToken](x: Self) {
    
    inline def setDone(value: `true`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setName(value: EOF): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
