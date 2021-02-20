package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a string with localizations and a default value to fall back on.
  */
@js.native
trait LocalizableContent extends StObject {
  
  /**
    * The default value of the string to use if the viewer's locale is not a key in the localizations object.
    */
  var default: String = js.native
  
  /**
    *  Specifies what string to use for viewers in each locale. See https://origincache.facebook.com/developers/resources/?id=FacebookLocales.xml for a complete list of supported locale values.
    */
  var localizations: LocalizationsDict = js.native
}
object LocalizableContent {
  
  @scala.inline
  def apply(default: String, localizations: LocalizationsDict): LocalizableContent = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], localizations = localizations.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalizableContent]
  }
  
  @scala.inline
  implicit class LocalizableContentMutableBuilder[Self <: LocalizableContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalizations(value: LocalizationsDict): Self = StObject.set(x, "localizations", value.asInstanceOf[js.Any])
  }
}
