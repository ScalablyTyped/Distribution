package typings.fhirJsClient.FHIR.SMART

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parameter to be passed to the read API method
  */
@js.native
trait ReadParams extends StObject {
  
  /**
    * ID of the FHIR resource
    */
  var id: String = js.native
  
  /**
    * Type of the FHIR resource
    */
  var `type`: String = js.native
}
object ReadParams {
  
  @scala.inline
  def apply(id: String, `type`: String): ReadParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadParams]
  }
  
  @scala.inline
  implicit class ReadParamsMutableBuilder[Self <: ReadParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
