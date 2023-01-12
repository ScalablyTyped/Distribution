package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains lists of property names for different appointment types.
  */
trait AppointmentPropertyNames extends StObject {
  
  /**
    * Gets the list of properties characteristic for appointments of the ASPxAppointmentType.Normal type.
    */
  var Normal: String
  
  /**
    * Gets the list of properties characteristic for appointments of the ASPxAppointmentType.Pattern type.
    */
  var Pattern: String
}
object AppointmentPropertyNames {
  
  inline def apply(Normal: String, Pattern: String): AppointmentPropertyNames = {
    val __obj = js.Dynamic.literal(Normal = Normal.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentPropertyNames]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppointmentPropertyNames] (val x: Self) extends AnyVal {
    
    inline def setNormal(value: String): Self = StObject.set(x, "Normal", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: String): Self = StObject.set(x, "Pattern", value.asInstanceOf[js.Any])
  }
}
