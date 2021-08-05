package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationName extends StObject {
  
  var applicationName: js.UndefOr[String] = js.undefined
  
  var customerId: js.UndefOr[String] = js.undefined
  
  var time: js.UndefOr[String] = js.undefined
  
  var uniqueQualifier: js.UndefOr[String] = js.undefined
}
object ApplicationName {
  
  inline def apply(): ApplicationName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationName]
  }
  
  extension [Self <: ApplicationName](x: Self) {
    
    inline def setApplicationName(value: String): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    inline def setApplicationNameUndefined: Self = StObject.set(x, "applicationName", js.undefined)
    
    inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setUniqueQualifier(value: String): Self = StObject.set(x, "uniqueQualifier", value.asInstanceOf[js.Any])
    
    inline def setUniqueQualifierUndefined: Self = StObject.set(x, "uniqueQualifier", js.undefined)
  }
}
