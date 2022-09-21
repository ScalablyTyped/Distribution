package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsKeyringsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. It must be unique within a location and match the regular expression `[a-zA-Z0-9_-]{1,63\}`
    */
  var keyRingId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The resource name of the location associated with the KeyRings, in the format `projects/x/locations/x`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaKeyRing] = js.undefined
}
object ParamsResourceProjectsLocationsKeyringsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsKeyringsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsKeyringsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsKeyringsCreate](x: Self) {
    
    inline def setKeyRingId(value: String): Self = StObject.set(x, "keyRingId", value.asInstanceOf[js.Any])
    
    inline def setKeyRingIdUndefined: Self = StObject.set(x, "keyRingId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaKeyRing): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
