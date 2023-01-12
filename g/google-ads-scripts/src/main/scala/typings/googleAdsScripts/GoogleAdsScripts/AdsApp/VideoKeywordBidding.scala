package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to a video criterion's bidding fields. */
trait VideoKeywordBidding extends StObject {
  
  /** Clears the max CPV bid for this video keyword. */
  def clearCpv(): Unit
  
  /** Returns the max CPV bid for this video keyword. */
  def getCpv(): Double
  
  /**
    * Returns the bidding strategy source of this video criterion.
    *
    * @deprecated **Deprecated**. Google Ads does not support setting bidding strategies at different levels. As a result, 'CAMPAIGN' is the only possible source for bidding strategies.
    */
  def getStrategySource(): String
  
  /** Returns the bidding strategy type of this video criterion. */
  def getStrategyType(): String
  
  /** Sets the max CPV bid for this video keyword. */
  def setCpv(cpv: Double): Unit
}
object VideoKeywordBidding {
  
  inline def apply(
    clearCpv: () => Unit,
    getCpv: () => Double,
    getStrategySource: () => String,
    getStrategyType: () => String,
    setCpv: Double => Unit
  ): VideoKeywordBidding = {
    val __obj = js.Dynamic.literal(clearCpv = js.Any.fromFunction0(clearCpv), getCpv = js.Any.fromFunction0(getCpv), getStrategySource = js.Any.fromFunction0(getStrategySource), getStrategyType = js.Any.fromFunction0(getStrategyType), setCpv = js.Any.fromFunction1(setCpv))
    __obj.asInstanceOf[VideoKeywordBidding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoKeywordBidding] (val x: Self) extends AnyVal {
    
    inline def setClearCpv(value: () => Unit): Self = StObject.set(x, "clearCpv", js.Any.fromFunction0(value))
    
    inline def setGetCpv(value: () => Double): Self = StObject.set(x, "getCpv", js.Any.fromFunction0(value))
    
    inline def setGetStrategySource(value: () => String): Self = StObject.set(x, "getStrategySource", js.Any.fromFunction0(value))
    
    inline def setGetStrategyType(value: () => String): Self = StObject.set(x, "getStrategyType", js.Any.fromFunction0(value))
    
    inline def setSetCpv(value: Double => Unit): Self = StObject.set(x, "setCpv", js.Any.fromFunction1(value))
  }
}
