package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIntCandidates extends StObject {
  
  /**
    * Candidates for the int parameter in increasing order.
    */
  var candidates: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaIntCandidates {
  
  inline def apply(): SchemaIntCandidates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIntCandidates]
  }
  
  extension [Self <: SchemaIntCandidates](x: Self) {
    
    inline def setCandidates(value: js.Array[String]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    inline def setCandidatesNull: Self = StObject.set(x, "candidates", null)
    
    inline def setCandidatesUndefined: Self = StObject.set(x, "candidates", js.undefined)
    
    inline def setCandidatesVarargs(value: String*): Self = StObject.set(x, "candidates", js.Array(value*))
  }
}
