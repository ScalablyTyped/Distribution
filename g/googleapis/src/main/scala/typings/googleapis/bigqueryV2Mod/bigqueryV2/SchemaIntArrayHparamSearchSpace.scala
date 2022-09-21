package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIntArrayHparamSearchSpace extends StObject {
  
  /**
    * Candidates for the int array parameter.
    */
  var candidates: js.UndefOr[js.Array[SchemaIntArray]] = js.undefined
}
object SchemaIntArrayHparamSearchSpace {
  
  inline def apply(): SchemaIntArrayHparamSearchSpace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIntArrayHparamSearchSpace]
  }
  
  extension [Self <: SchemaIntArrayHparamSearchSpace](x: Self) {
    
    inline def setCandidates(value: js.Array[SchemaIntArray]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    inline def setCandidatesUndefined: Self = StObject.set(x, "candidates", js.undefined)
    
    inline def setCandidatesVarargs(value: SchemaIntArray*): Self = StObject.set(x, "candidates", js.Array(value*))
  }
}
