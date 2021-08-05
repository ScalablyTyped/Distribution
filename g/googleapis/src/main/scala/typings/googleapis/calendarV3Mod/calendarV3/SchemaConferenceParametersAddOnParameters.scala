package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConferenceParametersAddOnParameters extends StObject {
  
  var parameters: js.UndefOr[StringDictionary[String]] = js.undefined
}
object SchemaConferenceParametersAddOnParameters {
  
  inline def apply(): SchemaConferenceParametersAddOnParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConferenceParametersAddOnParameters]
  }
  
  extension [Self <: SchemaConferenceParametersAddOnParameters](x: Self) {
    
    inline def setParameters(value: StringDictionary[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
  }
}
