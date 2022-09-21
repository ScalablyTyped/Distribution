package typings.expoConfigTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservedClientId extends StObject {
  
  /**
    * @deprecated Use `ios.googleServicesFile` instead.
    */
  var reservedClientId: js.UndefOr[String] = js.undefined
}
object ReservedClientId {
  
  inline def apply(): ReservedClientId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedClientId]
  }
  
  extension [Self <: ReservedClientId](x: Self) {
    
    inline def setReservedClientId(value: String): Self = StObject.set(x, "reservedClientId", value.asInstanceOf[js.Any])
    
    inline def setReservedClientIdUndefined: Self = StObject.set(x, "reservedClientId", js.undefined)
  }
}
