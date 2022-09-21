package typings.fbt.mod

import typings.fbt.fbtStrings.ifMany
import typings.fbt.fbtStrings.no
import typings.fbt.fbtStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluralOptions extends StObject {
  
  /**
    * Represents the plural form of the string in English. Default is `{singular} + 's'`
    */
  var many: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the token where count shows up. (Default: `"number"`)
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * `"yes"|"no"|"ifMany"`: Whether to show the `{number}` in the string.
    *
    * > Note that the singular phrase never has a token, but inlines to `1`.
    * ? This is to account for languages like Hebrew for which showing the actual number isn't appropriate
    *
    *  - "no": (DEFAULT) Don't show the count
    *  - "ifMany": Show the count only in plural case
    *  - "yes": Show the count in all cases
    */
  var showCount: js.UndefOr[yes | no | ifMany] = js.undefined
  
  /**
    * For overriding the displayed number
    */
  var value: js.UndefOr[Any] = js.undefined
}
object PluralOptions {
  
  inline def apply(): PluralOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluralOptions]
  }
  
  extension [Self <: PluralOptions](x: Self) {
    
    inline def setMany(value: String): Self = StObject.set(x, "many", value.asInstanceOf[js.Any])
    
    inline def setManyUndefined: Self = StObject.set(x, "many", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setShowCount(value: yes | no | ifMany): Self = StObject.set(x, "showCount", value.asInstanceOf[js.Any])
    
    inline def setShowCountUndefined: Self = StObject.set(x, "showCount", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
