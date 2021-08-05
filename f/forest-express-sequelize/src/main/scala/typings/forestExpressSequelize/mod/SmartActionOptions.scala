package typings.forestExpressSequelize.mod

import typings.forestExpressSequelize.anon.Description
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartActionOptions extends StObject {
  
  var download: js.UndefOr[Boolean] = js.undefined
  
  var endpoint: js.UndefOr[String] = js.undefined
  
  var fields: js.UndefOr[js.Array[Description]] = js.undefined
  
  var httpMethod: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var values: js.UndefOr[SmartActionValuesInjector] = js.undefined
}
object SmartActionOptions {
  
  inline def apply(name: String): SmartActionOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartActionOptions]
  }
  
  extension [Self <: SmartActionOptions](x: Self) {
    
    inline def setDownload(value: Boolean): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setFields(value: js.Array[Description]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: Description*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    inline def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
    
    inline def setHttpMethodUndefined: Self = StObject.set(x, "httpMethod", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValues(value: /* record */ js.Any => js.Object): Self = StObject.set(x, "values", js.Any.fromFunction1(value))
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
