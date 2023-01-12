package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicensePostStartBasicResponse extends StObject {
  
  var acknowledge: js.UndefOr[Record[String, String | js.Array[String]]] = js.undefined
  
  var acknowledged: Boolean
  
  var basic_was_started: Boolean
  
  var error_message: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[LicenseLicenseType] = js.undefined
}
object LicensePostStartBasicResponse {
  
  inline def apply(acknowledged: Boolean, basic_was_started: Boolean): LicensePostStartBasicResponse = {
    val __obj = js.Dynamic.literal(acknowledged = acknowledged.asInstanceOf[js.Any], basic_was_started = basic_was_started.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicensePostStartBasicResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LicensePostStartBasicResponse] (val x: Self) extends AnyVal {
    
    inline def setAcknowledge(value: Record[String, String | js.Array[String]]): Self = StObject.set(x, "acknowledge", value.asInstanceOf[js.Any])
    
    inline def setAcknowledgeUndefined: Self = StObject.set(x, "acknowledge", js.undefined)
    
    inline def setAcknowledged(value: Boolean): Self = StObject.set(x, "acknowledged", value.asInstanceOf[js.Any])
    
    inline def setBasic_was_started(value: Boolean): Self = StObject.set(x, "basic_was_started", value.asInstanceOf[js.Any])
    
    inline def setError_message(value: String): Self = StObject.set(x, "error_message", value.asInstanceOf[js.Any])
    
    inline def setError_messageUndefined: Self = StObject.set(x, "error_message", js.undefined)
    
    inline def setType(value: LicenseLicenseType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
