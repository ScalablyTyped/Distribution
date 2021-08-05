package typings.gandiLivedns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Zone extends StObject {
  
  var apex_alias: String
  
  var email: String
  
  var expire: Double
  
  var minimum: Double
  
  var name: String
  
  var primary_ns: String
  
  var refresh: Double
  
  var retry: Double
  
  var serial: Double
  
  var uuid: String
}
object Zone {
  
  inline def apply(
    apex_alias: String,
    email: String,
    expire: Double,
    minimum: Double,
    name: String,
    primary_ns: String,
    refresh: Double,
    retry: Double,
    serial: Double,
    uuid: String
  ): Zone = {
    val __obj = js.Dynamic.literal(apex_alias = apex_alias.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], expire = expire.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], primary_ns = primary_ns.asInstanceOf[js.Any], refresh = refresh.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Zone]
  }
  
  extension [Self <: Zone](x: Self) {
    
    inline def setApex_alias(value: String): Self = StObject.set(x, "apex_alias", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setExpire(value: Double): Self = StObject.set(x, "expire", value.asInstanceOf[js.Any])
    
    inline def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPrimary_ns(value: String): Self = StObject.set(x, "primary_ns", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: Double): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    inline def setRetry(value: Double): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    inline def setSerial(value: Double): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
