package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A localized string with its locale.
  */
trait SchemaLocalizedText extends StObject {
  
  /**
    * The BCP47 tag for a locale. (e.g. &quot;en-US&quot;, &quot;de&quot;).
    */
  var locale: js.UndefOr[String] = js.undefined
  
  /**
    * The text localized in the associated locale.
    */
  var text: js.UndefOr[String] = js.undefined
}
object SchemaLocalizedText {
  
  inline def apply(): SchemaLocalizedText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocalizedText]
  }
  
  extension [Self <: SchemaLocalizedText](x: Self) {
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
