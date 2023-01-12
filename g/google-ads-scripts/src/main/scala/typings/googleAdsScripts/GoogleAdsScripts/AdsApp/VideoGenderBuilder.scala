package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for VideoGender objects.
  *
  * Example usage:
  *
  *      var videoGenderBuilder = videoAdGroup.videoTargeting().newGenderBuilder();
  *      var videoGenderOperation = videoGenderBuilder
  *        .withGenderType('GENDER_FEMALE')     // required
  *        .build();                            // create the gender
  */
trait VideoGenderBuilder
  extends StObject
     with Builder[VideoGenderOperation] {
  
  /** Builds the excluded video gender. */
  def exclude(): ExcludedVideoGenderOperation
  
  /** Sets the gender type. */
  def withGenderType(genderType: String): this.type
}
object VideoGenderBuilder {
  
  inline def apply(
    build: () => VideoGenderOperation,
    exclude: () => ExcludedVideoGenderOperation,
    withGenderType: String => VideoGenderBuilder
  ): VideoGenderBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), exclude = js.Any.fromFunction0(exclude), withGenderType = js.Any.fromFunction1(withGenderType))
    __obj.asInstanceOf[VideoGenderBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoGenderBuilder] (val x: Self) extends AnyVal {
    
    inline def setExclude(value: () => ExcludedVideoGenderOperation): Self = StObject.set(x, "exclude", js.Any.fromFunction0(value))
    
    inline def setWithGenderType(value: String => VideoGenderBuilder): Self = StObject.set(x, "withGenderType", js.Any.fromFunction1(value))
  }
}
