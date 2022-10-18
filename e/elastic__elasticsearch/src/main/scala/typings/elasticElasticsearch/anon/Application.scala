package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SecurityClusterPrivilege
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SecurityHasPrivilegesApplicationPrivilegesCheck
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SecurityHasPrivilegesIndexPrivilegesCheck
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Application extends StObject {
  
  var application: js.UndefOr[js.Array[SecurityHasPrivilegesApplicationPrivilegesCheck]] = js.undefined
  
  var cluster: js.UndefOr[js.Array[SecurityClusterPrivilege]] = js.undefined
  
  var index: js.UndefOr[js.Array[SecurityHasPrivilegesIndexPrivilegesCheck]] = js.undefined
}
object Application {
  
  inline def apply(): Application = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Application]
  }
  
  extension [Self <: Application](x: Self) {
    
    inline def setApplication(value: js.Array[SecurityHasPrivilegesApplicationPrivilegesCheck]): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
    
    inline def setApplicationVarargs(value: SecurityHasPrivilegesApplicationPrivilegesCheck*): Self = StObject.set(x, "application", js.Array(value*))
    
    inline def setCluster(value: js.Array[SecurityClusterPrivilege]): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setClusterVarargs(value: SecurityClusterPrivilege*): Self = StObject.set(x, "cluster", js.Array(value*))
    
    inline def setIndex(value: js.Array[SecurityHasPrivilegesIndexPrivilegesCheck]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndexVarargs(value: SecurityHasPrivilegesIndexPrivilegesCheck*): Self = StObject.set(x, "index", js.Array(value*))
  }
}
