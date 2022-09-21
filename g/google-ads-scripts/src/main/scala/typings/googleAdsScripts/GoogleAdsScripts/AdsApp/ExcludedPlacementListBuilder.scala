package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for an excluded placement list under construction.
  *
  * Typical usage:
  *
  *      var excludedPlacementListOperation =
  *          AdsApp.newExcludedPlacementListBuilder()
  *              .withName("ExcludedPlacementList")
  *              .build();
  *      var excludedPlacementList = excludedPlacementListOperation.getResult();
  */
trait ExcludedPlacementListBuilder
  extends StObject
     with Builder[ExcludedPlacementListOperation] {
  
  /** Sets the name of the new excluded placement list to the specified value. */
  def withName(name: String): this.type
}
object ExcludedPlacementListBuilder {
  
  inline def apply(build: () => ExcludedPlacementListOperation, withName: String => ExcludedPlacementListBuilder): ExcludedPlacementListBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withName = js.Any.fromFunction1(withName))
    __obj.asInstanceOf[ExcludedPlacementListBuilder]
  }
  
  extension [Self <: ExcludedPlacementListBuilder](x: Self) {
    
    inline def setWithName(value: String => ExcludedPlacementListBuilder): Self = StObject.set(x, "withName", js.Any.fromFunction1(value))
  }
}
