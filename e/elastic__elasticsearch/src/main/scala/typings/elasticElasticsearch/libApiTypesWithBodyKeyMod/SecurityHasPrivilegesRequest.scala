package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Application
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityHasPrivilegesRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Application] = js.undefined
  
  var user: js.UndefOr[Name] = js.undefined
}
object SecurityHasPrivilegesRequest {
  
  inline def apply(): SecurityHasPrivilegesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityHasPrivilegesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityHasPrivilegesRequest] (val x: Self) extends AnyVal {
    
    inline def setBody(value: Application): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setUser(value: Name): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
