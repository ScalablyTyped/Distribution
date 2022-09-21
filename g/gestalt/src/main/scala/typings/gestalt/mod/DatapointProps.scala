package typings.gestalt.mod

import typings.gestalt.anon.AccesibilityLabel
import typings.gestalt.gestaltStrings.auto
import typings.gestalt.gestaltStrings.bad
import typings.gestalt.gestaltStrings.good
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.neutral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatapointProps extends StObject {
  
  var badge: js.UndefOr[BadgeObject] = js.undefined
  
  var size: js.UndefOr[md | lg] = js.undefined
  
  var title: String
  
  var tooltipText: js.UndefOr[String] = js.undefined
  
  var tooltipZIndex: js.UndefOr[Indexable] = js.undefined
  
  var trend: js.UndefOr[AccesibilityLabel] = js.undefined
  
  var trendSentiment: js.UndefOr[good | bad | neutral | auto] = js.undefined
  
  var value: String
}
object DatapointProps {
  
  inline def apply(title: String, value: String): DatapointProps = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatapointProps]
  }
  
  extension [Self <: DatapointProps](x: Self) {
    
    inline def setBadge(value: BadgeObject): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    inline def setSize(value: md | lg): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTooltipText(value: String): Self = StObject.set(x, "tooltipText", value.asInstanceOf[js.Any])
    
    inline def setTooltipTextUndefined: Self = StObject.set(x, "tooltipText", js.undefined)
    
    inline def setTooltipZIndex(value: Indexable): Self = StObject.set(x, "tooltipZIndex", value.asInstanceOf[js.Any])
    
    inline def setTooltipZIndexUndefined: Self = StObject.set(x, "tooltipZIndex", js.undefined)
    
    inline def setTrend(value: AccesibilityLabel): Self = StObject.set(x, "trend", value.asInstanceOf[js.Any])
    
    inline def setTrendSentiment(value: good | bad | neutral | auto): Self = StObject.set(x, "trendSentiment", value.asInstanceOf[js.Any])
    
    inline def setTrendSentimentUndefined: Self = StObject.set(x, "trendSentiment", js.undefined)
    
    inline def setTrendUndefined: Self = StObject.set(x, "trend", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
