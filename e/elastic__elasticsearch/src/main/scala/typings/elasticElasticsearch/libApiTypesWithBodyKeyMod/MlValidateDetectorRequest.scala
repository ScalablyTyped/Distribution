package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlValidateDetectorRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, use 'detector' instead. */
  var body: js.UndefOr[MlDetector] = js.undefined
}
object MlValidateDetectorRequest {
  
  inline def apply(): MlValidateDetectorRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlValidateDetectorRequest]
  }
  
  extension [Self <: MlValidateDetectorRequest](x: Self) {
    
    inline def setBody(value: MlDetector): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
