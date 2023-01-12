package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGlobalPrivilege extends StObject {
  
  var application: SecurityApplicationGlobalUserPrivileges
}
object SecurityGlobalPrivilege {
  
  inline def apply(application: SecurityApplicationGlobalUserPrivileges): SecurityGlobalPrivilege = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGlobalPrivilege]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityGlobalPrivilege] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: SecurityApplicationGlobalUserPrivileges): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
  }
}
