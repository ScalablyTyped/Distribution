package typings.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TenantId extends StObject {
  
  var tenantId: js.UndefOr[String] = js.undefined
}
object TenantId {
  
  inline def apply(): TenantId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TenantId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TenantId] (val x: Self) extends AnyVal {
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
  }
}
