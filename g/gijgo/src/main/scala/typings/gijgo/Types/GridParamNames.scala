package typings.gijgo.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridParamNames extends js.Object {
  
  var direction: js.UndefOr[String] = js.native
  
  var groupBy: js.UndefOr[String] = js.native
  
  var groupByDirection: js.UndefOr[String] = js.native
  
  var limit: js.UndefOr[String] = js.native
  
  var page: js.UndefOr[String] = js.native
  
  var sortBy: js.UndefOr[String] = js.native
}
object GridParamNames {
  
  @scala.inline
  def apply(): GridParamNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridParamNames]
  }
  
  @scala.inline
  implicit class GridParamNamesOps[Self <: GridParamNames] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setGroupBy(value: String): Self = this.set("groupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupBy: Self = this.set("groupBy", js.undefined)
    
    @scala.inline
    def setGroupByDirection(value: String): Self = this.set("groupByDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupByDirection: Self = this.set("groupByDirection", js.undefined)
    
    @scala.inline
    def setLimit(value: String): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setPage(value: String): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setSortBy(value: String): Self = this.set("sortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortBy: Self = this.set("sortBy", js.undefined)
  }
}
