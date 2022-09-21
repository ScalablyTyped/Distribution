package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDoubleCandidates extends StObject {
  
  /**
    * Candidates for the double parameter in increasing order.
    */
  var candidates: js.UndefOr[js.Array[Double] | Null] = js.undefined
}
object SchemaDoubleCandidates {
  
  inline def apply(): SchemaDoubleCandidates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDoubleCandidates]
  }
  
  extension [Self <: SchemaDoubleCandidates](x: Self) {
    
    inline def setCandidates(value: js.Array[Double]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    inline def setCandidatesNull: Self = StObject.set(x, "candidates", null)
    
    inline def setCandidatesUndefined: Self = StObject.set(x, "candidates", js.undefined)
    
    inline def setCandidatesVarargs(value: Double*): Self = StObject.set(x, "candidates", js.Array(value*))
  }
}
