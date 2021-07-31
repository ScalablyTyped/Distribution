package typings.fhirJsClient.FHIR.SMART

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to specify the type of Resource which needs to be considered for the API call
  */
trait ResourceType extends StObject {
  
  var `type`: String
}
object ResourceType {
  
  @scala.inline
  def apply(`type`: String): ResourceType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceType]
  }
  
  @scala.inline
  implicit class ResourceTypeMutableBuilder[Self <: ResourceType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
