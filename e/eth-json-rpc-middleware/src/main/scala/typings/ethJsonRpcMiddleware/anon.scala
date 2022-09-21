package typings.ethJsonRpcMiddleware

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait SuppressUnauthorized extends StObject {
    
    var suppressUnauthorized: js.UndefOr[Boolean] = js.undefined
  }
  object SuppressUnauthorized {
    
    inline def apply(): SuppressUnauthorized = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SuppressUnauthorized]
    }
    
    extension [Self <: SuppressUnauthorized](x: Self) {
      
      inline def setSuppressUnauthorized(value: Boolean): Self = StObject.set(x, "suppressUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setSuppressUnauthorizedUndefined: Self = StObject.set(x, "suppressUnauthorized", js.undefined)
    }
  }
}
