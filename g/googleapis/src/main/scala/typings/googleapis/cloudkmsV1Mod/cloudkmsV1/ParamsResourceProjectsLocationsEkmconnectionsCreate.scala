package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsEkmconnectionsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. It must be unique within a location and match the regular expression `[a-zA-Z0-9_-]{1,63\}`.
    */
  var ekmConnectionId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The resource name of the location associated with the EkmConnection, in the format `projects/x/locations/x`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaEkmConnection] = js.undefined
}
object ParamsResourceProjectsLocationsEkmconnectionsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsEkmconnectionsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsEkmconnectionsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsEkmconnectionsCreate](x: Self) {
    
    inline def setEkmConnectionId(value: String): Self = StObject.set(x, "ekmConnectionId", value.asInstanceOf[js.Any])
    
    inline def setEkmConnectionIdUndefined: Self = StObject.set(x, "ekmConnectionId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaEkmConnection): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
