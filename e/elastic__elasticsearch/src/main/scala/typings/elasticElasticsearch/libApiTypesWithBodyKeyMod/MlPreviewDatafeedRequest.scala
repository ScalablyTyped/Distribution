package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Datafeedconfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPreviewDatafeedRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Datafeedconfig] = js.undefined
  
  var datafeed_id: js.UndefOr[Id] = js.undefined
}
object MlPreviewDatafeedRequest {
  
  inline def apply(): MlPreviewDatafeedRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlPreviewDatafeedRequest]
  }
  
  extension [Self <: MlPreviewDatafeedRequest](x: Self) {
    
    inline def setBody(value: Datafeedconfig): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setDatafeed_id(value: Id): Self = StObject.set(x, "datafeed_id", value.asInstanceOf[js.Any])
    
    inline def setDatafeed_idUndefined: Self = StObject.set(x, "datafeed_id", js.undefined)
  }
}
