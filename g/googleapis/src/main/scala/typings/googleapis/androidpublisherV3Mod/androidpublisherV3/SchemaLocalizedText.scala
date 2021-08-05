package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLocalizedText extends StObject {
  
  /**
    * The language code, in BCP 47 format (eg &quot;en-US&quot;).
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * The text in the given `language`.
    */
  var text: js.UndefOr[String] = js.undefined
}
object SchemaLocalizedText {
  
  inline def apply(): SchemaLocalizedText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocalizedText]
  }
  
  extension [Self <: SchemaLocalizedText](x: Self) {
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
