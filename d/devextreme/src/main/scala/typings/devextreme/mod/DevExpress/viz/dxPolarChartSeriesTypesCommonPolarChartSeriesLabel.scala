package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.ColorDashStyle
import typings.devextreme.anon.ColorVisible
import typings.devextreme.mod.DevExpress.common.charts.RelativePosition
import typings.devextreme.mod.DevExpress.ui.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPolarChartSeriesTypesCommonPolarChartSeriesLabel extends StObject {
  
  /**
    * Formats the point argument before it is displayed in the point label. To format the point value, use the format property.
    */
  var argumentFormat: js.UndefOr[Format] = js.undefined
  
  /**
    * Colors the point labels&apos; background. The default color is inherited from the points.
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies border properties for point labels.
    */
  var border: js.UndefOr[ColorDashStyle] = js.undefined
  
  /**
    * Specifies connector properties for series point labels.
    */
  var connector: js.UndefOr[ColorVisible] = js.undefined
  
  /**
    * Specifies a callback function that returns the text to be displayed by point labels.
    */
  var customizeText: js.UndefOr[js.Function1[/* pointInfo */ Any, String]] = js.undefined
  
  /**
    * 
    */
  var displayFormat: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies font properties for the text displayed in point labels.
    */
  var font: js.UndefOr[Font] = js.undefined
  
  /**
    * Formats a value before it is displayed in a point label.
    */
  var format: js.UndefOr[Format] = js.undefined
  
  /**
    * Specifies a label position in bar-like series.
    */
  var position: js.UndefOr[RelativePosition] = js.undefined
  
  /**
    * Specifies the angle used to rotate point labels from their initial position.
    */
  var rotationAngle: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether or not to show a label when the point has a zero value.
    */
  var showForZeroValues: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the visibility of point labels.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object dxPolarChartSeriesTypesCommonPolarChartSeriesLabel {
  
  inline def apply(): dxPolarChartSeriesTypesCommonPolarChartSeriesLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartSeriesTypesCommonPolarChartSeriesLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxPolarChartSeriesTypesCommonPolarChartSeriesLabel] (val x: Self) extends AnyVal {
    
    inline def setArgumentFormat(value: Format): Self = StObject.set(x, "argumentFormat", value.asInstanceOf[js.Any])
    
    inline def setArgumentFormatFunction1(value: js.Date | Double => String): Self = StObject.set(x, "argumentFormat", js.Any.fromFunction1(value))
    
    inline def setArgumentFormatUndefined: Self = StObject.set(x, "argumentFormat", js.undefined)
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBorder(value: ColorDashStyle): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setConnector(value: ColorVisible): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
    
    inline def setConnectorUndefined: Self = StObject.set(x, "connector", js.undefined)
    
    inline def setCustomizeText(value: /* pointInfo */ Any => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
    
    inline def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
    
    inline def setDisplayFormat(value: String): Self = StObject.set(x, "displayFormat", value.asInstanceOf[js.Any])
    
    inline def setDisplayFormatUndefined: Self = StObject.set(x, "displayFormat", js.undefined)
    
    inline def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setFormat(value: Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatFunction1(value: js.Date | Double => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setPosition(value: RelativePosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRotationAngle(value: Double): Self = StObject.set(x, "rotationAngle", value.asInstanceOf[js.Any])
    
    inline def setRotationAngleUndefined: Self = StObject.set(x, "rotationAngle", js.undefined)
    
    inline def setShowForZeroValues(value: Boolean): Self = StObject.set(x, "showForZeroValues", value.asInstanceOf[js.Any])
    
    inline def setShowForZeroValuesUndefined: Self = StObject.set(x, "showForZeroValues", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
