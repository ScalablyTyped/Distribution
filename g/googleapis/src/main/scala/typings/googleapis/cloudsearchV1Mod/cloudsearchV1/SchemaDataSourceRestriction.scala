package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Restriction on Datasource.
  */
@js.native
trait SchemaDataSourceRestriction extends js.Object {
  
  /**
    * Filter options restricting the results. If multiple filters are present,
    * they are grouped by object type before joining. Filters with the same
    * object type are joined conjunctively, then the resulting expressions are
    * joined disjunctively.  The maximum number of elements is 20.
    */
  var filterOptions: js.UndefOr[js.Array[SchemaFilterOptions]] = js.native
  
  /**
    * The source of restriction.
    */
  var source: js.UndefOr[SchemaSource] = js.native
}
object SchemaDataSourceRestriction {
  
  @scala.inline
  def apply(): SchemaDataSourceRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataSourceRestriction]
  }
  
  @scala.inline
  implicit class SchemaDataSourceRestrictionOps[Self <: SchemaDataSourceRestriction] (val x: Self) extends AnyVal {
    
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
    def setFilterOptionsVarargs(value: SchemaFilterOptions*): Self = this.set("filterOptions", js.Array(value :_*))
    
    @scala.inline
    def setFilterOptions(value: js.Array[SchemaFilterOptions]): Self = this.set("filterOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterOptions: Self = this.set("filterOptions", js.undefined)
    
    @scala.inline
    def setSource(value: SchemaSource): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
