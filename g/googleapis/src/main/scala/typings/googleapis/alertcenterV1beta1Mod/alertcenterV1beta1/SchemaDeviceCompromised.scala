package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeviceCompromised extends StObject {
  
  /**
    * The email of the user this alert was created for.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The list of security events.
    */
  var events: js.UndefOr[js.Array[SchemaDeviceCompromisedSecurityDetail]] = js.undefined
}
object SchemaDeviceCompromised {
  
  inline def apply(): SchemaDeviceCompromised = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceCompromised]
  }
  
  extension [Self <: SchemaDeviceCompromised](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEvents(value: js.Array[SchemaDeviceCompromisedSecurityDetail]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: SchemaDeviceCompromisedSecurityDetail*): Self = StObject.set(x, "events", js.Array(value*))
  }
}
