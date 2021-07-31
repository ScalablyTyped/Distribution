package typings.devextreme.anon

import typings.devextreme.devextremeStrings.breakWord
import typings.devextreme.devextremeStrings.columns
import typings.devextreme.devextremeStrings.ellipsis
import typings.devextreme.devextremeStrings.hide
import typings.devextreme.devextremeStrings.inside
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.normal
import typings.devextreme.devextremeStrings.outside
import typings.devextreme.mod.DevExpress.ui.format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgumentFormat extends StObject {
  
  var argumentFormat: js.UndefOr[format] = js.undefined
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var border: js.UndefOr[ColorDashStyle] = js.undefined
  
  var connector: js.UndefOr[ColorVisible] = js.undefined
  
  var customizeText: js.UndefOr[js.Function1[/* pointInfo */ js.Any, String]] = js.undefined
  
  var font: js.UndefOr[typings.devextreme.mod.DevExpress.viz.Font] = js.undefined
  
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.undefined
  
  var position: js.UndefOr[columns | inside | outside] = js.undefined
  
  var radialOffset: js.UndefOr[Double] = js.undefined
  
  var rotationAngle: js.UndefOr[Double] = js.undefined
  
  var textOverflow: js.UndefOr[ellipsis | hide | none] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var wordWrap: js.UndefOr[normal | breakWord | none] = js.undefined
}
object ArgumentFormat {
  
  @scala.inline
  def apply(): ArgumentFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArgumentFormat]
  }
  
  @scala.inline
  implicit class ArgumentFormatMutableBuilder[Self <: ArgumentFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgumentFormat(value: format): Self = StObject.set(x, "argumentFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentFormatFunction1(value: /* value */ Double | typings.std.Date => String): Self = StObject.set(x, "argumentFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setArgumentFormatUndefined: Self = StObject.set(x, "argumentFormat", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBorder(value: ColorDashStyle): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setConnector(value: ColorVisible): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorUndefined: Self = StObject.set(x, "connector", js.undefined)
    
    @scala.inline
    def setCustomizeText(value: /* pointInfo */ js.Any => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
    
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
    def setPosition(value: columns | inside | outside): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setRadialOffset(value: Double): Self = StObject.set(x, "radialOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadialOffsetUndefined: Self = StObject.set(x, "radialOffset", js.undefined)
    
    @scala.inline
    def setRotationAngle(value: Double): Self = StObject.set(x, "rotationAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationAngleUndefined: Self = StObject.set(x, "rotationAngle", js.undefined)
    
    @scala.inline
    def setTextOverflow(value: ellipsis | hide | none): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setWordWrap(value: normal | breakWord | none): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
  }
}
