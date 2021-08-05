package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConferenceParameters extends StObject {
  
  /**
    * Additional add-on specific data.
    */
  var addOnParameters: js.UndefOr[SchemaConferenceParametersAddOnParameters] = js.undefined
}
object SchemaConferenceParameters {
  
  inline def apply(): SchemaConferenceParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConferenceParameters]
  }
  
  extension [Self <: SchemaConferenceParameters](x: Self) {
    
    inline def setAddOnParameters(value: SchemaConferenceParametersAddOnParameters): Self = StObject.set(x, "addOnParameters", value.asInstanceOf[js.Any])
    
    inline def setAddOnParametersUndefined: Self = StObject.set(x, "addOnParameters", js.undefined)
  }
}
