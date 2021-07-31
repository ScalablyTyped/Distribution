package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectorColor extends StObject {
  
  var connectorColor: js.UndefOr[String] = js.undefined
  
  var connectorWidth: js.UndefOr[Double] = js.undefined
  
  var customizeText: js.UndefOr[js.Function1[/* barValue */ ValueText, String]] = js.undefined
  
  var font: js.UndefOr[typings.devextreme.mod.DevExpress.viz.Font] = js.undefined
  
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.undefined
  
  var indent: js.UndefOr[Double] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object ConnectorColor {
  
  @scala.inline
  def apply(): ConnectorColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorColor]
  }
  
  @scala.inline
  implicit class ConnectorColorMutableBuilder[Self <: ConnectorColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectorColor(value: String): Self = StObject.set(x, "connectorColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorColorUndefined: Self = StObject.set(x, "connectorColor", js.undefined)
    
    @scala.inline
    def setConnectorWidth(value: Double): Self = StObject.set(x, "connectorWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorWidthUndefined: Self = StObject.set(x, "connectorWidth", js.undefined)
    
    @scala.inline
    def setCustomizeText(value: /* barValue */ ValueText => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
    
    @scala.inline
    def setFont(value: typings.devextreme.mod.DevExpress.viz.Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setFormat(value: format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatFunction1(value: /* value */ Double | typings.std.Date => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
