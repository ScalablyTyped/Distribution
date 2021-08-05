package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGetRoleMapping
  extends StObject
     with Generic {
  
  var name: js.UndefOr[String | js.Array[String]] = js.undefined
}
object SecurityGetRoleMapping {
  
  inline def apply(): SecurityGetRoleMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGetRoleMapping]
  }
  
  extension [Self <: SecurityGetRoleMapping](x: Self) {
    
    inline def setName(value: String | js.Array[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value :_*))
  }
}
