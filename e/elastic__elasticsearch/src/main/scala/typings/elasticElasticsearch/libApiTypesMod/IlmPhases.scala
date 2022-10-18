package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IlmPhases extends StObject {
  
  var cold: js.UndefOr[IlmPhase] = js.undefined
  
  var delete: js.UndefOr[IlmPhase] = js.undefined
  
  var hot: js.UndefOr[IlmPhase] = js.undefined
  
  var warm: js.UndefOr[IlmPhase] = js.undefined
}
object IlmPhases {
  
  inline def apply(): IlmPhases = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IlmPhases]
  }
  
  extension [Self <: IlmPhases](x: Self) {
    
    inline def setCold(value: IlmPhase): Self = StObject.set(x, "cold", value.asInstanceOf[js.Any])
    
    inline def setColdUndefined: Self = StObject.set(x, "cold", js.undefined)
    
    inline def setDelete(value: IlmPhase): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    inline def setHot(value: IlmPhase): Self = StObject.set(x, "hot", value.asInstanceOf[js.Any])
    
    inline def setHotUndefined: Self = StObject.set(x, "hot", js.undefined)
    
    inline def setWarm(value: IlmPhase): Self = StObject.set(x, "warm", value.asInstanceOf[js.Any])
    
    inline def setWarmUndefined: Self = StObject.set(x, "warm", js.undefined)
  }
}
