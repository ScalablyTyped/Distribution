package typings.ethereumProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataItem extends StObject {
  
  var components: js.UndefOr[js.Array[DataItem]] = js.native
  
  var name: String = js.native
  
  var `type`: String = js.native
}
object DataItem {
  
  @scala.inline
  def apply(name: String, `type`: String): DataItem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataItem]
  }
  
  @scala.inline
  implicit class DataItemMutableBuilder[Self <: DataItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponents(value: js.Array[DataItem]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    @scala.inline
    def setComponentsVarargs(value: DataItem*): Self = StObject.set(x, "components", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
