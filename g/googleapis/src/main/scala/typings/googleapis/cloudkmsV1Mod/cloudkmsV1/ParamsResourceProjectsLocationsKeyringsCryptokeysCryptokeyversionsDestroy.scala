package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsDestroy
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the CryptoKeyVersion to destroy.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDestroyCryptoKeyVersionRequest] = js.undefined
}
object ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsDestroy {
  
  inline def apply(): ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsDestroy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsDestroy]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsDestroy](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaDestroyCryptoKeyVersionRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
