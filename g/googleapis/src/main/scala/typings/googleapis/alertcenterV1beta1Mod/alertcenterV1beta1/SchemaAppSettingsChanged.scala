package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppSettingsChanged extends StObject {
  
  /**
    * Any other associated alert details, for example, AlertConfiguration.
    */
  var alertDetails: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Rule name
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppSettingsChanged {
  
  inline def apply(): SchemaAppSettingsChanged = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppSettingsChanged]
  }
  
  extension [Self <: SchemaAppSettingsChanged](x: Self) {
    
    inline def setAlertDetails(value: String): Self = StObject.set(x, "alertDetails", value.asInstanceOf[js.Any])
    
    inline def setAlertDetailsNull: Self = StObject.set(x, "alertDetails", null)
    
    inline def setAlertDetailsUndefined: Self = StObject.set(x, "alertDetails", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
