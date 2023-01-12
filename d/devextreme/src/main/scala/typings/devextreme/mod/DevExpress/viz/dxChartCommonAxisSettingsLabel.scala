package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.common.HorizontalAlignment
import typings.devextreme.mod.DevExpress.common.Position
import typings.devextreme.mod.DevExpress.common.charts.ChartsAxisLabelOverlap
import typings.devextreme.mod.DevExpress.common.charts.RelativePosition
import typings.devextreme.mod.DevExpress.common.charts.TextOverflow
import typings.devextreme.mod.DevExpress.common.charts.WordWrap
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.viz.dxChart.ChartLabelDisplayMode
import typings.std.SVGElement
import typings.std.SVGGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartCommonAxisSettingsLabel extends StObject {
  
  /**
    * Aligns axis labels in relation to ticks.
    */
  var alignment: js.UndefOr[HorizontalAlignment] = js.undefined
  
  /**
    * Allows you to rotate or stagger axis labels. Applies to the horizontal axis only.
    */
  var displayMode: js.UndefOr[ChartLabelDisplayMode] = js.undefined
  
  /**
    * Specifies font properties for axis labels.
    */
  var font: js.UndefOr[Font] = js.undefined
  
  /**
    * Adds a pixel-measured empty space between an axis and its labels.
    */
  var indentFromAxis: js.UndefOr[Double] = js.undefined
  
  /**
    * Decides how to arrange axis labels when there is not enough space to keep all of them.
    */
  var overlappingBehavior: js.UndefOr[ChartsAxisLabelOverlap] = js.undefined
  
  /**
    * Specifies the position of labels relative to the chart or its axis.
    */
  var position: js.UndefOr[RelativePosition | Position] = js.undefined
  
  /**
    * Specifies the rotation angle of axis labels. Applies only if displayMode or overlappingBehavior is &apos;rotate&apos;.
    */
  var rotationAngle: js.UndefOr[Double] = js.undefined
  
  /**
    * Adds a pixel-measured empty space between two staggered rows of axis labels. Applies only if displayMode or overlappingBehavior is &apos;stagger&apos;.
    */
  var staggeringSpacing: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a custom template for axis labels.
    */
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* data */ js.Object, 
      /* element */ SVGGElement, 
      String | UserDefinedElement[SVGElement]
    ])
  ] = js.undefined
  
  /**
    * Specifies what to do with axis labels that overflow the allocated space after applying wordWrap: hide, truncate them and display an ellipsis, or do nothing.
    */
  var textOverflow: js.UndefOr[TextOverflow] = js.undefined
  
  /**
    * Shows/hides axis labels.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies how to wrap texts that do not fit into a single line.
    */
  var wordWrap: js.UndefOr[WordWrap] = js.undefined
}
object dxChartCommonAxisSettingsLabel {
  
  inline def apply(): dxChartCommonAxisSettingsLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartCommonAxisSettingsLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxChartCommonAxisSettingsLabel] (val x: Self) extends AnyVal {
    
    inline def setAlignment(value: HorizontalAlignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setDisplayMode(value: ChartLabelDisplayMode): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
    
    inline def setDisplayModeUndefined: Self = StObject.set(x, "displayMode", js.undefined)
    
    inline def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setIndentFromAxis(value: Double): Self = StObject.set(x, "indentFromAxis", value.asInstanceOf[js.Any])
    
    inline def setIndentFromAxisUndefined: Self = StObject.set(x, "indentFromAxis", js.undefined)
    
    inline def setOverlappingBehavior(value: ChartsAxisLabelOverlap): Self = StObject.set(x, "overlappingBehavior", value.asInstanceOf[js.Any])
    
    inline def setOverlappingBehaviorUndefined: Self = StObject.set(x, "overlappingBehavior", js.undefined)
    
    inline def setPosition(value: RelativePosition | Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRotationAngle(value: Double): Self = StObject.set(x, "rotationAngle", value.asInstanceOf[js.Any])
    
    inline def setRotationAngleUndefined: Self = StObject.set(x, "rotationAngle", js.undefined)
    
    inline def setStaggeringSpacing(value: Double): Self = StObject.set(x, "staggeringSpacing", value.asInstanceOf[js.Any])
    
    inline def setStaggeringSpacingUndefined: Self = StObject.set(x, "staggeringSpacing", js.undefined)
    
    inline def setTemplate(
      value: template | (js.Function2[
          /* data */ js.Object, 
          /* element */ SVGGElement, 
          String | UserDefinedElement[SVGElement]
        ])
    ): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateFunction2(
      value: (/* data */ js.Object, /* element */ SVGGElement) => String | UserDefinedElement[SVGElement]
    ): Self = StObject.set(x, "template", js.Any.fromFunction2(value))
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTextOverflow(value: TextOverflow): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
    
    inline def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWordWrap(value: WordWrap): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
    
    inline def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
  }
}
