package typings.doctrine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tag extends StObject {
  
  /** The description of the thing this tag is documenting. */
  var description: String | Null
  
  /** Any errors that were encountered in parsing the tag. */
  var errors: js.UndefOr[js.Array[String]] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
  
  /** The name of the thing this tag is documenting, if any. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The title of the jsdoc tag. e.g. `@foo` will have a title of 'foo'. */
  var title: String
  
  /** The type of the thing this tag is documenting. */
  var `type`: js.UndefOr[Type_ | Null] = js.undefined
}
object Tag {
  
  inline def apply(title: String): Tag = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], description = null)
    __obj.asInstanceOf[Tag]
  }
  
  extension [Self <: Tag](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: Type_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
