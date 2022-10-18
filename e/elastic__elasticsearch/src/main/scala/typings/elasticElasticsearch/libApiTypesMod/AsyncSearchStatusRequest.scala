package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncSearchStatusRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var id: Id
}
object AsyncSearchStatusRequest {
  
  inline def apply(id: Id): AsyncSearchStatusRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncSearchStatusRequest]
  }
  
  extension [Self <: AsyncSearchStatusRequest](x: Self) {
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
