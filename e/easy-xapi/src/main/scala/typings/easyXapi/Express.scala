package typings.easyXapi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Express {
  
  trait Request extends StObject {
    
    var log: js.Any
  }
  object Request {
    
    inline def apply(log: js.Any): Request = {
      val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    extension [Self <: Request](x: Self) {
      
      inline def setLog(value: js.Any): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    }
  }
}
