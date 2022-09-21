package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Builder for ProductCategory objects. */
trait ProductCategoryBuilder
  extends StObject
     with Builder[ProductCategoryOperation] {
  
  /** Specifies the bid of the product category. */
  def withBid(bid: Double): this.type
  
  /** Specifies the name of the new product category. */
  def withName(productCategoryName: String): this.type
  
  /** Specifies the value of the product category. */
  def withValue(value: String): this.type
}
object ProductCategoryBuilder {
  
  inline def apply(
    build: () => ProductCategoryOperation,
    withBid: Double => ProductCategoryBuilder,
    withName: String => ProductCategoryBuilder,
    withValue: String => ProductCategoryBuilder
  ): ProductCategoryBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withBid = js.Any.fromFunction1(withBid), withName = js.Any.fromFunction1(withName), withValue = js.Any.fromFunction1(withValue))
    __obj.asInstanceOf[ProductCategoryBuilder]
  }
  
  extension [Self <: ProductCategoryBuilder](x: Self) {
    
    inline def setWithBid(value: Double => ProductCategoryBuilder): Self = StObject.set(x, "withBid", js.Any.fromFunction1(value))
    
    inline def setWithName(value: String => ProductCategoryBuilder): Self = StObject.set(x, "withName", js.Any.fromFunction1(value))
    
    inline def setWithValue(value: String => ProductCategoryBuilder): Self = StObject.set(x, "withValue", js.Any.fromFunction1(value))
  }
}
