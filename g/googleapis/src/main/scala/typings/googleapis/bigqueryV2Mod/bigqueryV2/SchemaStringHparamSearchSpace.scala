package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStringHparamSearchSpace extends StObject {
  
  /**
    * Canididates for the string or enum parameter in lower case.
    */
  var candidates: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaStringHparamSearchSpace {
  
  inline def apply(): SchemaStringHparamSearchSpace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStringHparamSearchSpace]
  }
  
  extension [Self <: SchemaStringHparamSearchSpace](x: Self) {
    
    inline def setCandidates(value: js.Array[String]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    inline def setCandidatesNull: Self = StObject.set(x, "candidates", null)
    
    inline def setCandidatesUndefined: Self = StObject.set(x, "candidates", js.undefined)
    
    inline def setCandidatesVarargs(value: String*): Self = StObject.set(x, "candidates", js.Array(value*))
  }
}
