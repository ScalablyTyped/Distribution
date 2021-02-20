package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClicksLookbackWindow extends StObject {
  
  var clicksLookbackWindow: js.UndefOr[Double] = js.native
  
  var impressionsLookbackWindow: js.UndefOr[Double] = js.native
  
  var includeAttributedIPConversions: js.UndefOr[Boolean] = js.native
  
  var includeUnattributedCookieConversions: js.UndefOr[Boolean] = js.native
  
  var includeUnattributedIPConversions: js.UndefOr[Boolean] = js.native
  
  var maximumClickInteractions: js.UndefOr[Double] = js.native
  
  var maximumImpressionInteractions: js.UndefOr[Double] = js.native
  
  var maximumInteractionGap: js.UndefOr[Double] = js.native
  
  var pivotOnInteractionPath: js.UndefOr[Boolean] = js.native
}
object ClicksLookbackWindow {
  
  @scala.inline
  def apply(): ClicksLookbackWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClicksLookbackWindow]
  }
  
  @scala.inline
  implicit class ClicksLookbackWindowMutableBuilder[Self <: ClicksLookbackWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClicksLookbackWindow(value: Double): Self = StObject.set(x, "clicksLookbackWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClicksLookbackWindowUndefined: Self = StObject.set(x, "clicksLookbackWindow", js.undefined)
    
    @scala.inline
    def setImpressionsLookbackWindow(value: Double): Self = StObject.set(x, "impressionsLookbackWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpressionsLookbackWindowUndefined: Self = StObject.set(x, "impressionsLookbackWindow", js.undefined)
    
    @scala.inline
    def setIncludeAttributedIPConversions(value: Boolean): Self = StObject.set(x, "includeAttributedIPConversions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeAttributedIPConversionsUndefined: Self = StObject.set(x, "includeAttributedIPConversions", js.undefined)
    
    @scala.inline
    def setIncludeUnattributedCookieConversions(value: Boolean): Self = StObject.set(x, "includeUnattributedCookieConversions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUnattributedCookieConversionsUndefined: Self = StObject.set(x, "includeUnattributedCookieConversions", js.undefined)
    
    @scala.inline
    def setIncludeUnattributedIPConversions(value: Boolean): Self = StObject.set(x, "includeUnattributedIPConversions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUnattributedIPConversionsUndefined: Self = StObject.set(x, "includeUnattributedIPConversions", js.undefined)
    
    @scala.inline
    def setMaximumClickInteractions(value: Double): Self = StObject.set(x, "maximumClickInteractions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumClickInteractionsUndefined: Self = StObject.set(x, "maximumClickInteractions", js.undefined)
    
    @scala.inline
    def setMaximumImpressionInteractions(value: Double): Self = StObject.set(x, "maximumImpressionInteractions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumImpressionInteractionsUndefined: Self = StObject.set(x, "maximumImpressionInteractions", js.undefined)
    
    @scala.inline
    def setMaximumInteractionGap(value: Double): Self = StObject.set(x, "maximumInteractionGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumInteractionGapUndefined: Self = StObject.set(x, "maximumInteractionGap", js.undefined)
    
    @scala.inline
    def setPivotOnInteractionPath(value: Boolean): Self = StObject.set(x, "pivotOnInteractionPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivotOnInteractionPathUndefined: Self = StObject.set(x, "pivotOnInteractionPath", js.undefined)
  }
}
