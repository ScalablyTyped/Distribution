package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeoutSeconds extends StObject {
  
  var timeoutSeconds: Any
}
object TimeoutSeconds {
  
  inline def apply(timeoutSeconds: Any): TimeoutSeconds = {
    val __obj = js.Dynamic.literal(timeoutSeconds = timeoutSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeoutSeconds]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeoutSeconds] (val x: Self) extends AnyVal {
    
    inline def setTimeoutSeconds(value: Any): Self = StObject.set(x, "timeoutSeconds", value.asInstanceOf[js.Any])
  }
}
