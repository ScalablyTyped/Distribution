package typings.googleapis.apikeysV2Mod.apikeysV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsKeysDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. The etag known to the client for the expected state of the key. This is to be used for optimistic concurrency.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The resource name of the API key to be deleted.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsKeysDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsKeysDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsKeysDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsKeysDelete](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
