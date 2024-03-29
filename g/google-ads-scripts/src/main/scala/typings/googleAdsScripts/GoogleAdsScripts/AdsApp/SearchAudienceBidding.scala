package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchAudienceBidding extends StObject {
  
  /** Clears the bid modifier value. */
  def clearBidModifier(): Unit
  
  /** Returns the current bid modifier value. */
  def getBidModifier(): Double
  
  /** Sets the bid modifier value for this audience to the specified value. */
  def setBidModifier(modifier: Double): Unit
}
object SearchAudienceBidding {
  
  inline def apply(clearBidModifier: () => Unit, getBidModifier: () => Double, setBidModifier: Double => Unit): SearchAudienceBidding = {
    val __obj = js.Dynamic.literal(clearBidModifier = js.Any.fromFunction0(clearBidModifier), getBidModifier = js.Any.fromFunction0(getBidModifier), setBidModifier = js.Any.fromFunction1(setBidModifier))
    __obj.asInstanceOf[SearchAudienceBidding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchAudienceBidding] (val x: Self) extends AnyVal {
    
    inline def setClearBidModifier(value: () => Unit): Self = StObject.set(x, "clearBidModifier", js.Any.fromFunction0(value))
    
    inline def setGetBidModifier(value: () => Double): Self = StObject.set(x, "getBidModifier", js.Any.fromFunction0(value))
    
    inline def setSetBidModifier(value: Double => Unit): Self = StObject.set(x, "setBidModifier", js.Any.fromFunction1(value))
  }
}
