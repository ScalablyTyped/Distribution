package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Builder for ProductChannel objects. */
trait ProductChannelBuilder
  extends StObject
     with Builder[ProductChannelOperation] {
  
  /** Specifies the bid of the product channel. */
  def withBid(bid: Double): this.type
  
  /** Specifies the channel of the new product channel. */
  def withChannel(channel: String): this.type
  
  /** Specifies the value of the product channel. */
  def withValue(value: String): this.type
}
object ProductChannelBuilder {
  
  inline def apply(
    build: () => ProductChannelOperation,
    withBid: Double => ProductChannelBuilder,
    withChannel: String => ProductChannelBuilder,
    withValue: String => ProductChannelBuilder
  ): ProductChannelBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withBid = js.Any.fromFunction1(withBid), withChannel = js.Any.fromFunction1(withChannel), withValue = js.Any.fromFunction1(withValue))
    __obj.asInstanceOf[ProductChannelBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProductChannelBuilder] (val x: Self) extends AnyVal {
    
    inline def setWithBid(value: Double => ProductChannelBuilder): Self = StObject.set(x, "withBid", js.Any.fromFunction1(value))
    
    inline def setWithChannel(value: String => ProductChannelBuilder): Self = StObject.set(x, "withChannel", js.Any.fromFunction1(value))
    
    inline def setWithValue(value: String => ProductChannelBuilder): Self = StObject.set(x, "withValue", js.Any.fromFunction1(value))
  }
}
