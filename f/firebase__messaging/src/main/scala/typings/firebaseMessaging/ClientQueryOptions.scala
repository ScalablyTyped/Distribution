package typings.firebaseMessaging

import typings.std.ClientTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientQueryOptions extends StObject {
  
  var includeReserved: js.UndefOr[Boolean] = js.undefined
  
  var includeUncontrolled: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[ClientTypes] = js.undefined
}
object ClientQueryOptions {
  
  inline def apply(): ClientQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientQueryOptions]
  }
  
  extension [Self <: ClientQueryOptions](x: Self) {
    
    inline def setIncludeReserved(value: Boolean): Self = StObject.set(x, "includeReserved", value.asInstanceOf[js.Any])
    
    inline def setIncludeReservedUndefined: Self = StObject.set(x, "includeReserved", js.undefined)
    
    inline def setIncludeUncontrolled(value: Boolean): Self = StObject.set(x, "includeUncontrolled", value.asInstanceOf[js.Any])
    
    inline def setIncludeUncontrolledUndefined: Self = StObject.set(x, "includeUncontrolled", js.undefined)
    
    inline def setType(value: ClientTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
