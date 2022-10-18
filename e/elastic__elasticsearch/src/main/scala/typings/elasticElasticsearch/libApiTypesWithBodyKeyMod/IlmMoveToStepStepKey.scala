package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IlmMoveToStepStepKey extends StObject {
  
  var action: String
  
  var name: String
  
  var phase: String
}
object IlmMoveToStepStepKey {
  
  inline def apply(action: String, name: String, phase: String): IlmMoveToStepStepKey = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any])
    __obj.asInstanceOf[IlmMoveToStepStepKey]
  }
  
  extension [Self <: IlmMoveToStepStepKey](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPhase(value: String): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
  }
}
