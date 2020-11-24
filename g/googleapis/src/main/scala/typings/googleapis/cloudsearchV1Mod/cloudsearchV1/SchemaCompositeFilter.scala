package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaCompositeFilter extends js.Object {
  
  /**
    * The logic operator of the sub filter.
    */
  var logicOperator: js.UndefOr[String] = js.native
  
  /**
    * Sub filters.
    */
  var subFilters: js.UndefOr[js.Array[SchemaFilter]] = js.native
}
object SchemaCompositeFilter {
  
  @scala.inline
  def apply(): SchemaCompositeFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompositeFilter]
  }
  
  @scala.inline
  implicit class SchemaCompositeFilterOps[Self <: SchemaCompositeFilter] (val x: Self) extends AnyVal {
    
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
    def setLogicOperator(value: String): Self = this.set("logicOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogicOperator: Self = this.set("logicOperator", js.undefined)
    
    @scala.inline
    def setSubFiltersVarargs(value: SchemaFilter*): Self = this.set("subFilters", js.Array(value :_*))
    
    @scala.inline
    def setSubFilters(value: js.Array[SchemaFilter]): Self = this.set("subFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubFilters: Self = this.set("subFilters", js.undefined)
  }
}
