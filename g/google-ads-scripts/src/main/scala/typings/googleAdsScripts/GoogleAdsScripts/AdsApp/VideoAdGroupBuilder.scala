package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for a video ad group under construction.
  *
  * Typical usage:
  *
  *  var videoAdGroupBuilder = videoCampaign.newVideoAdGroupBuilder();
  *  var videoAdGroupOperation = videoAdGroupBuilder
  *     .withName("ad group name")
  *     .withStatus("PAUSED")
  *     .withAdGroupType('TRUE_VIEW_IN_STREAM')
  *     .build();
  *  var videoAdGroup = videoAdGroupOperation.getResult()
  */
trait VideoAdGroupBuilder
  extends StObject
     with Builder[VideoAdGroupOperation] {
  
  /** Sets the video ad group type, either TRUE_VIEW_IN_STREAM, TRUE_VIEW_IN_DISPLAY, NON_SKIPPABLE_IN_STREAM or BUMPER. */
  def withAdGroupType(adGroupType: String): this.type
  
  /** Sets the Target CPA bid of the new video ad group to the specified value. */
  def withCpa(cpa: Double): this.type
  
  /** Sets the CPM bid of the new video ad group to the specified value. */
  def withCpm(cpm: Double): this.type
  
  /** Sets the max CPV bid of the new video ad group to the specified value. */
  def withCpv(cpv: Double): this.type
  
  /** Sets the name of the new ad group to the specified value. */
  def withName(name: String): this.type
  
  /** Sets the status of the new ad group to the specified value. */
  def withStatus(status: String): this.type
  
  /** Sets the Target CPM bid of the new video ad group to the specified value. */
  def withTargetCpm(targetCpm: Double): this.type
}
object VideoAdGroupBuilder {
  
  inline def apply(
    build: () => VideoAdGroupOperation,
    withAdGroupType: String => VideoAdGroupBuilder,
    withCpa: Double => VideoAdGroupBuilder,
    withCpm: Double => VideoAdGroupBuilder,
    withCpv: Double => VideoAdGroupBuilder,
    withName: String => VideoAdGroupBuilder,
    withStatus: String => VideoAdGroupBuilder,
    withTargetCpm: Double => VideoAdGroupBuilder
  ): VideoAdGroupBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withAdGroupType = js.Any.fromFunction1(withAdGroupType), withCpa = js.Any.fromFunction1(withCpa), withCpm = js.Any.fromFunction1(withCpm), withCpv = js.Any.fromFunction1(withCpv), withName = js.Any.fromFunction1(withName), withStatus = js.Any.fromFunction1(withStatus), withTargetCpm = js.Any.fromFunction1(withTargetCpm))
    __obj.asInstanceOf[VideoAdGroupBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoAdGroupBuilder] (val x: Self) extends AnyVal {
    
    inline def setWithAdGroupType(value: String => VideoAdGroupBuilder): Self = StObject.set(x, "withAdGroupType", js.Any.fromFunction1(value))
    
    inline def setWithCpa(value: Double => VideoAdGroupBuilder): Self = StObject.set(x, "withCpa", js.Any.fromFunction1(value))
    
    inline def setWithCpm(value: Double => VideoAdGroupBuilder): Self = StObject.set(x, "withCpm", js.Any.fromFunction1(value))
    
    inline def setWithCpv(value: Double => VideoAdGroupBuilder): Self = StObject.set(x, "withCpv", js.Any.fromFunction1(value))
    
    inline def setWithName(value: String => VideoAdGroupBuilder): Self = StObject.set(x, "withName", js.Any.fromFunction1(value))
    
    inline def setWithStatus(value: String => VideoAdGroupBuilder): Self = StObject.set(x, "withStatus", js.Any.fromFunction1(value))
    
    inline def setWithTargetCpm(value: Double => VideoAdGroupBuilder): Self = StObject.set(x, "withTargetCpm", js.Any.fromFunction1(value))
  }
}
