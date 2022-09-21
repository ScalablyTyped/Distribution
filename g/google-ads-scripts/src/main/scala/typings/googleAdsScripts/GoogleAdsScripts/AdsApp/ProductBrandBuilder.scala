package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Builder for ProductBrand objects. */
trait ProductBrandBuilder
  extends StObject
     with Builder[ProductBrandOperation] {
  
  /** Specifies the bid of the product brand. */
  def withBid(bid: Double): this.type
  
  /** Specifies the name of the new product brand. */
  def withName(productBrandName: String): this.type
  
  /** Specifies the value of the product brand. */
  def withValue(value: String): this.type
}
object ProductBrandBuilder {
  
  inline def apply(
    build: () => ProductBrandOperation,
    withBid: Double => ProductBrandBuilder,
    withName: String => ProductBrandBuilder,
    withValue: String => ProductBrandBuilder
  ): ProductBrandBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withBid = js.Any.fromFunction1(withBid), withName = js.Any.fromFunction1(withName), withValue = js.Any.fromFunction1(withValue))
    __obj.asInstanceOf[ProductBrandBuilder]
  }
  
  extension [Self <: ProductBrandBuilder](x: Self) {
    
    inline def setWithBid(value: Double => ProductBrandBuilder): Self = StObject.set(x, "withBid", js.Any.fromFunction1(value))
    
    inline def setWithName(value: String => ProductBrandBuilder): Self = StObject.set(x, "withName", js.Any.fromFunction1(value))
    
    inline def setWithValue(value: String => ProductBrandBuilder): Self = StObject.set(x, "withValue", js.Any.fromFunction1(value))
  }
}
