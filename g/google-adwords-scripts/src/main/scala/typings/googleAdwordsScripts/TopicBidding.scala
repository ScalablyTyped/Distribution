package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicBidding extends AdWordsBidding {
  
  def clearCpc(): Unit = js.native
  
  def clearCpm(): Unit = js.native
  
  def getCpc(): Double = js.native
  
  def getCpm(): Double = js.native
  
  def setCpc(cpc: Double): Unit = js.native
  
  def setCpm(cpm: Double): Unit = js.native
}
object TopicBidding {
  
  @scala.inline
  def apply(
    clearCpc: () => Unit,
    clearCpm: () => Unit,
    getCpc: () => Double,
    getCpm: () => Double,
    getStrategy: () => BiddingStrategy,
    getStrategySource: () => BiddingStrategySource,
    getStrategyType: () => String,
    setCpc: Double => Unit,
    setCpm: Double => Unit
  ): TopicBidding = {
    val __obj = js.Dynamic.literal(clearCpc = js.Any.fromFunction0(clearCpc), clearCpm = js.Any.fromFunction0(clearCpm), getCpc = js.Any.fromFunction0(getCpc), getCpm = js.Any.fromFunction0(getCpm), getStrategy = js.Any.fromFunction0(getStrategy), getStrategySource = js.Any.fromFunction0(getStrategySource), getStrategyType = js.Any.fromFunction0(getStrategyType), setCpc = js.Any.fromFunction1(setCpc), setCpm = js.Any.fromFunction1(setCpm))
    __obj.asInstanceOf[TopicBidding]
  }
  
  @scala.inline
  implicit class TopicBiddingMutableBuilder[Self <: TopicBidding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearCpc(value: () => Unit): Self = StObject.set(x, "clearCpc", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearCpm(value: () => Unit): Self = StObject.set(x, "clearCpm", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCpc(value: () => Double): Self = StObject.set(x, "getCpc", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCpm(value: () => Double): Self = StObject.set(x, "getCpm", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetCpc(value: Double => Unit): Self = StObject.set(x, "setCpc", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetCpm(value: Double => Unit): Self = StObject.set(x, "setCpm", js.Any.fromFunction1(value))
  }
}
