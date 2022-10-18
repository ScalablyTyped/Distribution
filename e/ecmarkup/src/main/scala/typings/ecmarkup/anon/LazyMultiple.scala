package typings.ecmarkup.anon

import typings.ecmarkup.ecmarkupBooleans.`true`
import typings.ecmarkup.ecmarkupStrings.`Leftcurlybracketunderline pathRightcurlybracket`
import typings.ecmarkup.ecmarkupStrings.`load-biblio`
import typings.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LazyMultiple extends StObject {
  
  val description: /* An external biblio.json to load; either a path prefixed with "." or "./", or package name, of an installed eslint compatible formatter */ String
  
  val lazyMultiple: `true`
  
  val name: `load-biblio`
  
  /* standard es5 */
  def `type`(): String
  def `type`(value: Any): String
  
  val typeLabel: `Leftcurlybracketunderline pathRightcurlybracket`
  
  @JSName("type")
  val type_Original: StringConstructor
}
object LazyMultiple {
  
  inline def apply(`type`: StringConstructor): LazyMultiple = {
    val __obj = js.Dynamic.literal(description = "An external biblio.json to load; either a path prefixed with \".\" or \"./\", or package name, of an installed eslint compatible formatter", lazyMultiple = true, name = "load-biblio", typeLabel = "{underline path}")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LazyMultiple]
  }
  
  extension [Self <: LazyMultiple](x: Self) {
    
    inline def setDescription(
      value: /* An external biblio.json to load; either a path prefixed with "." or "./", or package name, of an installed eslint compatible formatter */ String
    ): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setLazyMultiple(value: `true`): Self = StObject.set(x, "lazyMultiple", value.asInstanceOf[js.Any])
    
    inline def setName(value: `load-biblio`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: StringConstructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeLabel(value: `Leftcurlybracketunderline pathRightcurlybracket`): Self = StObject.set(x, "typeLabel", value.asInstanceOf[js.Any])
  }
}
