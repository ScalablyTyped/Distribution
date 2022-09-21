package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsCardV1Button extends StObject {
  
  /**
    * The alternative text used for accessibility. Has no effect when an icon is set; use `icon.alt_text` instead.
    */
  var altText: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If set, the button is filled with a solid background.
    */
  var color: js.UndefOr[SchemaColor] = js.undefined
  
  /**
    * If `true`, the button is displayed in a disabled state and doesn't respond to user actions.
    */
  var disabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The icon image.
    */
  var icon: js.UndefOr[SchemaGoogleAppsCardV1Icon] = js.undefined
  
  /**
    * The action to perform when the button is clicked.
    */
  var onClick: js.UndefOr[SchemaGoogleAppsCardV1OnClick] = js.undefined
  
  /**
    * The text of the button.
    */
  var text: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsCardV1Button {
  
  inline def apply(): SchemaGoogleAppsCardV1Button = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsCardV1Button]
  }
  
  extension [Self <: SchemaGoogleAppsCardV1Button](x: Self) {
    
    inline def setAltText(value: String): Self = StObject.set(x, "altText", value.asInstanceOf[js.Any])
    
    inline def setAltTextNull: Self = StObject.set(x, "altText", null)
    
    inline def setAltTextUndefined: Self = StObject.set(x, "altText", js.undefined)
    
    inline def setColor(value: SchemaColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledNull: Self = StObject.set(x, "disabled", null)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setIcon(value: SchemaGoogleAppsCardV1Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setOnClick(value: SchemaGoogleAppsCardV1OnClick): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
