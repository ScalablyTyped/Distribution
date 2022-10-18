package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityUpdateApiKeyRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[typings.elasticElasticsearch.anon.Metadata] = js.undefined
  
  var id: Id
}
object SecurityUpdateApiKeyRequest {
  
  inline def apply(id: Id): SecurityUpdateApiKeyRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityUpdateApiKeyRequest]
  }
  
  extension [Self <: SecurityUpdateApiKeyRequest](x: Self) {
    
    inline def setBody(value: typings.elasticElasticsearch.anon.Metadata): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
