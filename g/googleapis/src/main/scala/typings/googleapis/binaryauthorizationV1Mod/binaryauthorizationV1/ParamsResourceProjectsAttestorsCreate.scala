package typings.googleapis.binaryauthorizationV1Mod.binaryauthorizationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsAttestorsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The attestors ID.
    */
  var attestorId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent of this attestor.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAttestor] = js.undefined
}
object ParamsResourceProjectsAttestorsCreate {
  
  inline def apply(): ParamsResourceProjectsAttestorsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAttestorsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsAttestorsCreate](x: Self) {
    
    inline def setAttestorId(value: String): Self = StObject.set(x, "attestorId", value.asInstanceOf[js.Any])
    
    inline def setAttestorIdUndefined: Self = StObject.set(x, "attestorId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaAttestor): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
