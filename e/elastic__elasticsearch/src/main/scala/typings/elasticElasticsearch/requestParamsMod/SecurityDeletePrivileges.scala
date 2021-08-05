package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.wait_for
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityDeletePrivileges
  extends StObject
     with Generic {
  
  var application: String
  
  var name: String
  
  var refresh: js.UndefOr[wait_for | Boolean] = js.undefined
}
object SecurityDeletePrivileges {
  
  inline def apply(application: String, name: String): SecurityDeletePrivileges = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityDeletePrivileges]
  }
  
  extension [Self <: SecurityDeletePrivileges](x: Self) {
    
    inline def setApplication(value: String): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: wait_for | Boolean): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
  }
}
