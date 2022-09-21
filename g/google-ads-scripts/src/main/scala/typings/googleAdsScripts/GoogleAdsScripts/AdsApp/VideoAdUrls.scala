package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to ad URLs.
  */
trait VideoAdUrls extends StObject {
  
  /** Returns the custom parameters of the video ad. */
  def getCustomParameters(): Record[String, String]
  
  /** Returns the final URL of the video ad. */
  def getFinalUrl(): String
  
  /** Returns the tracking template of the video ad. */
  def getTrackingTemplate(): String
}
object VideoAdUrls {
  
  inline def apply(
    getCustomParameters: () => Record[String, String],
    getFinalUrl: () => String,
    getTrackingTemplate: () => String
  ): VideoAdUrls = {
    val __obj = js.Dynamic.literal(getCustomParameters = js.Any.fromFunction0(getCustomParameters), getFinalUrl = js.Any.fromFunction0(getFinalUrl), getTrackingTemplate = js.Any.fromFunction0(getTrackingTemplate))
    __obj.asInstanceOf[VideoAdUrls]
  }
  
  extension [Self <: VideoAdUrls](x: Self) {
    
    inline def setGetCustomParameters(value: () => Record[String, String]): Self = StObject.set(x, "getCustomParameters", js.Any.fromFunction0(value))
    
    inline def setGetFinalUrl(value: () => String): Self = StObject.set(x, "getFinalUrl", js.Any.fromFunction0(value))
    
    inline def setGetTrackingTemplate(value: () => String): Self = StObject.set(x, "getTrackingTemplate", js.Any.fromFunction0(value))
  }
}
