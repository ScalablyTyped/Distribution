package typings.googleMapReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BESTGUESS extends StObject {
  
  var BEST_GUESS: String
  
  var OPTIMISTIC: String
  
  var PESSIMISTIC: String
}
object BESTGUESS {
  
  inline def apply(BEST_GUESS: String, OPTIMISTIC: String, PESSIMISTIC: String): BESTGUESS = {
    val __obj = js.Dynamic.literal(BEST_GUESS = BEST_GUESS.asInstanceOf[js.Any], OPTIMISTIC = OPTIMISTIC.asInstanceOf[js.Any], PESSIMISTIC = PESSIMISTIC.asInstanceOf[js.Any])
    __obj.asInstanceOf[BESTGUESS]
  }
  
  extension [Self <: BESTGUESS](x: Self) {
    
    inline def setBEST_GUESS(value: String): Self = StObject.set(x, "BEST_GUESS", value.asInstanceOf[js.Any])
    
    inline def setOPTIMISTIC(value: String): Self = StObject.set(x, "OPTIMISTIC", value.asInstanceOf[js.Any])
    
    inline def setPESSIMISTIC(value: String): Self = StObject.set(x, "PESSIMISTIC", value.asInstanceOf[js.Any])
  }
}
