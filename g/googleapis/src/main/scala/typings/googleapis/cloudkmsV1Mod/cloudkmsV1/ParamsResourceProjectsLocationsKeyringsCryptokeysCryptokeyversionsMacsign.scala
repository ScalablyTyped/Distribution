package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsMacsign
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the CryptoKeyVersion to use for signing.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaMacSignRequest] = js.undefined
}
object ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsMacsign {
  
  inline def apply(): ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsMacsign = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsMacsign]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsMacsign](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaMacSignRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
