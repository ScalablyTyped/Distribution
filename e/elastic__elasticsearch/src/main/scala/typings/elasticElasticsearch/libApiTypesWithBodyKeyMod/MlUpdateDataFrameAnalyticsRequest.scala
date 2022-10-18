package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Maxnumthreads
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlUpdateDataFrameAnalyticsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Maxnumthreads] = js.undefined
  
  var id: Id
}
object MlUpdateDataFrameAnalyticsRequest {
  
  inline def apply(id: Id): MlUpdateDataFrameAnalyticsRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlUpdateDataFrameAnalyticsRequest]
  }
  
  extension [Self <: MlUpdateDataFrameAnalyticsRequest](x: Self) {
    
    inline def setBody(value: Maxnumthreads): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
