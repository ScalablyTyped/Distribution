package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Realm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecuritySamlPrepareAuthenticationRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Realm] = js.undefined
}
object SecuritySamlPrepareAuthenticationRequest {
  
  inline def apply(): SecuritySamlPrepareAuthenticationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecuritySamlPrepareAuthenticationRequest]
  }
  
  extension [Self <: SecuritySamlPrepareAuthenticationRequest](x: Self) {
    
    inline def setBody(value: Realm): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
