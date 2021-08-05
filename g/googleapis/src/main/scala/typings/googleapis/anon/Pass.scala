package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pass extends StObject {
  
  var pass: js.UndefOr[Boolean] = js.undefined
  
  var score: js.UndefOr[Double] = js.undefined
}
object Pass {
  
  inline def apply(): Pass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pass]
  }
  
  extension [Self <: Pass](x: Self) {
    
    inline def setPass(value: Boolean): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    
    inline def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
