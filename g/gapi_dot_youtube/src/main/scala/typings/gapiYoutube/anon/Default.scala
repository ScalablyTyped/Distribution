package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Default extends StObject {
  
  /**
    * The default value for the property.
    */
  var default: String
  
  /**
    * A list of objects that specify language-specific values for the property.
    */
  var localized: js.Array[Language]
}
object Default {
  
  inline def apply(default: String, localized: js.Array[Language]): Default = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], localized = localized.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
  
  extension [Self <: Default](x: Self) {
    
    inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setLocalized(value: js.Array[Language]): Self = StObject.set(x, "localized", value.asInstanceOf[js.Any])
    
    inline def setLocalizedVarargs(value: Language*): Self = StObject.set(x, "localized", js.Array(value :_*))
  }
}
