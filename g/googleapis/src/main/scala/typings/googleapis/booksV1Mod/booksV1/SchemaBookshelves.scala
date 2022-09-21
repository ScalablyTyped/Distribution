package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBookshelves extends StObject {
  
  /**
    * A list of bookshelves.
    */
  var items: js.UndefOr[js.Array[SchemaBookshelf]] = js.undefined
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaBookshelves {
  
  inline def apply(): SchemaBookshelves = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBookshelves]
  }
  
  extension [Self <: SchemaBookshelves](x: Self) {
    
    inline def setItems(value: js.Array[SchemaBookshelf]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaBookshelf*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
