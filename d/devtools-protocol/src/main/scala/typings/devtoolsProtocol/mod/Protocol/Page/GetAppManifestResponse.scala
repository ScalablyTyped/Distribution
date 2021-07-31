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
  
  @scala.inline
  def apply(errors: js.Array[AppManifestError], url: String): GetAppManifestResponse = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAppManifestResponse]
  }
  
  @scala.inline
  implicit class GetAppManifestResponseMutableBuilder[Self <: GetAppManifestResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setErrors(value: js.Array[AppManifestError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: AppManifestError*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setParsed(value: AppManifestParsedProperties): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParsedUndefined: Self = StObject.set(x, "parsed", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
