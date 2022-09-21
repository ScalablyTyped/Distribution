package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Starting point for creating a video ad in a video ad group.
  *
  * Typical usage:
  *
  *      var videoAdOperation = videoAdGroup.newVideoAd().inStreamAdBuilder()
  *         .withVideo(videoMedia)
  *         .withAdName("Ad name")
  *         .withDisplayUrl("example.com")
  *         .withFinalUrl("http://www.example.com")
  *         .build();
  *      var videoAd = videoAdOperation.getResult();
  */
trait VideoAdBuilderSpace extends StObject {
  
  /** Returns a new bumper ad builder associated with the ad group. */
  def bumperAdBuilder(): BumperAdBuilder
  
  /** Returns a new In-stream video ad builder associated with the ad group. */
  def inStreamAdBuilder(): InStreamAdBuilder
  
  /** Returns a new non-skippable ad builder associated with the ad group. */
  def nonSkippableAdBuilder(): NonSkippableAdBuilder
  
  /** Returns a new video discovery ad builder associated with the ad group. */
  def videoDiscoveryAdBuilder(): VideoDiscoveryAdBuilder
}
object VideoAdBuilderSpace {
  
  inline def apply(
    bumperAdBuilder: () => BumperAdBuilder,
    inStreamAdBuilder: () => InStreamAdBuilder,
    nonSkippableAdBuilder: () => NonSkippableAdBuilder,
    videoDiscoveryAdBuilder: () => VideoDiscoveryAdBuilder
  ): VideoAdBuilderSpace = {
    val __obj = js.Dynamic.literal(bumperAdBuilder = js.Any.fromFunction0(bumperAdBuilder), inStreamAdBuilder = js.Any.fromFunction0(inStreamAdBuilder), nonSkippableAdBuilder = js.Any.fromFunction0(nonSkippableAdBuilder), videoDiscoveryAdBuilder = js.Any.fromFunction0(videoDiscoveryAdBuilder))
    __obj.asInstanceOf[VideoAdBuilderSpace]
  }
  
  extension [Self <: VideoAdBuilderSpace](x: Self) {
    
    inline def setBumperAdBuilder(value: () => BumperAdBuilder): Self = StObject.set(x, "bumperAdBuilder", js.Any.fromFunction0(value))
    
    inline def setInStreamAdBuilder(value: () => InStreamAdBuilder): Self = StObject.set(x, "inStreamAdBuilder", js.Any.fromFunction0(value))
    
    inline def setNonSkippableAdBuilder(value: () => NonSkippableAdBuilder): Self = StObject.set(x, "nonSkippableAdBuilder", js.Any.fromFunction0(value))
    
    inline def setVideoDiscoveryAdBuilder(value: () => VideoDiscoveryAdBuilder): Self = StObject.set(x, "videoDiscoveryAdBuilder", js.Any.fromFunction0(value))
  }
}
