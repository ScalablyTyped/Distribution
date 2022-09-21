package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to keyword URLs. */
trait KeywordUrls extends StObject {
  
  /** Clears the final URL of the keyword. */
  def clearFinalUrl(): Unit
  
  /** Clears the final URL suffix of the keyword. */
  def clearFinalUrlSuffix(): Unit
  
  /** Clears the mobile final URL of the keyword. */
  def clearMobileFinalUrl(): Unit
  
  /** Clears the tracking template of the keyword. */
  def clearTrackingTemplate(): Unit
  
  /** Returns the custom parameters of the keyword. */
  def getCustomParameters(): Record[String, String]
  
  /** Returns the final URL of the keyword. */
  def getFinalUrl(): String
  
  /** Returns the final URL suffix of the keyword. */
  def getFinalUrlSuffix(): String
  
  /** Returns the mobile final URL of the keyword. */
  def getMobileFinalUrl(): String
  
  /** Returns the tracking template of the keyword. */
  def getTrackingTemplate(): String
  
  /** Sets the custom parameters of the keyword. */
  def setCustomParameters(customParameters: Record[String, String]): Unit
  
  /** Sets the final URL of the keyword. */
  def setFinalUrl(finalUrl: String): Unit
  
  /** Sets the final URL suffix of the keyword. */
  def setFinalUrlSuffix(suffix: String): Unit
  
  /** Sets the mobile final URL of the keyword. */
  def setMobileFinalUrl(mobileFinalUrl: String): Unit
  
  /** Sets the tracking template of the keyword. */
  def setTrackingTemplate(trackingTemplate: String): Unit
}
object KeywordUrls {
  
  inline def apply(
    clearFinalUrl: () => Unit,
    clearFinalUrlSuffix: () => Unit,
    clearMobileFinalUrl: () => Unit,
    clearTrackingTemplate: () => Unit,
    getCustomParameters: () => Record[String, String],
    getFinalUrl: () => String,
    getFinalUrlSuffix: () => String,
    getMobileFinalUrl: () => String,
    getTrackingTemplate: () => String,
    setCustomParameters: Record[String, String] => Unit,
    setFinalUrl: String => Unit,
    setFinalUrlSuffix: String => Unit,
    setMobileFinalUrl: String => Unit,
    setTrackingTemplate: String => Unit
  ): KeywordUrls = {
    val __obj = js.Dynamic.literal(clearFinalUrl = js.Any.fromFunction0(clearFinalUrl), clearFinalUrlSuffix = js.Any.fromFunction0(clearFinalUrlSuffix), clearMobileFinalUrl = js.Any.fromFunction0(clearMobileFinalUrl), clearTrackingTemplate = js.Any.fromFunction0(clearTrackingTemplate), getCustomParameters = js.Any.fromFunction0(getCustomParameters), getFinalUrl = js.Any.fromFunction0(getFinalUrl), getFinalUrlSuffix = js.Any.fromFunction0(getFinalUrlSuffix), getMobileFinalUrl = js.Any.fromFunction0(getMobileFinalUrl), getTrackingTemplate = js.Any.fromFunction0(getTrackingTemplate), setCustomParameters = js.Any.fromFunction1(setCustomParameters), setFinalUrl = js.Any.fromFunction1(setFinalUrl), setFinalUrlSuffix = js.Any.fromFunction1(setFinalUrlSuffix), setMobileFinalUrl = js.Any.fromFunction1(setMobileFinalUrl), setTrackingTemplate = js.Any.fromFunction1(setTrackingTemplate))
    __obj.asInstanceOf[KeywordUrls]
  }
  
  extension [Self <: KeywordUrls](x: Self) {
    
    inline def setClearFinalUrl(value: () => Unit): Self = StObject.set(x, "clearFinalUrl", js.Any.fromFunction0(value))
    
    inline def setClearFinalUrlSuffix(value: () => Unit): Self = StObject.set(x, "clearFinalUrlSuffix", js.Any.fromFunction0(value))
    
    inline def setClearMobileFinalUrl(value: () => Unit): Self = StObject.set(x, "clearMobileFinalUrl", js.Any.fromFunction0(value))
    
    inline def setClearTrackingTemplate(value: () => Unit): Self = StObject.set(x, "clearTrackingTemplate", js.Any.fromFunction0(value))
    
    inline def setGetCustomParameters(value: () => Record[String, String]): Self = StObject.set(x, "getCustomParameters", js.Any.fromFunction0(value))
    
    inline def setGetFinalUrl(value: () => String): Self = StObject.set(x, "getFinalUrl", js.Any.fromFunction0(value))
    
    inline def setGetFinalUrlSuffix(value: () => String): Self = StObject.set(x, "getFinalUrlSuffix", js.Any.fromFunction0(value))
    
    inline def setGetMobileFinalUrl(value: () => String): Self = StObject.set(x, "getMobileFinalUrl", js.Any.fromFunction0(value))
    
    inline def setGetTrackingTemplate(value: () => String): Self = StObject.set(x, "getTrackingTemplate", js.Any.fromFunction0(value))
    
    inline def setSetCustomParameters(value: Record[String, String] => Unit): Self = StObject.set(x, "setCustomParameters", js.Any.fromFunction1(value))
    
    inline def setSetFinalUrl(value: String => Unit): Self = StObject.set(x, "setFinalUrl", js.Any.fromFunction1(value))
    
    inline def setSetFinalUrlSuffix(value: String => Unit): Self = StObject.set(x, "setFinalUrlSuffix", js.Any.fromFunction1(value))
    
    inline def setSetMobileFinalUrl(value: String => Unit): Self = StObject.set(x, "setMobileFinalUrl", js.Any.fromFunction1(value))
    
    inline def setSetTrackingTemplate(value: String => Unit): Self = StObject.set(x, "setTrackingTemplate", js.Any.fromFunction1(value))
  }
}
