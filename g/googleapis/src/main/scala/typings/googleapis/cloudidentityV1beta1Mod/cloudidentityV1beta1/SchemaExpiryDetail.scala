package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExpiryDetail extends StObject {
  
  /**
    * The time at which the `MembershipRole` will expire.
    */
  var expireTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaExpiryDetail {
  
  inline def apply(): SchemaExpiryDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExpiryDetail]
  }
  
  extension [Self <: SchemaExpiryDetail](x: Self) {
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeNull: Self = StObject.set(x, "expireTime", null)
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
  }
}
