package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClosePointInTimeRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var id: Id
}
object ClosePointInTimeRequest {
  
  inline def apply(id: Id): ClosePointInTimeRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClosePointInTimeRequest]
  }
  
  extension [Self <: ClosePointInTimeRequest](x: Self) {
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
