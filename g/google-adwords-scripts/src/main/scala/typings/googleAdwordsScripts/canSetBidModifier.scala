package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait canSetBidModifier extends StObject {
  
  def getBidModifier(): Double
  
  def setBidModifier(modifier: Double): Unit
}
object canSetBidModifier {
  
  inline def apply(getBidModifier: () => Double, setBidModifier: Double => Unit): canSetBidModifier = {
    val __obj = js.Dynamic.literal(getBidModifier = js.Any.fromFunction0(getBidModifier), setBidModifier = js.Any.fromFunction1(setBidModifier))
    __obj.asInstanceOf[canSetBidModifier]
  }
  
  extension [Self <: canSetBidModifier](x: Self) {
    
    inline def setGetBidModifier(value: () => Double): Self = StObject.set(x, "getBidModifier", js.Any.fromFunction0(value))
    
    inline def setSetBidModifier(value: Double => Unit): Self = StObject.set(x, "setBidModifier", js.Any.fromFunction1(value))
  }
}
