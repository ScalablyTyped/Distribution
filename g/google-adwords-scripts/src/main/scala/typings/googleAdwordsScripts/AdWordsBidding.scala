package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdWordsBidding extends StObject {
  
  def getStrategy(): BiddingStrategy
  
  def getStrategySource(): BiddingStrategySource
  
  def getStrategyType(): String
}
object AdWordsBidding {
  
  inline def apply(
    getStrategy: () => BiddingStrategy,
    getStrategySource: () => BiddingStrategySource,
    getStrategyType: () => String
  ): AdWordsBidding = {
    val __obj = js.Dynamic.literal(getStrategy = js.Any.fromFunction0(getStrategy), getStrategySource = js.Any.fromFunction0(getStrategySource), getStrategyType = js.Any.fromFunction0(getStrategyType))
    __obj.asInstanceOf[AdWordsBidding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdWordsBidding] (val x: Self) extends AnyVal {
    
    inline def setGetStrategy(value: () => BiddingStrategy): Self = StObject.set(x, "getStrategy", js.Any.fromFunction0(value))
    
    inline def setGetStrategySource(value: () => BiddingStrategySource): Self = StObject.set(x, "getStrategySource", js.Any.fromFunction0(value))
    
    inline def setGetStrategyType(value: () => String): Self = StObject.set(x, "getStrategyType", js.Any.fromFunction0(value))
  }
}
