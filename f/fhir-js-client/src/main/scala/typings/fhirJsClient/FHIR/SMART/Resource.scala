package typings.fhirJsClient.FHIR.SMART

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a FHIR resource
  */
trait Resource
  extends StObject
     with /**
  * Making this interface extendable since this is not a complete type definition of FHIR Resource
  */
/* propName */ StringDictionary[js.Any] {
  
  /**
    * The type of resource. All FHIR resources must have a resource type.
    */
  var resourceType: String
}
object Resource {
  
  @scala.inline
  def apply(resourceType: String): Resource = {
    val __obj = js.Dynamic.literal(resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  
  @scala.inline
  implicit class ResourceMutableBuilder[Self <: Resource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
