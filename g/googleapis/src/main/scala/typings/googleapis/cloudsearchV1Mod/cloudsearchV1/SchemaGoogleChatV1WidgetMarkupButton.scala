package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChatV1WidgetMarkupButton extends StObject {
  
  /**
    * A button with image and onclick action.
    */
  var imageButton: js.UndefOr[SchemaGoogleChatV1WidgetMarkupImageButton] = js.undefined
  
  /**
    * A button with text and onclick action.
    */
  var textButton: js.UndefOr[SchemaGoogleChatV1WidgetMarkupTextButton] = js.undefined
}
object SchemaGoogleChatV1WidgetMarkupButton {
  
  inline def apply(): SchemaGoogleChatV1WidgetMarkupButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChatV1WidgetMarkupButton]
  }
  
  extension [Self <: SchemaGoogleChatV1WidgetMarkupButton](x: Self) {
    
    inline def setImageButton(value: SchemaGoogleChatV1WidgetMarkupImageButton): Self = StObject.set(x, "imageButton", value.asInstanceOf[js.Any])
    
    inline def setImageButtonUndefined: Self = StObject.set(x, "imageButton", js.undefined)
    
    inline def setTextButton(value: SchemaGoogleChatV1WidgetMarkupTextButton): Self = StObject.set(x, "textButton", value.asInstanceOf[js.Any])
    
    inline def setTextButtonUndefined: Self = StObject.set(x, "textButton", js.undefined)
  }
}
