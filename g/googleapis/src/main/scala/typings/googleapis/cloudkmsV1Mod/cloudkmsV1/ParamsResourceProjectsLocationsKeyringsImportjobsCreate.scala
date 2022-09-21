package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsKeyringsImportjobsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. It must be unique within a KeyRing and match the regular expression `[a-zA-Z0-9_-]{1,63\}`
    */
  var importJobId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the KeyRing associated with the ImportJobs.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaImportJob] = js.undefined
}
object ParamsResourceProjectsLocationsKeyringsImportjobsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsKeyringsImportjobsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsKeyringsImportjobsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsKeyringsImportjobsCreate](x: Self) {
    
    inline def setImportJobId(value: String): Self = StObject.set(x, "importJobId", value.asInstanceOf[js.Any])
    
    inline def setImportJobIdUndefined: Self = StObject.set(x, "importJobId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaImportJob): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
