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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RollupGetJobsRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
