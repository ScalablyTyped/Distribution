package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a string with localizations and a default value to fall back on.
  */
trait LocalizableContent extends StObject {
  
  /**
    * The default value of the string to use if the viewer's locale is not a key in the localizations object.
    */
  var default: String
  
  /**
    * Specifies what string to use for viewers in each locale. See https://lookaside.facebook.com/developers/resources/?id=FacebookLocales.xml for a complete list of supported locale values.
    */
  /**
    *  Specifies what string to use for viewers in each locale. See https://origincache.facebook.com/developers/resources/?id=FacebookLocales.xml for a complete list of supported locale values.
    */
  var localizations: LocalizationsDict
}
object LocalizableContent {
  
  inline def apply(default: String, localizations: LocalizationsDict): LocalizableContent = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], localizations = localizations.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalizableContent]
  }
  
  extension [Self <: LocalizableContent](x: Self) {
    
    inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setLocalizations(value: LocalizationsDict): Self = StObject.set(x, "localizations", value.asInstanceOf[js.Any])
  }
}
