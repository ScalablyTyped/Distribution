package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Analysisconfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlEstimateModelMemoryRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Analysisconfig] = js.undefined
}
object MlEstimateModelMemoryRequest {
  
  inline def apply(): MlEstimateModelMemoryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlEstimateModelMemoryRequest]
  }
  
  extension [Self <: MlEstimateModelMemoryRequest](x: Self) {
    
    inline def setBody(value: Analysisconfig): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
