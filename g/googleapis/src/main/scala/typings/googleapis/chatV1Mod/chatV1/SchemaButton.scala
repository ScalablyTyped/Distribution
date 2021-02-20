package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A button. Can be a text button or an image button.
  */
@js.native
trait SchemaButton extends StObject {
  
  /**
    * A button with image and onclick action.
    */
  var imageButton: js.UndefOr[SchemaImageButton] = js.native
  
  /**
    * A button with text and onclick action.
    */
  var textButton: js.UndefOr[SchemaTextButton] = js.native
}
object SchemaButton {
  
  @scala.inline
  def apply(): SchemaButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaButton]
  }
  
  @scala.inline
  implicit class SchemaButtonMutableBuilder[Self <: SchemaButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageButton(value: SchemaImageButton): Self = StObject.set(x, "imageButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageButtonUndefined: Self = StObject.set(x, "imageButton", js.undefined)
    
    @scala.inline
    def setTextButton(value: SchemaTextButton): Self = StObject.set(x, "textButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextButtonUndefined: Self = StObject.set(x, "textButton", js.undefined)
  }
}
