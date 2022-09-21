package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChatV1WidgetMarkupImageButton extends StObject {
  
  /**
    * The icon specified by an enum that indices to an icon provided by Chat API.
    */
  var icon: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The icon specified by a URL.
    */
  var iconUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of this image_button which will be used for accessibility. Default value will be provided if developers don't specify.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The onclick action.
    */
  var onClick: js.UndefOr[SchemaGoogleChatV1WidgetMarkupOnClick] = js.undefined
}
object SchemaGoogleChatV1WidgetMarkupImageButton {
  
  inline def apply(): SchemaGoogleChatV1WidgetMarkupImageButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChatV1WidgetMarkupImageButton]
  }
  
  extension [Self <: SchemaGoogleChatV1WidgetMarkupImageButton](x: Self) {
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconNull: Self = StObject.set(x, "icon", null)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    inline def setIconUrlNull: Self = StObject.set(x, "iconUrl", null)
    
    inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnClick(value: SchemaGoogleChatV1WidgetMarkupOnClick): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
