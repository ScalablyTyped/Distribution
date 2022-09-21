package typings.googleapis.certificatemanagerV1Mod.certificatemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. A user-provided name of the certificate map entry.
    */
  var certificateMapEntryId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent resource of the certificate map entry. Must be in the format `projects/x/locations/x/certificateMaps/x`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCertificateMapEntry] = js.undefined
}
object ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesCreate](x: Self) {
    
    inline def setCertificateMapEntryId(value: String): Self = StObject.set(x, "certificateMapEntryId", value.asInstanceOf[js.Any])
    
    inline def setCertificateMapEntryIdUndefined: Self = StObject.set(x, "certificateMapEntryId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaCertificateMapEntry): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
