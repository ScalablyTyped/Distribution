package typings.forgeApis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterType extends StObject {
  
  var filterExtensionType: js.UndefOr[js.Array[String]] = js.native
  
  var filterId: js.UndefOr[js.Array[String]] = js.native
  
  var filterType: js.UndefOr[js.Array[String]] = js.native
  
  var filterVersionNumber: js.UndefOr[js.Array[Double]] = js.native
  
  var pageLimit: js.UndefOr[Double] = js.native
  
  var pageNumber: js.UndefOr[Double] = js.native
}
object FilterType {
  
  @scala.inline
  def apply(): FilterType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterType]
  }
  
  @scala.inline
  implicit class FilterTypeMutableBuilder[Self <: FilterType] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setFilterType(value: js.Array[String]): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
    
    @scala.inline
    def setFilterTypeVarargs(value: String*): Self = StObject.set(x, "filterType", js.Array(value :_*))
    
    @scala.inline
    def setFilterVersionNumber(value: js.Array[Double]): Self = StObject.set(x, "filterVersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterVersionNumberUndefined: Self = StObject.set(x, "filterVersionNumber", js.undefined)
    
    @scala.inline
    def setFilterVersionNumberVarargs(value: Double*): Self = StObject.set(x, "filterVersionNumber", js.Array(value :_*))
    
    @scala.inline
    def setPageLimit(value: Double): Self = StObject.set(x, "pageLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageLimitUndefined: Self = StObject.set(x, "pageLimit", js.undefined)
    
    @scala.inline
    def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
  }
}
