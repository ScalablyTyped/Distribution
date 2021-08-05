package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAppManifestResponse extends StObject {
  
  /**
    * Manifest content.
    */
  var data: js.UndefOr[String] = js.undefined
  
  var errors: js.Array[AppManifestError]
  
  /**
    * Parsed manifest properties
    */
  var parsed: js.UndefOr[AppManifestParsedProperties] = js.undefined
  
  /**
    * Manifest location.
    */
  var url: String
}
object GetAppManifestResponse {
  
  inline def apply(errors: js.Array[AppManifestError], url: String): GetAppManifestResponse = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAppManifestResponse]
  }
  
  extension [Self <: GetAppManifestResponse](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setErrors(value: js.Array[AppManifestError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: AppManifestError*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    inline def setParsed(value: AppManifestParsedProperties): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
    
    inline def setParsedUndefined: Self = StObject.set(x, "parsed", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
