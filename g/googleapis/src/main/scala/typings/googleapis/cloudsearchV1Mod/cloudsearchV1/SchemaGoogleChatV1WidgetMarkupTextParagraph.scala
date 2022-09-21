package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChatV1WidgetMarkupTextParagraph extends StObject {
  
  var text: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChatV1WidgetMarkupTextParagraph {
  
  inline def apply(): SchemaGoogleChatV1WidgetMarkupTextParagraph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChatV1WidgetMarkupTextParagraph]
  }
  
  extension [Self <: SchemaGoogleChatV1WidgetMarkupTextParagraph](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
