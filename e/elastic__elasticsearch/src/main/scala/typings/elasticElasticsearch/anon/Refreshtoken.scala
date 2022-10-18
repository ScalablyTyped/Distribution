package typings.elasticElasticsearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Refreshtoken extends StObject {
  
  var refresh_token: js.UndefOr[String] = js.undefined
  
  var token: String
}
object Refreshtoken {
  
  inline def apply(token: String): Refreshtoken = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Refreshtoken]
  }
  
  extension [Self <: Refreshtoken](x: Self) {
    
    inline def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
    
    inline def setRefresh_tokenUndefined: Self = StObject.set(x, "refresh_token", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
