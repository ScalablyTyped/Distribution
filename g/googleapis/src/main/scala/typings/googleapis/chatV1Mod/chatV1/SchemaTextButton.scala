package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A button with text and onclick action.
  */
trait SchemaTextButton extends StObject {
  
  /**
    * The onclick action of the button.
    */
  var onClick: js.UndefOr[SchemaOnClick] = js.undefined
  
  /**
    * The text of the button.
    */
  var text: js.UndefOr[String] = js.undefined
}
object SchemaTextButton {
  
  inline def apply(): SchemaTextButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextButton]
  }
  
  extension [Self <: SchemaTextButton](x: Self) {
    
    inline def setOnClick(value: SchemaOnClick): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
