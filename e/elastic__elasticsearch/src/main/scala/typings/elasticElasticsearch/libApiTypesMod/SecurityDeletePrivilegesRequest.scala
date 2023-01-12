package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityDeletePrivilegesRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var application: Name
  
  var name: Names
  
  var refresh: js.UndefOr[Refresh] = js.undefined
}
object SecurityDeletePrivilegesRequest {
  
  inline def apply(application: Name, name: Names): SecurityDeletePrivilegesRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityDeletePrivilegesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityDeletePrivilegesRequest] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Name): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setName(value: Names): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameVarargs(value: Name*): Self = StObject.set(x, "name", js.Array(value*))
    
    inline def setRefresh(value: Refresh): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
  }
}
