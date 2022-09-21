package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaKeyValue extends StObject {
  
  /**
    * Formatted text supported.
    */
  var bottomLabel: js.UndefOr[String | Null] = js.undefined
  
  var button: js.UndefOr[SchemaButton] = js.undefined
  
  /**
    * Formatted text supported and always required.
    */
  var content: js.UndefOr[String | Null] = js.undefined
  
  var contentMultiline: js.UndefOr[Boolean | Null] = js.undefined
  
  var endIcon: js.UndefOr[SchemaIconImage] = js.undefined
  
  var icon: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The alternative text of this icon_url which will be used for accessibility.
    */
  var iconAltText: js.UndefOr[String | Null] = js.undefined
  
  var iconUrl: js.UndefOr[String | Null] = js.undefined
  
  var imageStyle: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Only the top/bottom label + content region is clickable.
    */
  var onClick: js.UndefOr[SchemaOnClick] = js.undefined
  
  /**
    * The optional icon to display before the text content.
    */
  var startIcon: js.UndefOr[SchemaIconImage] = js.undefined
  
  var switchWidget: js.UndefOr[SchemaSwitchWidget] = js.undefined
  
  /**
    * Formatted text supported.
    */
  var topLabel: js.UndefOr[String | Null] = js.undefined
}
object SchemaKeyValue {
  
  inline def apply(): SchemaKeyValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKeyValue]
  }
  
  extension [Self <: SchemaKeyValue](x: Self) {
    
    inline def setBottomLabel(value: String): Self = StObject.set(x, "bottomLabel", value.asInstanceOf[js.Any])
    
    inline def setBottomLabelNull: Self = StObject.set(x, "bottomLabel", null)
    
    inline def setBottomLabelUndefined: Self = StObject.set(x, "bottomLabel", js.undefined)
    
    inline def setButton(value: SchemaButton): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentMultiline(value: Boolean): Self = StObject.set(x, "contentMultiline", value.asInstanceOf[js.Any])
    
    inline def setContentMultilineNull: Self = StObject.set(x, "contentMultiline", null)
    
    inline def setContentMultilineUndefined: Self = StObject.set(x, "contentMultiline", js.undefined)
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setEndIcon(value: SchemaIconImage): Self = StObject.set(x, "endIcon", value.asInstanceOf[js.Any])
    
    inline def setEndIconUndefined: Self = StObject.set(x, "endIcon", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconAltText(value: String): Self = StObject.set(x, "iconAltText", value.asInstanceOf[js.Any])
    
    inline def setIconAltTextNull: Self = StObject.set(x, "iconAltText", null)
    
    inline def setIconAltTextUndefined: Self = StObject.set(x, "iconAltText", js.undefined)
    
    inline def setIconNull: Self = StObject.set(x, "icon", null)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    inline def setIconUrlNull: Self = StObject.set(x, "iconUrl", null)
    
    inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    
    inline def setImageStyle(value: String): Self = StObject.set(x, "imageStyle", value.asInstanceOf[js.Any])
    
    inline def setImageStyleNull: Self = StObject.set(x, "imageStyle", null)
    
    inline def setImageStyleUndefined: Self = StObject.set(x, "imageStyle", js.undefined)
    
    inline def setOnClick(value: SchemaOnClick): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setStartIcon(value: SchemaIconImage): Self = StObject.set(x, "startIcon", value.asInstanceOf[js.Any])
    
    inline def setStartIconUndefined: Self = StObject.set(x, "startIcon", js.undefined)
    
    inline def setSwitchWidget(value: SchemaSwitchWidget): Self = StObject.set(x, "switchWidget", value.asInstanceOf[js.Any])
    
    inline def setSwitchWidgetUndefined: Self = StObject.set(x, "switchWidget", js.undefined)
    
    inline def setTopLabel(value: String): Self = StObject.set(x, "topLabel", value.asInstanceOf[js.Any])
    
    inline def setTopLabelNull: Self = StObject.set(x, "topLabel", null)
    
    inline def setTopLabelUndefined: Self = StObject.set(x, "topLabel", js.undefined)
  }
}
