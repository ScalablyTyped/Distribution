package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLanguageConfig extends StObject {
  
  /**
    * The spoken language(s) in BCP47 language code.
    */
  var spokenLanguages: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaLanguageConfig {
  
  inline def apply(): SchemaLanguageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLanguageConfig]
  }
  
  extension [Self <: SchemaLanguageConfig](x: Self) {
    
    inline def setSpokenLanguages(value: js.Array[String]): Self = StObject.set(x, "spokenLanguages", value.asInstanceOf[js.Any])
    
    inline def setSpokenLanguagesNull: Self = StObject.set(x, "spokenLanguages", null)
    
    inline def setSpokenLanguagesUndefined: Self = StObject.set(x, "spokenLanguages", js.undefined)
    
    inline def setSpokenLanguagesVarargs(value: String*): Self = StObject.set(x, "spokenLanguages", js.Array(value*))
  }
}
