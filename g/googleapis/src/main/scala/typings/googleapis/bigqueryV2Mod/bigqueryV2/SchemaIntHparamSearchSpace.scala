package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIntHparamSearchSpace extends StObject {
  
  /**
    * Candidates of the int hyperparameter.
    */
  var candidates: js.UndefOr[SchemaIntCandidates] = js.undefined
  
  /**
    * Range of the int hyperparameter.
    */
  var range: js.UndefOr[SchemaIntRange] = js.undefined
}
object SchemaIntHparamSearchSpace {
  
  inline def apply(): SchemaIntHparamSearchSpace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIntHparamSearchSpace]
  }
  
  extension [Self <: SchemaIntHparamSearchSpace](x: Self) {
    
    inline def setCandidates(value: SchemaIntCandidates): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    inline def setCandidatesUndefined: Self = StObject.set(x, "candidates", js.undefined)
    
    inline def setRange(value: SchemaIntRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
