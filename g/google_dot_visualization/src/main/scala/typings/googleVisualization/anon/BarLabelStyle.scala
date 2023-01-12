package typings.googleVisualization.anon

import typings.googleVisualization.google.visualization.LabelStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarLabelStyle extends StObject {
  
  var barLabelStyle: js.UndefOr[LabelStyle] = js.undefined
  
  var colorByRowLabel: js.UndefOr[Boolean] = js.undefined
  
  var groupByRowLabel: js.UndefOr[Boolean] = js.undefined
  
  var rowLabelStyle: js.UndefOr[LabelStyle | Null] = js.undefined
  
  var showBarLabels: js.UndefOr[Boolean] = js.undefined
  
  var showRowLabels: js.UndefOr[Boolean] = js.undefined
  
  var singleColor: js.UndefOr[String | Null] = js.undefined
}
object BarLabelStyle {
  
  inline def apply(): BarLabelStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarLabelStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BarLabelStyle] (val x: Self) extends AnyVal {
    
    inline def setBarLabelStyle(value: LabelStyle): Self = StObject.set(x, "barLabelStyle", value.asInstanceOf[js.Any])
    
    inline def setBarLabelStyleUndefined: Self = StObject.set(x, "barLabelStyle", js.undefined)
    
    inline def setColorByRowLabel(value: Boolean): Self = StObject.set(x, "colorByRowLabel", value.asInstanceOf[js.Any])
    
    inline def setColorByRowLabelUndefined: Self = StObject.set(x, "colorByRowLabel", js.undefined)
    
    inline def setGroupByRowLabel(value: Boolean): Self = StObject.set(x, "groupByRowLabel", value.asInstanceOf[js.Any])
    
    inline def setGroupByRowLabelUndefined: Self = StObject.set(x, "groupByRowLabel", js.undefined)
    
    inline def setRowLabelStyle(value: LabelStyle): Self = StObject.set(x, "rowLabelStyle", value.asInstanceOf[js.Any])
    
    inline def setRowLabelStyleNull: Self = StObject.set(x, "rowLabelStyle", null)
    
    inline def setRowLabelStyleUndefined: Self = StObject.set(x, "rowLabelStyle", js.undefined)
    
    inline def setShowBarLabels(value: Boolean): Self = StObject.set(x, "showBarLabels", value.asInstanceOf[js.Any])
    
    inline def setShowBarLabelsUndefined: Self = StObject.set(x, "showBarLabels", js.undefined)
    
    inline def setShowRowLabels(value: Boolean): Self = StObject.set(x, "showRowLabels", value.asInstanceOf[js.Any])
    
    inline def setShowRowLabelsUndefined: Self = StObject.set(x, "showRowLabels", js.undefined)
    
    inline def setSingleColor(value: String): Self = StObject.set(x, "singleColor", value.asInstanceOf[js.Any])
    
    inline def setSingleColorNull: Self = StObject.set(x, "singleColor", null)
    
    inline def setSingleColorUndefined: Self = StObject.set(x, "singleColor", js.undefined)
  }
}
