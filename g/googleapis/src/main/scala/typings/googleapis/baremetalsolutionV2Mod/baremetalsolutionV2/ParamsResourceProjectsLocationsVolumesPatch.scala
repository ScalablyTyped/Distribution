package typings.googleapis.baremetalsolutionV2Mod.baremetalsolutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsVolumesPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Output only. The resource name of this `Volume`. Resource names are schemeless URIs that follow the conventions in https://cloud.google.com/apis/design/resource_names. Format: `projects/{project\}/locations/{location\}/volumes/{volume\}`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaVolume] = js.undefined
  
  /**
    * The list of fields to update. The only currently supported fields are: 'labels'
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsVolumesPatch {
  
  inline def apply(): ParamsResourceProjectsLocationsVolumesPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsVolumesPatch]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsVolumesPatch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaVolume): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
