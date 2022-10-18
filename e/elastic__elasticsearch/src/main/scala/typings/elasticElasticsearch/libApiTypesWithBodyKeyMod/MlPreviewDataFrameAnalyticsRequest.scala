package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPreviewDataFrameAnalyticsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Config] = js.undefined
  
  var id: js.UndefOr[Id] = js.undefined
}
object MlPreviewDataFrameAnalyticsRequest {
  
  inline def apply(): MlPreviewDataFrameAnalyticsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlPreviewDataFrameAnalyticsRequest]
  }
  
  extension [Self <: MlPreviewDataFrameAnalyticsRequest](x: Self) {
    
    inline def setBody(value: Config): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
