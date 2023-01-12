package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupDeleteJobRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var id: Id
}
object RollupDeleteJobRequest {
  
  inline def apply(id: Id): RollupDeleteJobRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupDeleteJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RollupDeleteJobRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
