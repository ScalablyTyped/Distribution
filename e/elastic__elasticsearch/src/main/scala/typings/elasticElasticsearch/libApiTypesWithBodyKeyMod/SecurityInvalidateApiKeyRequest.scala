package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityInvalidateApiKeyRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[typings.elasticElasticsearch.anon.Name] = js.undefined
}
object SecurityInvalidateApiKeyRequest {
  
  inline def apply(): SecurityInvalidateApiKeyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityInvalidateApiKeyRequest]
  }
  
  extension [Self <: SecurityInvalidateApiKeyRequest](x: Self) {
    
    inline def setBody(value: typings.elasticElasticsearch.anon.Name): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
