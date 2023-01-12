package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGetUserPrivilegesRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var application: js.UndefOr[Name] = js.undefined
  
  var priviledge: js.UndefOr[Name] = js.undefined
  
  var username: js.UndefOr[Name | Null] = js.undefined
}
object SecurityGetUserPrivilegesRequest {
  
  inline def apply(): SecurityGetUserPrivilegesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGetUserPrivilegesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityGetUserPrivilegesRequest] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Name): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
    
    inline def setPriviledge(value: Name): Self = StObject.set(x, "priviledge", value.asInstanceOf[js.Any])
    
    inline def setPriviledgeUndefined: Self = StObject.set(x, "priviledge", js.undefined)
    
    inline def setUsername(value: Name): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameNull: Self = StObject.set(x, "username", null)
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
