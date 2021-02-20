package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateItem extends StObject {
  
  var data: js.UndefOr[CreateItemData] = js.native
  
  var included: js.Array[CreateItemIncluded] = js.native
  
  var jsonapi: js.UndefOr[JsonApiVersionJsonapi] = js.native
}
object CreateItem {
  
  @scala.inline
  def apply(included: js.Array[CreateItemIncluded]): CreateItem = {
    val __obj = js.Dynamic.literal(included = included.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateItem]
  }
  
  @scala.inline
  implicit class CreateItemMutableBuilder[Self <: CreateItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: CreateItemData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setIncluded(value: js.Array[CreateItemIncluded]): Self = StObject.set(x, "included", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludedVarargs(value: CreateItemIncluded*): Self = StObject.set(x, "included", js.Array(value :_*))
    
    @scala.inline
    def setJsonapi(value: JsonApiVersionJsonapi): Self = StObject.set(x, "jsonapi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonapiUndefined: Self = StObject.set(x, "jsonapi", js.undefined)
  }
}
