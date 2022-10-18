package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackInfoFeature extends StObject {
  
  var available: Boolean
  
  var description: js.UndefOr[String] = js.undefined
  
  var enabled: Boolean
  
  var native_code_info: js.UndefOr[XpackInfoNativeCodeInformation] = js.undefined
}
object XpackInfoFeature {
  
  inline def apply(available: Boolean, enabled: Boolean): XpackInfoFeature = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackInfoFeature]
  }
  
  extension [Self <: XpackInfoFeature](x: Self) {
    
    inline def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setNative_code_info(value: XpackInfoNativeCodeInformation): Self = StObject.set(x, "native_code_info", value.asInstanceOf[js.Any])
    
    inline def setNative_code_infoUndefined: Self = StObject.set(x, "native_code_info", js.undefined)
  }
}
