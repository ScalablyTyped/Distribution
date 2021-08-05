package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGetUser
  extends StObject
     with Generic {
  
  var username: js.UndefOr[String | js.Array[String]] = js.undefined
}
object SecurityGetUser {
  
  inline def apply(): SecurityGetUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGetUser]
  }
  
  extension [Self <: SecurityGetUser](x: Self) {
    
    inline def setUsername(value: String | js.Array[String]): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    inline def setUsernameVarargs(value: String*): Self = StObject.set(x, "username", js.Array(value :_*))
  }
}
