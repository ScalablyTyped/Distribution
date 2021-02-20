package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A button with text and onclick action.
  */
@js.native
trait SchemaTextButton extends StObject {
  
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
  implicit class SchemaTextButtonMutableBuilder[Self <: SchemaTextButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnClick(value: SchemaOnClick): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
