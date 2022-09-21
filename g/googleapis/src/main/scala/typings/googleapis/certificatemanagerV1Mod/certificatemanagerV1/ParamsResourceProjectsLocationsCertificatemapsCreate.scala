package typings.googleapis.certificatemanagerV1Mod.certificatemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCertificatemapsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. A user-provided name of the certificate map.
    */
  var certificateMapId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent resource of the certificate map. Must be in the format `projects/x/locations/x`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCertificateMap] = js.undefined
}
object ParamsResourceProjectsLocationsCertificatemapsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsCertificatemapsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCertificatemapsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCertificatemapsCreate](x: Self) {
    
    inline def setCertificateMapId(value: String): Self = StObject.set(x, "certificateMapId", value.asInstanceOf[js.Any])
    
    inline def setCertificateMapIdUndefined: Self = StObject.set(x, "certificateMapId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaCertificateMap): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
