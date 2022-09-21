package typings.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsFunctionsGenerateuploadurl
  extends StObject
     with StandardParameters {
  
  /**
    * The project and location in which the Google Cloud Storage signed URL should be generated, specified in the format `projects/x/locations/x`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGenerateUploadUrlRequest] = js.undefined
}
object ParamsResourceProjectsLocationsFunctionsGenerateuploadurl {
  
  inline def apply(): ParamsResourceProjectsLocationsFunctionsGenerateuploadurl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsFunctionsGenerateuploadurl]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsFunctionsGenerateuploadurl](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGenerateUploadUrlRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
