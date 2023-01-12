package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupStartJobRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var id: Id
}
object RollupStartJobRequest {
  
  inline def apply(id: Id): RollupStartJobRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupStartJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RollupStartJobRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
