package typings.googleapis.booksV1Mod.booksV1

import typings.googleapis.anon.Downloadurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMetadata extends StObject {
  
  /**
    * A list of offline dictionary metadata.
    */
  var items: js.UndefOr[js.Array[Downloadurl]] = js.undefined
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaMetadata {
  
  @scala.inline
  def apply(): SchemaMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetadata]
  }
  
  @scala.inline
  implicit class SchemaMetadataMutableBuilder[Self <: SchemaMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[Downloadurl]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Downloadurl*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
