package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClicksLookbackWindow extends StObject {
  
  var clicksLookbackWindow: js.UndefOr[Double] = js.undefined
  
  var impressionsLookbackWindow: js.UndefOr[Double] = js.undefined
  
  var includeAttributedIPConversions: js.UndefOr[Boolean] = js.undefined
  
  var includeUnattributedCookieConversions: js.UndefOr[Boolean] = js.undefined
  
  var includeUnattributedIPConversions: js.UndefOr[Boolean] = js.undefined
  
  var maximumClickInteractions: js.UndefOr[Double] = js.undefined
  
  var maximumImpressionInteractions: js.UndefOr[Double] = js.undefined
  
  var maximumInteractionGap: js.UndefOr[Double] = js.undefined
  
  var pivotOnInteractionPath: js.UndefOr[Boolean] = js.undefined
}
object ClicksLookbackWindow {
  
  inline def apply(): ClicksLookbackWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClicksLookbackWindow]
  }
  
  extension [Self <: ClicksLookbackWindow](x: Self) {
    
    inline def setClicksLookbackWindow(value: Double): Self = StObject.set(x, "clicksLookbackWindow", value.asInstanceOf[js.Any])
    
    inline def setClicksLookbackWindowUndefined: Self = StObject.set(x, "clicksLookbackWindow", js.undefined)
    
    inline def setImpressionsLookbackWindow(value: Double): Self = StObject.set(x, "impressionsLookbackWindow", value.asInstanceOf[js.Any])
    
    inline def setImpressionsLookbackWindowUndefined: Self = StObject.set(x, "impressionsLookbackWindow", js.undefined)
    
    inline def setIncludeAttributedIPConversions(value: Boolean): Self = StObject.set(x, "includeAttributedIPConversions", value.asInstanceOf[js.Any])
    
    inline def setIncludeAttributedIPConversionsUndefined: Self = StObject.set(x, "includeAttributedIPConversions", js.undefined)
    
    inline def setIncludeUnattributedCookieConversions(value: Boolean): Self = StObject.set(x, "includeUnattributedCookieConversions", value.asInstanceOf[js.Any])
    
    inline def setIncludeUnattributedCookieConversionsUndefined: Self = StObject.set(x, "includeUnattributedCookieConversions", js.undefined)
    
    inline def setIncludeUnattributedIPConversions(value: Boolean): Self = StObject.set(x, "includeUnattributedIPConversions", value.asInstanceOf[js.Any])
    
    inline def setIncludeUnattributedIPConversionsUndefined: Self = StObject.set(x, "includeUnattributedIPConversions", js.undefined)
    
    inline def setMaximumClickInteractions(value: Double): Self = StObject.set(x, "maximumClickInteractions", value.asInstanceOf[js.Any])
    
    inline def setMaximumClickInteractionsUndefined: Self = StObject.set(x, "maximumClickInteractions", js.undefined)
    
    inline def setMaximumImpressionInteractions(value: Double): Self = StObject.set(x, "maximumImpressionInteractions", value.asInstanceOf[js.Any])
    
    inline def setMaximumImpressionInteractionsUndefined: Self = StObject.set(x, "maximumImpressionInteractions", js.undefined)
    
    inline def setMaximumInteractionGap(value: Double): Self = StObject.set(x, "maximumInteractionGap", value.asInstanceOf[js.Any])
    
    inline def setMaximumInteractionGapUndefined: Self = StObject.set(x, "maximumInteractionGap", js.undefined)
    
    inline def setPivotOnInteractionPath(value: Boolean): Self = StObject.set(x, "pivotOnInteractionPath", value.asInstanceOf[js.Any])
    
    inline def setPivotOnInteractionPathUndefined: Self = StObject.set(x, "pivotOnInteractionPath", js.undefined)
  }
}
