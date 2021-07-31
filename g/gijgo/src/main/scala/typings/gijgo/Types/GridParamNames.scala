package typings.gijgo.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridParamNames extends StObject {
  
  var direction: js.UndefOr[String] = js.undefined
  
  var groupBy: js.UndefOr[String] = js.undefined
  
  var groupByDirection: js.UndefOr[String] = js.undefined
  
  var limit: js.UndefOr[String] = js.undefined
  
  var page: js.UndefOr[String] = js.undefined
  
  var sortBy: js.UndefOr[String] = js.undefined
}
object GridParamNames {
  
  @scala.inline
  def apply(): GridParamNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridParamNames]
  }
  
  @scala.inline
  implicit class GridParamNamesMutableBuilder[Self <: GridParamNames] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setGroupBy(value: String): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByDirection(value: String): Self = StObject.set(x, "groupByDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByDirectionUndefined: Self = StObject.set(x, "groupByDirection", js.undefined)
    
    @scala.inline
    def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
    
    @scala.inline
    def setLimit(value: String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setSortBy(value: String): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
  }
}
