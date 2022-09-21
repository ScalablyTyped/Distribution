package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for VideoPlacement objects.
  *
  * Example usage:
  *
  *      var videoPlacementBuilder = videoAdGroup.videoTargeting().newPlacementBuilder();
  *      var videoPlacementOperation = videoPlacementBuilder
  *        .withUrl('"http://www.site.com"')    // required
  *        .build();                            // create the placement
  */
trait VideoPlacementBuilder
  extends StObject
     with Builder[VideoPlacementOperation] {
  
  /** Builds the excluded video placement. */
  def exclude(): ExcludedVideoPlacementOperation
  
  /** Sets the URL of the placement. */
  def withUrl(url: String): this.type
}
object VideoPlacementBuilder {
  
  inline def apply(
    build: () => VideoPlacementOperation,
    exclude: () => ExcludedVideoPlacementOperation,
    withUrl: String => VideoPlacementBuilder
  ): VideoPlacementBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), exclude = js.Any.fromFunction0(exclude), withUrl = js.Any.fromFunction1(withUrl))
    __obj.asInstanceOf[VideoPlacementBuilder]
  }
  
  extension [Self <: VideoPlacementBuilder](x: Self) {
    
    inline def setExclude(value: () => ExcludedVideoPlacementOperation): Self = StObject.set(x, "exclude", js.Any.fromFunction0(value))
    
    inline def setWithUrl(value: String => VideoPlacementBuilder): Self = StObject.set(x, "withUrl", js.Any.fromFunction1(value))
  }
}
