package typings.devtools.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandleString extends StObject {
  
  var handle: String
}
object HandleString {
  
  @scala.inline
  def apply(handle: String): HandleString = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleString]
  }
  
  @scala.inline
  implicit class HandleStringMutableBuilder[Self <: HandleString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
  }
}
