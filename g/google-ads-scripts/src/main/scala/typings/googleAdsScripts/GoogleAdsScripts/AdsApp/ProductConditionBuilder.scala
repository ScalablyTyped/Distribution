package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Builder for ProductCondition objects. */
trait ProductConditionBuilder
  extends StObject
     with Builder[ProductConditionOperation] {
  
  /** Specifies the bid of the product condition. */
  def withBid(bid: Double): this.type
  
  /** Specifies the condition of the new product condition. */
  def withCondition(condition: String): this.type
  
  /** Specifies the value of the product condition. */
  def withValue(value: String): this.type
}
object ProductConditionBuilder {
  
  inline def apply(
    build: () => ProductConditionOperation,
    withBid: Double => ProductConditionBuilder,
    withCondition: String => ProductConditionBuilder,
    withValue: String => ProductConditionBuilder
  ): ProductConditionBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withBid = js.Any.fromFunction1(withBid), withCondition = js.Any.fromFunction1(withCondition), withValue = js.Any.fromFunction1(withValue))
    __obj.asInstanceOf[ProductConditionBuilder]
  }
  
  extension [Self <: ProductConditionBuilder](x: Self) {
    
    inline def setWithBid(value: Double => ProductConditionBuilder): Self = StObject.set(x, "withBid", js.Any.fromFunction1(value))
    
    inline def setWithCondition(value: String => ProductConditionBuilder): Self = StObject.set(x, "withCondition", js.Any.fromFunction1(value))
    
    inline def setWithValue(value: String => ProductConditionBuilder): Self = StObject.set(x, "withValue", js.Any.fromFunction1(value))
  }
}
