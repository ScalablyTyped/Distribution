package typings.execall

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("execall", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(regexp: js.RegExp, string: String): js.Array[Match] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(regexp.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[js.Array[Match]]
  
  trait Match extends StObject {
    
    var index: Double
    
    var `match`: String
    
    var subMatches: js.Array[String]
  }
  object Match {
    
    inline def apply(index: Double, `match`: String, subMatches: js.Array[String]): Match = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], subMatches = subMatches.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Match]
    }
    
    extension [Self <: Match](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setMatch(value: String): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setSubMatches(value: js.Array[String]): Self = StObject.set(x, "subMatches", value.asInstanceOf[js.Any])
      
      inline def setSubMatchesVarargs(value: String*): Self = StObject.set(x, "subMatches", js.Array(value*))
    }
  }
}
