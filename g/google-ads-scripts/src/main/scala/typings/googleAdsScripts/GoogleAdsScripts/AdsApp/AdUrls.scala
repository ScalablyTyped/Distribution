package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to ad URLs. See Using [Upgraded URLs](https://support.google.com/google-ads/answer/6080568) for more information.
  */
trait AdUrls extends StObject {
  
  def getCustomParameters(): Record[String, String]
  
  def getFinalUrl(): String
  
  def getFinalUrlSuffix(): String
  
  def getMobileFinalUrl(): String
  
  def getTrackingTemplate(): String
}
object AdUrls {
  
  inline def apply(
    getCustomParameters: () => Record[String, String],
    getFinalUrl: () => String,
    getFinalUrlSuffix: () => String,
    getMobileFinalUrl: () => String,
    getTrackingTemplate: () => String
  ): AdUrls = {
    val __obj = js.Dynamic.literal(getCustomParameters = js.Any.fromFunction0(getCustomParameters), getFinalUrl = js.Any.fromFunction0(getFinalUrl), getFinalUrlSuffix = js.Any.fromFunction0(getFinalUrlSuffix), getMobileFinalUrl = js.Any.fromFunction0(getMobileFinalUrl), getTrackingTemplate = js.Any.fromFunction0(getTrackingTemplate))
    __obj.asInstanceOf[AdUrls]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdUrls] (val x: Self) extends AnyVal {
    
    inline def setGetCustomParameters(value: () => Record[String, String]): Self = StObject.set(x, "getCustomParameters", js.Any.fromFunction0(value))
    
    inline def setGetFinalUrl(value: () => String): Self = StObject.set(x, "getFinalUrl", js.Any.fromFunction0(value))
    
    inline def setGetFinalUrlSuffix(value: () => String): Self = StObject.set(x, "getFinalUrlSuffix", js.Any.fromFunction0(value))
    
    inline def setGetMobileFinalUrl(value: () => String): Self = StObject.set(x, "getMobileFinalUrl", js.Any.fromFunction0(value))
    
    inline def setGetTrackingTemplate(value: () => String): Self = StObject.set(x, "getTrackingTemplate", js.Any.fromFunction0(value))
  }
}
