package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Builder for ProductCustomLabel objects. */
trait ProductCustomLabelBuilder
  extends StObject
     with Builder[ProductCustomLabelOperation] {
  
  /** Specifies the bid of the product custom label. */
  def withBid(bid: Double): this.type
  
  /** Specifies the type of custom label and return the product custom label builder. */
  def withType(`type`: String): this.type
  
  /** Specifies the value of the product custom label. */
  def withValue(value: String): this.type
}
object ProductCustomLabelBuilder {
  
  inline def apply(
    build: () => ProductCustomLabelOperation,
    withBid: Double => ProductCustomLabelBuilder,
    withType: String => ProductCustomLabelBuilder,
    withValue: String => ProductCustomLabelBuilder
  ): ProductCustomLabelBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withBid = js.Any.fromFunction1(withBid), withType = js.Any.fromFunction1(withType), withValue = js.Any.fromFunction1(withValue))
    __obj.asInstanceOf[ProductCustomLabelBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProductCustomLabelBuilder] (val x: Self) extends AnyVal {
    
    inline def setWithBid(value: Double => ProductCustomLabelBuilder): Self = StObject.set(x, "withBid", js.Any.fromFunction1(value))
    
    inline def setWithType(value: String => ProductCustomLabelBuilder): Self = StObject.set(x, "withType", js.Any.fromFunction1(value))
    
    inline def setWithValue(value: String => ProductCustomLabelBuilder): Self = StObject.set(x, "withValue", js.Any.fromFunction1(value))
  }
}
