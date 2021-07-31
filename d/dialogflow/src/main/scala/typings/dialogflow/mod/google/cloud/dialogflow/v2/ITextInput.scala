package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a TextInput. */
trait ITextInput extends StObject {
  
  /** TextInput languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /** TextInput text */
  var text: js.UndefOr[String | Null] = js.undefined
}
object ITextInput {
  
  @scala.inline
  def apply(): ITextInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITextInput]
  }
  
  @scala.inline
  implicit class ITextInputMutableBuilder[Self <: ITextInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextNull: Self = StObject.set(x, "text", null)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
