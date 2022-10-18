package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Apikey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGrantApiKeyRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Apikey] = js.undefined
}
object SecurityGrantApiKeyRequest {
  
  inline def apply(): SecurityGrantApiKeyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGrantApiKeyRequest]
  }
  
  extension [Self <: SecurityGrantApiKeyRequest](x: Self) {
    
    inline def setBody(value: Apikey): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
