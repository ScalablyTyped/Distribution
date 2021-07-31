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
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaBookshelves {
  
  @scala.inline
  def apply(): SchemaBookshelves = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBookshelves]
  }
  
  @scala.inline
  implicit class SchemaBookshelvesMutableBuilder[Self <: SchemaBookshelves] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaBookshelf]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaBookshelf*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
