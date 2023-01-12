package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for VideoMobileApplication objects.
  *
  * Example usage:
  *
  *      var videoMobileApplicationBuilder = videoAdGroup.videoTargeting().newMobileApplicationBuilder();
  *      var videoMobileApplicationOperation = videoMobileApplicationBuilder
  *        .withAppId('1-936971630')     // required
  *        .build();                     // create the mobile application
  */
trait VideoMobileApplicationBuilder
  extends StObject
     with Builder[VideoMobileApplicationOperation] {
  
  /** Builds the excluded video mobile application. */
  def exclude(): ExcludedVideoMobileApplicationOperation
  
  /** Sets the ID of the mobile application. */
  def withAppId(appId: String): this.type
}
object VideoMobileApplicationBuilder {
  
  inline def apply(
    build: () => VideoMobileApplicationOperation,
    exclude: () => ExcludedVideoMobileApplicationOperation,
    withAppId: String => VideoMobileApplicationBuilder
  ): VideoMobileApplicationBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), exclude = js.Any.fromFunction0(exclude), withAppId = js.Any.fromFunction1(withAppId))
    __obj.asInstanceOf[VideoMobileApplicationBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoMobileApplicationBuilder] (val x: Self) extends AnyVal {
    
    inline def setExclude(value: () => ExcludedVideoMobileApplicationOperation): Self = StObject.set(x, "exclude", js.Any.fromFunction0(value))
    
    inline def setWithAppId(value: String => VideoMobileApplicationBuilder): Self = StObject.set(x, "withAppId", js.Any.fromFunction1(value))
  }
}
