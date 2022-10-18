package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityApplicationGlobalUserPrivileges extends StObject {
  
  var manage: SecurityManageUserPrivileges
}
object SecurityApplicationGlobalUserPrivileges {
  
  inline def apply(manage: SecurityManageUserPrivileges): SecurityApplicationGlobalUserPrivileges = {
    val __obj = js.Dynamic.literal(manage = manage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityApplicationGlobalUserPrivileges]
  }
  
  extension [Self <: SecurityApplicationGlobalUserPrivileges](x: Self) {
    
    inline def setManage(value: SecurityManageUserPrivileges): Self = StObject.set(x, "manage", value.asInstanceOf[js.Any])
  }
}
