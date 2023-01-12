package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlValidateDetectorRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var detector: js.UndefOr[MlDetector] = js.undefined
}
object MlValidateDetectorRequest {
  
  inline def apply(): MlValidateDetectorRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlValidateDetectorRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlValidateDetectorRequest] (val x: Self) extends AnyVal {
    
    inline def setDetector(value: MlDetector): Self = StObject.set(x, "detector", value.asInstanceOf[js.Any])
    
    inline def setDetectorUndefined: Self = StObject.set(x, "detector", js.undefined)
  }
}
