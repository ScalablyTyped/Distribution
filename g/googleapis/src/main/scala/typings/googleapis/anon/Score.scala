package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Score extends StObject {
  
  var score: js.UndefOr[Double] = js.undefined
}
object Score {
  
  inline def apply(): Score = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Score]
  }
  
  extension [Self <: Score](x: Self) {
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
