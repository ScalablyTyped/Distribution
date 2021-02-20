package typings.forgeApis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterExtensionTypeFilterId extends StObject {
  
  var filterExtensionType: js.UndefOr[js.Array[String]] = js.native
  
  var filterId: js.UndefOr[js.Array[String]] = js.native
}
object FilterExtensionTypeFilterId {
  
  @scala.inline
  def apply(): FilterExtensionTypeFilterId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterExtensionTypeFilterId]
  }
  
  @scala.inline
  implicit class FilterExtensionTypeFilterIdMutableBuilder[Self <: FilterExtensionTypeFilterId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterExtensionType(value: js.Array[String]): Self = StObject.set(x, "filterExtensionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterExtensionTypeUndefined: Self = StObject.set(x, "filterExtensionType", js.undefined)
    
    @scala.inline
    def setFilterExtensionTypeVarargs(value: String*): Self = StObject.set(x, "filterExtensionType", js.Array(value :_*))
    
    @scala.inline
    def setFilterId(value: js.Array[String]): Self = StObject.set(x, "filterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterIdUndefined: Self = StObject.set(x, "filterId", js.undefined)
    
    @scala.inline
    def setFilterIdVarargs(value: String*): Self = StObject.set(x, "filterId", js.Array(value :_*))
  }
}
