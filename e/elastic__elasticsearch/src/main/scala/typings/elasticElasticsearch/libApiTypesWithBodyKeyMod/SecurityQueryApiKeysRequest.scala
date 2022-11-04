package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.From
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityQueryApiKeysRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[From] = js.undefined
  
  var with_limited_by: js.UndefOr[Boolean] = js.undefined
}
object SecurityQueryApiKeysRequest {
  
  inline def apply(): SecurityQueryApiKeysRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityQueryApiKeysRequest]
  }
  
  extension [Self <: SecurityQueryApiKeysRequest](x: Self) {
    
    inline def setBody(value: From): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setWith_limited_by(value: Boolean): Self = StObject.set(x, "with_limited_by", value.asInstanceOf[js.Any])
    
    inline def setWith_limited_byUndefined: Self = StObject.set(x, "with_limited_by", js.undefined)
  }
}
