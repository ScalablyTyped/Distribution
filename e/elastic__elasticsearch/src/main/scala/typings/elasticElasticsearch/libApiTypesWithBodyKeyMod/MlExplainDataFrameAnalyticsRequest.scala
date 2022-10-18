package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Allowlazystart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlExplainDataFrameAnalyticsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Allowlazystart] = js.undefined
  
  var id: js.UndefOr[Id] = js.undefined
}
object MlExplainDataFrameAnalyticsRequest {
  
  inline def apply(): MlExplainDataFrameAnalyticsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlExplainDataFrameAnalyticsRequest]
  }
  
  extension [Self <: MlExplainDataFrameAnalyticsRequest](x: Self) {
    
    inline def setBody(value: Allowlazystart): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
