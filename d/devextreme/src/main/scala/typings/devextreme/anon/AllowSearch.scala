package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowSearch extends StObject {
  
  var allowSearch: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object AllowSearch {
  
  @scala.inline
  def apply(): AllowSearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowSearch]
  }
  
  @scala.inline
  implicit class AllowSearchMutableBuilder[Self <: AllowSearch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowSearch(value: Boolean): Self = StObject.set(x, "allowSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSearchUndefined: Self = StObject.set(x, "allowSearch", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
