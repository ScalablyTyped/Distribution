package typings.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A button with text and onclick action.
  */
@js.native
trait SchemaTextButton extends js.Object {
  
  /**
    * The onclick action of the button.
    */
  var onClick: js.UndefOr[SchemaOnClick] = js.native
  
  /**
    * The text of the button.
    */
  var text: js.UndefOr[String] = js.native
}
object SchemaTextButton {
  
  @scala.inline
  def apply(): SchemaTextButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextButton]
  }
  
  @scala.inline
  implicit class SchemaTextButtonOps[Self <: SchemaTextButton] (val x: Self) extends AnyVal {
    
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
    def setOnClick(value: SchemaOnClick): Self = this.set("onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
