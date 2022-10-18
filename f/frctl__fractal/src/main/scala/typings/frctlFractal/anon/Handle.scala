package typings.frctlFractal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Handle extends StObject {
  
  var handle: js.UndefOr[String] = js.undefined
}
object Handle {
  
  inline def apply(): Handle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Handle]
  }
  
  extension [Self <: Handle](x: Self) {
    
    inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
  }
}
