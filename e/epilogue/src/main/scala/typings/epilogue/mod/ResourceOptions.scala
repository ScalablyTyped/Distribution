package typings.epilogue.mod

import typings.epilogue.anon.Model
import typings.sequelize.mod.AssociationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceOptions extends js.Object {
  
  var actions: js.UndefOr[js.Array[String]] = js.native
  
  var associations: js.UndefOr[AssociationOptions] = js.native
  
  var endpoints: js.Array[String] = js.native
  
  var excludeAttributes: js.UndefOr[js.Array[String]] = js.native
  
  var include: js.UndefOr[js.Array[Model | String]] = js.native
  
  var model: js.Any = js.native
  
  var pagination: js.UndefOr[Boolean] = js.native
  
  var readOnlyAttributes: js.UndefOr[js.Array[String]] = js.native
  
  var reloadInstances: js.UndefOr[Boolean] = js.native
  
  var search: js.UndefOr[ResourceSearchOption] = js.native
  
  var sort: js.UndefOr[ResourceSortOption] = js.native
  
  var updateMethod: js.UndefOr[String] = js.native
}
object ResourceOptions {
  
  @scala.inline
  def apply(endpoints: js.Array[String], model: js.Any): ResourceOptions = {
    val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceOptions]
  }
  
  @scala.inline
  implicit class ResourceOptionsOps[Self <: ResourceOptions] (val x: Self) extends AnyVal {
    
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
    def setEndpointsVarargs(value: String*): Self = this.set("endpoints", js.Array(value :_*))
    
    @scala.inline
    def setEndpoints(value: js.Array[String]): Self = this.set("endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsVarargs(value: String*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: js.Array[String]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    
    @scala.inline
    def setAssociations(value: AssociationOptions): Self = this.set("associations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociations: Self = this.set("associations", js.undefined)
    
    @scala.inline
    def setExcludeAttributesVarargs(value: String*): Self = this.set("excludeAttributes", js.Array(value :_*))
    
    @scala.inline
    def setExcludeAttributes(value: js.Array[String]): Self = this.set("excludeAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeAttributes: Self = this.set("excludeAttributes", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: (Model | String)*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: js.Array[Model | String]): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setPagination(value: Boolean): Self = this.set("pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagination: Self = this.set("pagination", js.undefined)
    
    @scala.inline
    def setReadOnlyAttributesVarargs(value: String*): Self = this.set("readOnlyAttributes", js.Array(value :_*))
    
    @scala.inline
    def setReadOnlyAttributes(value: js.Array[String]): Self = this.set("readOnlyAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnlyAttributes: Self = this.set("readOnlyAttributes", js.undefined)
    
    @scala.inline
    def setReloadInstances(value: Boolean): Self = this.set("reloadInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReloadInstances: Self = this.set("reloadInstances", js.undefined)
    
    @scala.inline
    def setSearch(value: ResourceSearchOption): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
    
    @scala.inline
    def setSort(value: ResourceSortOption): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def setUpdateMethod(value: String): Self = this.set("updateMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateMethod: Self = this.set("updateMethod", js.undefined)
  }
}
