package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoXpack extends StObject {
  
  var license: js.UndefOr[NodesInfoNodeInfoXpackLicense] = js.undefined
  
  var notification: js.UndefOr[Record[String, Any]] = js.undefined
  
  var security: NodesInfoNodeInfoXpackSecurity
}
object NodesInfoNodeInfoXpack {
  
  inline def apply(security: NodesInfoNodeInfoXpackSecurity): NodesInfoNodeInfoXpack = {
    val __obj = js.Dynamic.literal(security = security.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoXpack]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesInfoNodeInfoXpack] (val x: Self) extends AnyVal {
    
    inline def setLicense(value: NodesInfoNodeInfoXpackLicense): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
    
    inline def setNotification(value: Record[String, Any]): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    
    inline def setSecurity(value: NodesInfoNodeInfoXpackSecurity): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
  }
}
