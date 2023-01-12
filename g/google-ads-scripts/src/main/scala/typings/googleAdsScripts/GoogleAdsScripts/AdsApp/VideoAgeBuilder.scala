package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for VideoAge objects.
  *
  * Example usage:
  *
  *      var videoAgeBuilder = videoAdGroup.videoTargeting().newAgeBuilder();
  *      var videoAgeOperation = videoAgeBuilder
  *        .withAgeRange('AGE_RANGE_25_34')     // required
  *        .build();                            // create the age
  */
trait VideoAgeBuilder
  extends StObject
     with Builder[VideoAgeOperation] {
  
  /** Builds the excluded video age. */
  def exclude(): ExcludedVideoAgeOperation
  
  /** Sets the age range. */
  def withAgeRange(ageRange: String): this.type
}
object VideoAgeBuilder {
  
  inline def apply(
    build: () => VideoAgeOperation,
    exclude: () => ExcludedVideoAgeOperation,
    withAgeRange: String => VideoAgeBuilder
  ): VideoAgeBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), exclude = js.Any.fromFunction0(exclude), withAgeRange = js.Any.fromFunction1(withAgeRange))
    __obj.asInstanceOf[VideoAgeBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoAgeBuilder] (val x: Self) extends AnyVal {
    
    inline def setExclude(value: () => ExcludedVideoAgeOperation): Self = StObject.set(x, "exclude", js.Any.fromFunction0(value))
    
    inline def setWithAgeRange(value: String => VideoAgeBuilder): Self = StObject.set(x, "withAgeRange", js.Any.fromFunction1(value))
  }
}
