package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for VideoParentalStatus objects.
  *
  * Example usage:
  *
  *  var videoParentalStatusBuilder = videoAdGroup.videoTargeting().newParentalStatusBuilder();
  *  var videoParentalStatusOperation = videoParentalStatusBuilder
  *    .withParentType('PARENT_PARENT')     // required
  *    .build();                            // create the parental status
  */
trait VideoParentalStatusBuilder
  extends StObject
     with Builder[VideoParentalStatusOperation] {
  
  /** Builds the excluded video parental status. */
  def exclude(): ExcludedVideoParentalStatusOperation
  
  /** Sets the parental status type. */
  def withParentType(parentalStatus: String): this.type
}
object VideoParentalStatusBuilder {
  
  inline def apply(
    build: () => VideoParentalStatusOperation,
    exclude: () => ExcludedVideoParentalStatusOperation,
    withParentType: String => VideoParentalStatusBuilder
  ): VideoParentalStatusBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), exclude = js.Any.fromFunction0(exclude), withParentType = js.Any.fromFunction1(withParentType))
    __obj.asInstanceOf[VideoParentalStatusBuilder]
  }
  
  extension [Self <: VideoParentalStatusBuilder](x: Self) {
    
    inline def setExclude(value: () => ExcludedVideoParentalStatusOperation): Self = StObject.set(x, "exclude", js.Any.fromFunction0(value))
    
    inline def setWithParentType(value: String => VideoParentalStatusBuilder): Self = StObject.set(x, "withParentType", js.Any.fromFunction1(value))
  }
}
