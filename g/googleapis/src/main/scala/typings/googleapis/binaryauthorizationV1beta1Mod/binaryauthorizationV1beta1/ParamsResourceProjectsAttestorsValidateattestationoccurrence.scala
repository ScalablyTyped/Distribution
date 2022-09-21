package typings.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsAttestorsValidateattestationoccurrence
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the Attestor of the occurrence, in the format `projects/x/attestors/x`.
    */
  var attestor: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaValidateAttestationOccurrenceRequest] = js.undefined
}
object ParamsResourceProjectsAttestorsValidateattestationoccurrence {
  
  inline def apply(): ParamsResourceProjectsAttestorsValidateattestationoccurrence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAttestorsValidateattestationoccurrence]
  }
  
  extension [Self <: ParamsResourceProjectsAttestorsValidateattestationoccurrence](x: Self) {
    
    inline def setAttestor(value: String): Self = StObject.set(x, "attestor", value.asInstanceOf[js.Any])
    
    inline def setAttestorUndefined: Self = StObject.set(x, "attestor", js.undefined)
    
    inline def setRequestBody(value: SchemaValidateAttestationOccurrenceRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
