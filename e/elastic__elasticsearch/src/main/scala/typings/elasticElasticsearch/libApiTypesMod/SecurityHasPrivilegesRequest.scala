package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityHasPrivilegesRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var application: js.UndefOr[js.Array[SecurityHasPrivilegesApplicationPrivilegesCheck]] = js.undefined
  
  var cluster: js.UndefOr[js.Array[SecurityClusterPrivilege]] = js.undefined
  
  var index: js.UndefOr[js.Array[SecurityHasPrivilegesIndexPrivilegesCheck]] = js.undefined
  
  var user: js.UndefOr[Name] = js.undefined
}
object SecurityHasPrivilegesRequest {
  
  inline def apply(): SecurityHasPrivilegesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityHasPrivilegesRequest]
  }
  
  extension [Self <: SecurityHasPrivilegesRequest](x: Self) {
    
    inline def setApplication(value: js.Array[SecurityHasPrivilegesApplicationPrivilegesCheck]): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
    
    inline def setApplicationVarargs(value: SecurityHasPrivilegesApplicationPrivilegesCheck*): Self = StObject.set(x, "application", js.Array(value*))
    
    inline def setCluster(value: js.Array[SecurityClusterPrivilege]): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setClusterVarargs(value: SecurityClusterPrivilege*): Self = StObject.set(x, "cluster", js.Array(value*))
    
    inline def setIndex(value: js.Array[SecurityHasPrivilegesIndexPrivilegesCheck]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndexVarargs(value: SecurityHasPrivilegesIndexPrivilegesCheck*): Self = StObject.set(x, "index", js.Array(value*))
    
    inline def setUser(value: Name): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
