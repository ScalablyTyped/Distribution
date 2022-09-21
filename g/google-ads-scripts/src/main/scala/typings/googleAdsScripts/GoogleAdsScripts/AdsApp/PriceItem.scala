package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PriceItem extends StObject {
  
  def getAmount(): Double
  
  def getCurrencyCode(): String
  
  def getDescription(): String
  
  def getFinalUrl(): String
  
  def getHeader(): String
  
  def getMobileFinalUrl(): String
  
  def getUnitType(): String
  
  def remove(): Unit
}
object PriceItem {
  
  inline def apply(
    getAmount: () => Double,
    getCurrencyCode: () => String,
    getDescription: () => String,
    getFinalUrl: () => String,
    getHeader: () => String,
    getMobileFinalUrl: () => String,
    getUnitType: () => String,
    remove: () => Unit
  ): PriceItem = {
    val __obj = js.Dynamic.literal(getAmount = js.Any.fromFunction0(getAmount), getCurrencyCode = js.Any.fromFunction0(getCurrencyCode), getDescription = js.Any.fromFunction0(getDescription), getFinalUrl = js.Any.fromFunction0(getFinalUrl), getHeader = js.Any.fromFunction0(getHeader), getMobileFinalUrl = js.Any.fromFunction0(getMobileFinalUrl), getUnitType = js.Any.fromFunction0(getUnitType), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[PriceItem]
  }
  
  extension [Self <: PriceItem](x: Self) {
    
    inline def setGetAmount(value: () => Double): Self = StObject.set(x, "getAmount", js.Any.fromFunction0(value))
    
    inline def setGetCurrencyCode(value: () => String): Self = StObject.set(x, "getCurrencyCode", js.Any.fromFunction0(value))
    
    inline def setGetDescription(value: () => String): Self = StObject.set(x, "getDescription", js.Any.fromFunction0(value))
    
    inline def setGetFinalUrl(value: () => String): Self = StObject.set(x, "getFinalUrl", js.Any.fromFunction0(value))
    
    inline def setGetHeader(value: () => String): Self = StObject.set(x, "getHeader", js.Any.fromFunction0(value))
    
    inline def setGetMobileFinalUrl(value: () => String): Self = StObject.set(x, "getMobileFinalUrl", js.Any.fromFunction0(value))
    
    inline def setGetUnitType(value: () => String): Self = StObject.set(x, "getUnitType", js.Any.fromFunction0(value))
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
