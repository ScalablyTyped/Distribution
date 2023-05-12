package typings.digitalGoodsBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  /**
    * Get a DigitalGoodsService instance for the given service provider URL.
    * The URL should be given by your payment provider and support the Digital Goods API (e.g. "https://play.google.com/billing").
    */
  def getDigitalGoodsService(serviceProvider: String): js.Promise[DigitalGoodsService]
}
object Window {
  
  inline def apply(getDigitalGoodsService: String => js.Promise[DigitalGoodsService]): Window = {
    val __obj = js.Dynamic.literal(getDigitalGoodsService = js.Any.fromFunction1(getDigitalGoodsService))
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    inline def setGetDigitalGoodsService(value: String => js.Promise[DigitalGoodsService]): Self = StObject.set(x, "getDigitalGoodsService", js.Any.fromFunction1(value))
  }
}
