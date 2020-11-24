package typings.googleapis.cloudresourcemanagerV1beta1Mod.cloudresourcemanagerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Identifying information for a single ancestor of a project.
  */
@js.native
trait SchemaAncestor extends js.Object {
  
  /**
    * Resource id of the ancestor.
    */
  var resourceId: js.UndefOr[SchemaResourceId] = js.native
}
object SchemaAncestor {
  
  @scala.inline
  def apply(): SchemaAncestor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAncestor]
  }
  
  @scala.inline
  implicit class SchemaAncestorOps[Self <: SchemaAncestor] (val x: Self) extends AnyVal {
    
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
    def setResourceId(value: SchemaResourceId): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceId: Self = this.set("resourceId", js.undefined)
  }
}
