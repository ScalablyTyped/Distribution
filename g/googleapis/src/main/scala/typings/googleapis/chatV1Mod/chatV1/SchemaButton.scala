package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaButton extends StObject {
  
  /**
    * A button with image and onclick action.
    */
  var imageButton: js.UndefOr[SchemaImageButton] = js.undefined
  
  /**
    * A button with text and onclick action.
    */
  var textButton: js.UndefOr[SchemaTextButton] = js.undefined
}
object SchemaButton {
  
  inline def apply(): SchemaButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaButton]
  }
  
  extension [Self <: SchemaButton](x: Self) {
    
    inline def setImageButton(value: SchemaImageButton): Self = StObject.set(x, "imageButton", value.asInstanceOf[js.Any])
    
    inline def setImageButtonUndefined: Self = StObject.set(x, "imageButton", js.undefined)
    
    inline def setTextButton(value: SchemaTextButton): Self = StObject.set(x, "textButton", value.asInstanceOf[js.Any])
    
    inline def setTextButtonUndefined: Self = StObject.set(x, "textButton", js.undefined)
  }
}
