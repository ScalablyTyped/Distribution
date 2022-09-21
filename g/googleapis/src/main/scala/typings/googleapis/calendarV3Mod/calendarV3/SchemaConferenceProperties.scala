package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConferenceProperties extends StObject {
  
  /**
    * The types of conference solutions that are supported for this calendar.
    * The possible values are:
    * - "eventHangout"
    * - "eventNamedHangout"
    * - "hangoutsMeet"  Optional.
    */
  var allowedConferenceSolutionTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaConferenceProperties {
  
  inline def apply(): SchemaConferenceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConferenceProperties]
  }
  
  extension [Self <: SchemaConferenceProperties](x: Self) {
    
    inline def setAllowedConferenceSolutionTypes(value: js.Array[String]): Self = StObject.set(x, "allowedConferenceSolutionTypes", value.asInstanceOf[js.Any])
    
    inline def setAllowedConferenceSolutionTypesNull: Self = StObject.set(x, "allowedConferenceSolutionTypes", null)
    
    inline def setAllowedConferenceSolutionTypesUndefined: Self = StObject.set(x, "allowedConferenceSolutionTypes", js.undefined)
    
    inline def setAllowedConferenceSolutionTypesVarargs(value: String*): Self = StObject.set(x, "allowedConferenceSolutionTypes", js.Array(value*))
  }
}
