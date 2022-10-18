package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityClearCachedRolesRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var name: Names
}
object SecurityClearCachedRolesRequest {
  
  inline def apply(name: Names): SecurityClearCachedRolesRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityClearCachedRolesRequest]
  }
  
  extension [Self <: SecurityClearCachedRolesRequest](x: Self) {
    
    inline def setName(value: Names): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameVarargs(value: Name*): Self = StObject.set(x, "name", js.Array(value*))
  }
}
