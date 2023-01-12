package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagSuggestion extends StObject {
  
  /** Alias found, only present if not the same as the primary alias */
  var alias: js.UndefOr[String] = js.undefined
  
  /** Primary alias of the tag suggestion */
  var primaryAlias: String
  
  /** Tag suggested */
  var tag: Tag
}
object TagSuggestion {
  
  inline def apply(primaryAlias: String, tag: Tag): TagSuggestion = {
    val __obj = js.Dynamic.literal(primaryAlias = primaryAlias.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagSuggestion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagSuggestion] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setPrimaryAlias(value: String): Self = StObject.set(x, "primaryAlias", value.asInstanceOf[js.Any])
    
    inline def setTag(value: Tag): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
