package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlStartDatafeedRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Start] = js.undefined
  
  var datafeed_id: Id
}
object MlStartDatafeedRequest {
  
  inline def apply(datafeed_id: Id): MlStartDatafeedRequest = {
    val __obj = js.Dynamic.literal(datafeed_id = datafeed_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlStartDatafeedRequest]
  }
  
  extension [Self <: MlStartDatafeedRequest](x: Self) {
    
    inline def setBody(value: Start): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setDatafeed_id(value: Id): Self = StObject.set(x, "datafeed_id", value.asInstanceOf[js.Any])
  }
}
