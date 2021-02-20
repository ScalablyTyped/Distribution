package typings.fhirJsClient.FHIR.SMART

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Resource type with ID
  * Used by the get method
  */
@js.native
trait ResourceParameter extends StObject {
  
  /**
    * Resource ID
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Name of the resource type
    */
  var resource: String = js.native
}
object ResourceParameter {
  
  @scala.inline
  def apply(resource: String): ResourceParameter = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceParameter]
  }
  
  @scala.inline
  implicit class ResourceParameterMutableBuilder[Self <: ResourceParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
  }
}
