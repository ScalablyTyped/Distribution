package typings.googleapis.baremetalsolutionV2Mod.baremetalsolutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsVolumesResize
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaResizeVolumeRequest] = js.undefined
  
  /**
    * Required. Volume to resize.
    */
  var volume: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsVolumesResize {
  
  inline def apply(): ParamsResourceProjectsLocationsVolumesResize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsVolumesResize]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsVolumesResize](x: Self) {
    
    inline def setRequestBody(value: SchemaResizeVolumeRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setVolume(value: String): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
