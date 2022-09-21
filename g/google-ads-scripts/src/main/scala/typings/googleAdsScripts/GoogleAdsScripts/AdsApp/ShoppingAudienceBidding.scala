package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to a shopping audience's bidding fields. */
trait ShoppingAudienceBidding extends StObject {
  
  /** Clears the bid modifier value. */
  def clearBidModifier(): Unit
  
  /** Returns the current bid modifier value. */
  def getBidModifier(): Double
  
  /** Sets the bid modifier value for this audience to the specified value. */
  def setBidModifier(modifier: String): Unit
}
object ShoppingAudienceBidding {
  
  inline def apply(clearBidModifier: () => Unit, getBidModifier: () => Double, setBidModifier: String => Unit): ShoppingAudienceBidding = {
    val __obj = js.Dynamic.literal(clearBidModifier = js.Any.fromFunction0(clearBidModifier), getBidModifier = js.Any.fromFunction0(getBidModifier), setBidModifier = js.Any.fromFunction1(setBidModifier))
    __obj.asInstanceOf[ShoppingAudienceBidding]
  }
  
  extension [Self <: ShoppingAudienceBidding](x: Self) {
    
    inline def setClearBidModifier(value: () => Unit): Self = StObject.set(x, "clearBidModifier", js.Any.fromFunction0(value))
    
    inline def setGetBidModifier(value: () => Double): Self = StObject.set(x, "getBidModifier", js.Any.fromFunction0(value))
    
    inline def setSetBidModifier(value: String => Unit): Self = StObject.set(x, "setBidModifier", js.Any.fromFunction1(value))
  }
}
