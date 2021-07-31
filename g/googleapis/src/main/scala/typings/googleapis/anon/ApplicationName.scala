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
  
  @scala.inline
  def apply(): ApplicationName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationName]
  }
  
  @scala.inline
  implicit class ApplicationNameMutableBuilder[Self <: ApplicationName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: String): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationNameUndefined: Self = StObject.set(x, "applicationName", js.undefined)
    
    @scala.inline
    def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    @scala.inline
    def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    @scala.inline
    def setUniqueQualifier(value: String): Self = StObject.set(x, "uniqueQualifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueQualifierUndefined: Self = StObject.set(x, "uniqueQualifier", js.undefined)
  }
}
