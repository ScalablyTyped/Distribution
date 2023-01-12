package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDeleteDatafeedRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var datafeed_id: Id
  
  var force: js.UndefOr[Boolean] = js.undefined
}
object MlDeleteDatafeedRequest {
  
  inline def apply(datafeed_id: Id): MlDeleteDatafeedRequest = {
    val __obj = js.Dynamic.literal(datafeed_id = datafeed_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDeleteDatafeedRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlDeleteDatafeedRequest] (val x: Self) extends AnyVal {
    
    inline def setDatafeed_id(value: Id): Self = StObject.set(x, "datafeed_id", value.asInstanceOf[js.Any])
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
  }
}
