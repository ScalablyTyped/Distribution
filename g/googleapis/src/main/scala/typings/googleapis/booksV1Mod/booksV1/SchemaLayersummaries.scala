package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaLayersummaries extends StObject {
  
  /**
    * A list of layer summary items.
    */
  var items: js.UndefOr[js.Array[SchemaLayersummary]] = js.native
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The total number of layer summaries found.
    */
  var totalItems: js.UndefOr[Double] = js.native
}
object SchemaLayersummaries {
  
  @scala.inline
  def apply(): SchemaLayersummaries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLayersummaries]
  }
  
  @scala.inline
  implicit class SchemaLayersummariesMutableBuilder[Self <: SchemaLayersummaries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaLayersummary]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaLayersummary*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
  }
}
