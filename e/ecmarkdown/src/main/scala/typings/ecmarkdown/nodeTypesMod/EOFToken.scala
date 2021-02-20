package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownBooleans.`true`
import typings.ecmarkdown.ecmarkdownStrings.EOF
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EOFToken extends Token {
  
  var done: `true` = js.native
  
  var location: LocationRange = js.native
  
  var name: EOF = js.native
}
object EOFToken {
  
  @scala.inline
  def apply(done: `true`, location: LocationRange, name: EOF): EOFToken = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
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
