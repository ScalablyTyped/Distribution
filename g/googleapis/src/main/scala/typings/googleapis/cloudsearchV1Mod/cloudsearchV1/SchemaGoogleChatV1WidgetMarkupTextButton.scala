package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChatV1WidgetMarkupTextButton extends StObject {
  
  /**
    * The onclick action of the button.
    */
  var onClick: js.UndefOr[SchemaGoogleChatV1WidgetMarkupOnClick] = js.undefined
  
  /**
    * The text of the button.
    */
  var text: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChatV1WidgetMarkupTextButton {
  
  inline def apply(): SchemaGoogleChatV1WidgetMarkupTextButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChatV1WidgetMarkupTextButton]
  }
  
  extension [Self <: SchemaGoogleChatV1WidgetMarkupTextButton](x: Self) {
    
    inline def setOnClick(value: SchemaGoogleChatV1WidgetMarkupOnClick): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
