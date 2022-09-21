package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDoubleHparamSearchSpace extends StObject {
  
  /**
    * Candidates of the double hyperparameter.
    */
  var candidates: js.UndefOr[SchemaDoubleCandidates] = js.undefined
  
  /**
    * Range of the double hyperparameter.
    */
  var range: js.UndefOr[SchemaDoubleRange] = js.undefined
}
object SchemaDoubleHparamSearchSpace {
  
  inline def apply(): SchemaDoubleHparamSearchSpace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDoubleHparamSearchSpace]
  }
  
  extension [Self <: SchemaDoubleHparamSearchSpace](x: Self) {
    
    inline def setCandidates(value: SchemaDoubleCandidates): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    inline def setCandidatesUndefined: Self = StObject.set(x, "candidates", js.undefined)
    
    inline def setRange(value: SchemaDoubleRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
