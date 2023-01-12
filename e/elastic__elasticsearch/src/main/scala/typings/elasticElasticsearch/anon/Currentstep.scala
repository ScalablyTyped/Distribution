package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmMoveToStepStepKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Currentstep extends StObject {
  
  var current_step: js.UndefOr[IlmMoveToStepStepKey] = js.undefined
  
  var next_step: js.UndefOr[IlmMoveToStepStepKey] = js.undefined
}
object Currentstep {
  
  inline def apply(): Currentstep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Currentstep]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Currentstep] (val x: Self) extends AnyVal {
    
    inline def setCurrent_step(value: IlmMoveToStepStepKey): Self = StObject.set(x, "current_step", value.asInstanceOf[js.Any])
    
    inline def setCurrent_stepUndefined: Self = StObject.set(x, "current_step", js.undefined)
    
    inline def setNext_step(value: IlmMoveToStepStepKey): Self = StObject.set(x, "next_step", value.asInstanceOf[js.Any])
    
    inline def setNext_stepUndefined: Self = StObject.set(x, "next_step", js.undefined)
  }
}
