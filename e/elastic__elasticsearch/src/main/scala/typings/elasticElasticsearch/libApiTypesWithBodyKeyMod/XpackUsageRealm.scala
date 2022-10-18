package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageRealm
  extends StObject
     with XpackUsageBase {
  
  var cache: js.UndefOr[js.Array[XpackUsageRealmCache]] = js.undefined
  
  var has_authorization_realms: js.UndefOr[js.Array[Boolean]] = js.undefined
  
  var has_default_username_pattern: js.UndefOr[js.Array[Boolean]] = js.undefined
  
  var has_truststore: js.UndefOr[js.Array[Boolean]] = js.undefined
  
  var is_authentication_delegated: js.UndefOr[js.Array[Boolean]] = js.undefined
  
  var name: js.UndefOr[js.Array[String]] = js.undefined
  
  var order: js.UndefOr[js.Array[long]] = js.undefined
  
  var size: js.UndefOr[js.Array[long]] = js.undefined
}
object XpackUsageRealm {
  
  inline def apply(available: Boolean, enabled: Boolean): XpackUsageRealm = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageRealm]
  }
  
  extension [Self <: XpackUsageRealm](x: Self) {
    
    inline def setCache(value: js.Array[XpackUsageRealmCache]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setCacheVarargs(value: XpackUsageRealmCache*): Self = StObject.set(x, "cache", js.Array(value*))
    
    inline def setHas_authorization_realms(value: js.Array[Boolean]): Self = StObject.set(x, "has_authorization_realms", value.asInstanceOf[js.Any])
    
    inline def setHas_authorization_realmsUndefined: Self = StObject.set(x, "has_authorization_realms", js.undefined)
    
    inline def setHas_authorization_realmsVarargs(value: Boolean*): Self = StObject.set(x, "has_authorization_realms", js.Array(value*))
    
    inline def setHas_default_username_pattern(value: js.Array[Boolean]): Self = StObject.set(x, "has_default_username_pattern", value.asInstanceOf[js.Any])
    
    inline def setHas_default_username_patternUndefined: Self = StObject.set(x, "has_default_username_pattern", js.undefined)
    
    inline def setHas_default_username_patternVarargs(value: Boolean*): Self = StObject.set(x, "has_default_username_pattern", js.Array(value*))
    
    inline def setHas_truststore(value: js.Array[Boolean]): Self = StObject.set(x, "has_truststore", value.asInstanceOf[js.Any])
    
    inline def setHas_truststoreUndefined: Self = StObject.set(x, "has_truststore", js.undefined)
    
    inline def setHas_truststoreVarargs(value: Boolean*): Self = StObject.set(x, "has_truststore", js.Array(value*))
    
    inline def setIs_authentication_delegated(value: js.Array[Boolean]): Self = StObject.set(x, "is_authentication_delegated", value.asInstanceOf[js.Any])
    
    inline def setIs_authentication_delegatedUndefined: Self = StObject.set(x, "is_authentication_delegated", js.undefined)
    
    inline def setIs_authentication_delegatedVarargs(value: Boolean*): Self = StObject.set(x, "is_authentication_delegated", js.Array(value*))
    
    inline def setName(value: js.Array[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value*))
    
    inline def setOrder(value: js.Array[long]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setOrderVarargs(value: long*): Self = StObject.set(x, "order", js.Array(value*))
    
    inline def setSize(value: js.Array[long]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSizeVarargs(value: long*): Self = StObject.set(x, "size", js.Array(value*))
  }
}
