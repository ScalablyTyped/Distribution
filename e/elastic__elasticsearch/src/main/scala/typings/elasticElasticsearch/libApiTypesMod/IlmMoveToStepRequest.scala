package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IlmMoveToStepRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var current_step: js.UndefOr[IlmMoveToStepStepKey] = js.undefined
  
  var index: IndexName
  
  var next_step: js.UndefOr[IlmMoveToStepStepKey] = js.undefined
}
object IlmMoveToStepRequest {
  
  inline def apply(index: IndexName): IlmMoveToStepRequest = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IlmMoveToStepRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IlmMoveToStepRequest] (val x: Self) extends AnyVal {
    
    inline def setCurrent_step(value: IlmMoveToStepStepKey): Self = StObject.set(x, "current_step", value.asInstanceOf[js.Any])
    
    inline def setCurrent_stepUndefined: Self = StObject.set(x, "current_step", js.undefined)
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setNext_step(value: IlmMoveToStepStepKey): Self = StObject.set(x, "next_step", value.asInstanceOf[js.Any])
    
    inline def setNext_stepUndefined: Self = StObject.set(x, "next_step", js.undefined)
  }
}
