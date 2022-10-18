package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityPutUserResponse extends StObject {
  
  var created: Boolean
}
object SecurityPutUserResponse {
  
  inline def apply(created: Boolean): SecurityPutUserResponse = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityPutUserResponse]
  }
  
  extension [Self <: SecurityPutUserResponse](x: Self) {
    
    inline def setCreated(value: Boolean): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
  }
}
