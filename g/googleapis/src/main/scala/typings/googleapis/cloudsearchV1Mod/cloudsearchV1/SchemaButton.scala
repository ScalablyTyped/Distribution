package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaButton extends StObject {
  
  var imageButton: js.UndefOr[SchemaImageButton] = js.undefined
  
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
