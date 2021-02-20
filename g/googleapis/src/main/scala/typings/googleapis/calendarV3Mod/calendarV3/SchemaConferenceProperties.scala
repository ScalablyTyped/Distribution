package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaConferenceProperties extends StObject {
  
  /**
    * The types of conference solutions that are supported for this calendar.
    * The possible values are:   - &quot;eventHangout&quot;  -
    * &quot;eventNamedHangout&quot;  - &quot;hangoutsMeet&quot;  Optional.
    */
  var allowedConferenceSolutionTypes: js.UndefOr[js.Array[String]] = js.native
}
object SchemaConferenceProperties {
  
  @scala.inline
  def apply(): SchemaConferenceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConferenceProperties]
  }
  
  @scala.inline
  implicit class SchemaConferencePropertiesMutableBuilder[Self <: SchemaConferenceProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedConferenceSolutionTypes(value: js.Array[String]): Self = StObject.set(x, "allowedConferenceSolutionTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedConferenceSolutionTypesUndefined: Self = StObject.set(x, "allowedConferenceSolutionTypes", js.undefined)
    
    @scala.inline
    def setAllowedConferenceSolutionTypesVarargs(value: String*): Self = StObject.set(x, "allowedConferenceSolutionTypes", js.Array(value :_*))
  }
}
