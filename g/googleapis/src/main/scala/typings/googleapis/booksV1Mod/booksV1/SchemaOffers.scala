package typings.googleapis.booksV1Mod.booksV1

import typings.googleapis.anon.ArtUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOffers extends StObject {
  
  /**
    * A list of offers.
    */
  var items: js.UndefOr[js.Array[ArtUrl] | Null] = js.undefined
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaOffers {
  
  inline def apply(): SchemaOffers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOffers]
  }
  
  extension [Self <: SchemaOffers](x: Self) {
    
    inline def setItems(value: js.Array[ArtUrl]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsNull: Self = StObject.set(x, "items", null)
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ArtUrl*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
