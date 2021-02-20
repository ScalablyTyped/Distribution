package typings.gandiLivedns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Zone extends StObject {
  
  var apex_alias: String = js.native
  
  var email: String = js.native
  
  var expire: Double = js.native
  
  var minimum: Double = js.native
  
  var name: String = js.native
  
  var primary_ns: String = js.native
  
  var refresh: Double = js.native
  
  var retry: Double = js.native
  
  var serial: Double = js.native
  
  var uuid: String = js.native
}
object Zone {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ZoneMutableBuilder[Self <: Zone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApex_alias(value: String): Self = StObject.set(x, "apex_alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpire(value: Double): Self = StObject.set(x, "expire", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimary_ns(value: String): Self = StObject.set(x, "primary_ns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh(value: Double): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetry(value: Double): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerial(value: Double): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
