package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaConferenceParameters extends StObject {
  
  /**
    * Additional add-on specific data.
    */
  var addOnParameters: js.UndefOr[SchemaConferenceParametersAddOnParameters] = js.native
}
object SchemaConferenceParameters {
  
  @scala.inline
  def apply(): SchemaConferenceParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConferenceParameters]
  }
  
  @scala.inline
  implicit class SchemaConferenceParametersMutableBuilder[Self <: SchemaConferenceParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddOnParameters(value: SchemaConferenceParametersAddOnParameters): Self = StObject.set(x, "addOnParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddOnParametersUndefined: Self = StObject.set(x, "addOnParameters", js.undefined)
  }
}
