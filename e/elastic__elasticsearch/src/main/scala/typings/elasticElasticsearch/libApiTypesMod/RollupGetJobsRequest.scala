package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupGetJobsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var id: js.UndefOr[Id] = js.undefined
}
object RollupGetJobsRequest {
  
  inline def apply(): RollupGetJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollupGetJobsRequest]
  }
  
  extension [Self <: RollupGetJobsRequest](x: Self) {
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
