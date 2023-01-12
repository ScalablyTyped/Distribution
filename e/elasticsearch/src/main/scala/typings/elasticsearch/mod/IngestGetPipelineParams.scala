package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestGetPipelineParams
  extends StObject
     with GenericParams {
  
  var id: String
  
  var masterTimeout: js.UndefOr[Double] = js.undefined
}
object IngestGetPipelineParams {
  
  inline def apply(id: String): IngestGetPipelineParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestGetPipelineParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IngestGetPipelineParams] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMasterTimeout(value: Double): Self = StObject.set(x, "masterTimeout", value.asInstanceOf[js.Any])
    
    inline def setMasterTimeoutUndefined: Self = StObject.set(x, "masterTimeout", js.undefined)
  }
}
