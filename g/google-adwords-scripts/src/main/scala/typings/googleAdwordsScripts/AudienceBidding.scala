package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudienceBidding
  extends StObject
     with AdWordsBidding {
  
  def clearCpc(): Unit
  
  def clearCpm(): Unit
  
  def getCpc(): Double
  
  def getCpm(): Double
  
  def setCpc(cpc: Double): Unit
  
  def setCpm(cpm: Double): Unit
}
object AudienceBidding {
  
  inline def apply(
    clearCpc: () => Unit,
    clearCpm: () => Unit,
    getCpc: () => Double,
    getCpm: () => Double,
    getStrategy: () => BiddingStrategy,
    getStrategySource: () => BiddingStrategySource,
    getStrategyType: () => String,
    setCpc: Double => Unit,
    setCpm: Double => Unit
  ): AudienceBidding = {
    val __obj = js.Dynamic.literal(clearCpc = js.Any.fromFunction0(clearCpc), clearCpm = js.Any.fromFunction0(clearCpm), getCpc = js.Any.fromFunction0(getCpc), getCpm = js.Any.fromFunction0(getCpm), getStrategy = js.Any.fromFunction0(getStrategy), getStrategySource = js.Any.fromFunction0(getStrategySource), getStrategyType = js.Any.fromFunction0(getStrategyType), setCpc = js.Any.fromFunction1(setCpc), setCpm = js.Any.fromFunction1(setCpm))
    __obj.asInstanceOf[AudienceBidding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudienceBidding] (val x: Self) extends AnyVal {
    
    inline def setClearCpc(value: () => Unit): Self = StObject.set(x, "clearCpc", js.Any.fromFunction0(value))
    
    inline def setClearCpm(value: () => Unit): Self = StObject.set(x, "clearCpm", js.Any.fromFunction0(value))
    
    inline def setGetCpc(value: () => Double): Self = StObject.set(x, "getCpc", js.Any.fromFunction0(value))
    
    inline def setGetCpm(value: () => Double): Self = StObject.set(x, "getCpm", js.Any.fromFunction0(value))
    
    inline def setSetCpc(value: Double => Unit): Self = StObject.set(x, "setCpc", js.Any.fromFunction1(value))
    
    inline def setSetCpm(value: Double => Unit): Self = StObject.set(x, "setCpm", js.Any.fromFunction1(value))
  }
}
