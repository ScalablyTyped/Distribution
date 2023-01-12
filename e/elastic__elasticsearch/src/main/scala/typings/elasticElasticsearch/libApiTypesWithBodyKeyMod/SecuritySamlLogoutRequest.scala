package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Refreshtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecuritySamlLogoutRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Refreshtoken] = js.undefined
}
object SecuritySamlLogoutRequest {
  
  inline def apply(): SecuritySamlLogoutRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecuritySamlLogoutRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecuritySamlLogoutRequest] (val x: Self) extends AnyVal {
    
    inline def setBody(value: Refreshtoken): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
