package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityDeleteRoleRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var name: Name
  
  var refresh: js.UndefOr[Refresh] = js.undefined
}
object SecurityDeleteRoleRequest {
  
  inline def apply(name: Name): SecurityDeleteRoleRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityDeleteRoleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityDeleteRoleRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: Refresh): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
  }
}
