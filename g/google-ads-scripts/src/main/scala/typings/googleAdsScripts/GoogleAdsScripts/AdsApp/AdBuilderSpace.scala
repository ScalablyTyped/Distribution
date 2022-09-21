package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Starting point for creating an ad in an ad group. */
trait AdBuilderSpace extends StObject {
  
  /** Returns a new expanded text ad builder associated with the ad group. */
  def expandedTextAdBuilder(): ExpandedTextAdBuilder
  
  /** Returns a new image ad builder associated with the ad group. */
  def imageAdBuilder(): ImageAdBuilder
  
  /** Returns a new responsive Display ad builder associated with the ad group. */
  def responsiveDisplayAdBuilder(): ResponsiveDisplayAdBuilder
  
  /** Returns a new responsive Search ad builder associated with the ad group. */
  def responsiveSearchAdBuilder(): ResponsiveSearchAdBuilder
}
object AdBuilderSpace {
  
  inline def apply(
    expandedTextAdBuilder: () => ExpandedTextAdBuilder,
    imageAdBuilder: () => ImageAdBuilder,
    responsiveDisplayAdBuilder: () => ResponsiveDisplayAdBuilder,
    responsiveSearchAdBuilder: () => ResponsiveSearchAdBuilder
  ): AdBuilderSpace = {
    val __obj = js.Dynamic.literal(expandedTextAdBuilder = js.Any.fromFunction0(expandedTextAdBuilder), imageAdBuilder = js.Any.fromFunction0(imageAdBuilder), responsiveDisplayAdBuilder = js.Any.fromFunction0(responsiveDisplayAdBuilder), responsiveSearchAdBuilder = js.Any.fromFunction0(responsiveSearchAdBuilder))
    __obj.asInstanceOf[AdBuilderSpace]
  }
  
  extension [Self <: AdBuilderSpace](x: Self) {
    
    inline def setExpandedTextAdBuilder(value: () => ExpandedTextAdBuilder): Self = StObject.set(x, "expandedTextAdBuilder", js.Any.fromFunction0(value))
    
    inline def setImageAdBuilder(value: () => ImageAdBuilder): Self = StObject.set(x, "imageAdBuilder", js.Any.fromFunction0(value))
    
    inline def setResponsiveDisplayAdBuilder(value: () => ResponsiveDisplayAdBuilder): Self = StObject.set(x, "responsiveDisplayAdBuilder", js.Any.fromFunction0(value))
    
    inline def setResponsiveSearchAdBuilder(value: () => ResponsiveSearchAdBuilder): Self = StObject.set(x, "responsiveSearchAdBuilder", js.Any.fromFunction0(value))
  }
}
