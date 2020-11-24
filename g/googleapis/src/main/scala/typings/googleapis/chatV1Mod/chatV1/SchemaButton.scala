package typings.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A button. Can be a text button or an image button.
  */
@js.native
trait SchemaButton extends js.Object {
  
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
  implicit class SchemaButtonOps[Self <: SchemaButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setImageButton(value: SchemaImageButton): Self = this.set("imageButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageButton: Self = this.set("imageButton", js.undefined)
    
    @scala.inline
    def setTextButton(value: SchemaTextButton): Self = this.set("textButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextButton: Self = this.set("textButton", js.undefined)
  }
}
