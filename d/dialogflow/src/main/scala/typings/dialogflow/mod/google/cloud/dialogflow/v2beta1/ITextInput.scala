package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

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
  
  inline def apply(): ITextInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITextInput]
  }
  
  extension [Self <: ITextInput](x: Self) {
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
