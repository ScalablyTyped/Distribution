package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecuritySamlAuthenticateRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Content] = js.undefined
}
object SecuritySamlAuthenticateRequest {
  
  inline def apply(): SecuritySamlAuthenticateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecuritySamlAuthenticateRequest]
  }
  
  extension [Self <: SecuritySamlAuthenticateRequest](x: Self) {
    
    inline def setBody(value: Content): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
