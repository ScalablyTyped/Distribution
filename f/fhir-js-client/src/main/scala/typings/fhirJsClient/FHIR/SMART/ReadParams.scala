package typings.fhirJsClient.FHIR.SMART

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parameter to be passed to the read API method
  */
trait ReadParams extends StObject {
  
  /**
    * ID of the FHIR resource
    */
  var id: String
  
  /**
    * Type of the FHIR resource
    */
  var `type`: String
}
object ReadParams {
  
  inline def apply(id: String, `type`: String): ReadParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadParams]
  }
  
  extension [Self <: ReadParams](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
