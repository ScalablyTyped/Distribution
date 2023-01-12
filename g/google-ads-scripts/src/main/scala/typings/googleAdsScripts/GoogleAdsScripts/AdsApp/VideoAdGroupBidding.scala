package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to a video ad group's bidding fields. */
trait VideoAdGroupBidding extends StObject {
  
  /** Returns the Target CPA bid for this video ad group. */
  def getCpa(): Double
  
  /** Returns the CPM bid for this video ad group. */
  def getCpm(): Double
  
  /** Returns the max CPV bid for this video ad group. */
  def getCpv(): Double
  
  /**
    * Returns the bidding strategy source of this video ad group.
    *
    * @deprecated **Deprecated**. Google Ads does not support setting bidding strategies at different levels. As a result, 'CAMPAIGN' is the only possible source for bidding strategies.
    */
  def getStrategySource(): String
  
  /** Returns the bidding strategy type of this video ad group. */
  def getStrategyType(): String
  
  /** Returns the Target CPM bid for this video ad group. */
  def getTargetCpm(): Double
  
  /** Sets the Target CPA bid for this video ad group. */
  def setCpa(cpa: Double): Unit
  
  /** Sets the CPM bid for this video ad group. */
  def setCpm(cpm: Double): Unit
  
  /** Sets the max CPV bid for this video ad group. */
  def setCpv(cpv: Double): Unit
  
  /** Sets the Target CPM bid for this video ad group. */
  def setTargetCpm(cpm: Double): Unit
}
object VideoAdGroupBidding {
  
  inline def apply(
    getCpa: () => Double,
    getCpm: () => Double,
    getCpv: () => Double,
    getStrategySource: () => String,
    getStrategyType: () => String,
    getTargetCpm: () => Double,
    setCpa: Double => Unit,
    setCpm: Double => Unit,
    setCpv: Double => Unit,
    setTargetCpm: Double => Unit
  ): VideoAdGroupBidding = {
    val __obj = js.Dynamic.literal(getCpa = js.Any.fromFunction0(getCpa), getCpm = js.Any.fromFunction0(getCpm), getCpv = js.Any.fromFunction0(getCpv), getStrategySource = js.Any.fromFunction0(getStrategySource), getStrategyType = js.Any.fromFunction0(getStrategyType), getTargetCpm = js.Any.fromFunction0(getTargetCpm), setCpa = js.Any.fromFunction1(setCpa), setCpm = js.Any.fromFunction1(setCpm), setCpv = js.Any.fromFunction1(setCpv), setTargetCpm = js.Any.fromFunction1(setTargetCpm))
    __obj.asInstanceOf[VideoAdGroupBidding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoAdGroupBidding] (val x: Self) extends AnyVal {
    
    inline def setGetCpa(value: () => Double): Self = StObject.set(x, "getCpa", js.Any.fromFunction0(value))
    
    inline def setGetCpm(value: () => Double): Self = StObject.set(x, "getCpm", js.Any.fromFunction0(value))
    
    inline def setGetCpv(value: () => Double): Self = StObject.set(x, "getCpv", js.Any.fromFunction0(value))
    
    inline def setGetStrategySource(value: () => String): Self = StObject.set(x, "getStrategySource", js.Any.fromFunction0(value))
    
    inline def setGetStrategyType(value: () => String): Self = StObject.set(x, "getStrategyType", js.Any.fromFunction0(value))
    
    inline def setGetTargetCpm(value: () => Double): Self = StObject.set(x, "getTargetCpm", js.Any.fromFunction0(value))
    
    inline def setSetCpa(value: Double => Unit): Self = StObject.set(x, "setCpa", js.Any.fromFunction1(value))
    
    inline def setSetCpm(value: Double => Unit): Self = StObject.set(x, "setCpm", js.Any.fromFunction1(value))
    
    inline def setSetCpv(value: Double => Unit): Self = StObject.set(x, "setCpv", js.Any.fromFunction1(value))
    
    inline def setSetTargetCpm(value: Double => Unit): Self = StObject.set(x, "setTargetCpm", js.Any.fromFunction1(value))
  }
}
