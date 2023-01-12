package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for DisplayKeyword objects.
  *
  * Example usage:
  *
  *  var displayKeywordBuilder = adGroup.display().newKeywordBuilder();
  *  var displayKeyword = displayKeywordBuilder
  *    .withText("keyword text")     // required
  *    .withCpc(0.50)                // optional
  *    .build()                      // create the display keyword
  */
trait DisplayKeywordBuilder
  extends StObject
     with Builder[DisplayKeywordOperation] {
  
  /** Builds the excluded display keyword. */
  def exclude(): ExcludedDisplayKeywordOperation
  
  /** Sets the max CPC bid of the new display keyword to the specified value. */
  def withCpc(cpc: Double): this.type
  
  /** Sets the CPM bid of the new display keyword to the specified value. */
  def withCpm(cpm: Double): this.type
  
  /** Sets the text of the display keyword. */
  def withText(text: String): this.type
}
object DisplayKeywordBuilder {
  
  inline def apply(
    build: () => DisplayKeywordOperation,
    exclude: () => ExcludedDisplayKeywordOperation,
    withCpc: Double => DisplayKeywordBuilder,
    withCpm: Double => DisplayKeywordBuilder,
    withText: String => DisplayKeywordBuilder
  ): DisplayKeywordBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), exclude = js.Any.fromFunction0(exclude), withCpc = js.Any.fromFunction1(withCpc), withCpm = js.Any.fromFunction1(withCpm), withText = js.Any.fromFunction1(withText))
    __obj.asInstanceOf[DisplayKeywordBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisplayKeywordBuilder] (val x: Self) extends AnyVal {
    
    inline def setExclude(value: () => ExcludedDisplayKeywordOperation): Self = StObject.set(x, "exclude", js.Any.fromFunction0(value))
    
    inline def setWithCpc(value: Double => DisplayKeywordBuilder): Self = StObject.set(x, "withCpc", js.Any.fromFunction1(value))
    
    inline def setWithCpm(value: Double => DisplayKeywordBuilder): Self = StObject.set(x, "withCpm", js.Any.fromFunction1(value))
    
    inline def setWithText(value: String => DisplayKeywordBuilder): Self = StObject.set(x, "withText", js.Any.fromFunction1(value))
  }
}
