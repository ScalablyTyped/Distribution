package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to ad group URLs. */
trait AdGroupUrls extends StObject {
  
  def clearFinalUrlSuffix(): Unit
  
  def clearTrackingTemplate(): Unit
  
  def getCustomParameters(): Record[String, String]
  
  def getFinalUrlSuffix(): String
  
  def getTrackingTemplate(): String
  
  def setCustomParameters(customParameters: Record[String, String]): Unit
  
  def setFinalUrlSuffix(suffix: String): Unit
  
  def setTrackingTemplate(trackingTemplate: String): Unit
}
object AdGroupUrls {
  
  inline def apply(
    clearFinalUrlSuffix: () => Unit,
    clearTrackingTemplate: () => Unit,
    getCustomParameters: () => Record[String, String],
    getFinalUrlSuffix: () => String,
    getTrackingTemplate: () => String,
    setCustomParameters: Record[String, String] => Unit,
    setFinalUrlSuffix: String => Unit,
    setTrackingTemplate: String => Unit
  ): AdGroupUrls = {
    val __obj = js.Dynamic.literal(clearFinalUrlSuffix = js.Any.fromFunction0(clearFinalUrlSuffix), clearTrackingTemplate = js.Any.fromFunction0(clearTrackingTemplate), getCustomParameters = js.Any.fromFunction0(getCustomParameters), getFinalUrlSuffix = js.Any.fromFunction0(getFinalUrlSuffix), getTrackingTemplate = js.Any.fromFunction0(getTrackingTemplate), setCustomParameters = js.Any.fromFunction1(setCustomParameters), setFinalUrlSuffix = js.Any.fromFunction1(setFinalUrlSuffix), setTrackingTemplate = js.Any.fromFunction1(setTrackingTemplate))
    __obj.asInstanceOf[AdGroupUrls]
  }
  
  extension [Self <: AdGroupUrls](x: Self) {
    
    inline def setClearFinalUrlSuffix(value: () => Unit): Self = StObject.set(x, "clearFinalUrlSuffix", js.Any.fromFunction0(value))
    
    inline def setClearTrackingTemplate(value: () => Unit): Self = StObject.set(x, "clearTrackingTemplate", js.Any.fromFunction0(value))
    
    inline def setGetCustomParameters(value: () => Record[String, String]): Self = StObject.set(x, "getCustomParameters", js.Any.fromFunction0(value))
    
    inline def setGetFinalUrlSuffix(value: () => String): Self = StObject.set(x, "getFinalUrlSuffix", js.Any.fromFunction0(value))
    
    inline def setGetTrackingTemplate(value: () => String): Self = StObject.set(x, "getTrackingTemplate", js.Any.fromFunction0(value))
    
    inline def setSetCustomParameters(value: Record[String, String] => Unit): Self = StObject.set(x, "setCustomParameters", js.Any.fromFunction1(value))
    
    inline def setSetFinalUrlSuffix(value: String => Unit): Self = StObject.set(x, "setFinalUrlSuffix", js.Any.fromFunction1(value))
    
    inline def setSetTrackingTemplate(value: String => Unit): Self = StObject.set(x, "setTrackingTemplate", js.Any.fromFunction1(value))
  }
}
