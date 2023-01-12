package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Builder for ProductType objects. */
trait ProductTypeBuilder
  extends StObject
     with Builder[ProductTypeOperation] {
  
  /** Specifies the bid of the product type. */
  def withBid(bid: Double): this.type
  
  /** Specifies the value of the product type. */
  def withValue(value: String): this.type
}
object ProductTypeBuilder {
  
  inline def apply(
    build: () => ProductTypeOperation,
    withBid: Double => ProductTypeBuilder,
    withValue: String => ProductTypeBuilder
  ): ProductTypeBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withBid = js.Any.fromFunction1(withBid), withValue = js.Any.fromFunction1(withValue))
    __obj.asInstanceOf[ProductTypeBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProductTypeBuilder] (val x: Self) extends AnyVal {
    
    inline def setWithBid(value: Double => ProductTypeBuilder): Self = StObject.set(x, "withBid", js.Any.fromFunction1(value))
    
    inline def setWithValue(value: String => ProductTypeBuilder): Self = StObject.set(x, "withValue", js.Any.fromFunction1(value))
  }
}
