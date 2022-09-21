package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsCardV1TextParagraph extends StObject {
  
  /**
    * The text that's shown in the widget.
    */
  var text: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsCardV1TextParagraph {
  
  inline def apply(): SchemaGoogleAppsCardV1TextParagraph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsCardV1TextParagraph]
  }
  
  extension [Self <: SchemaGoogleAppsCardV1TextParagraph](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
