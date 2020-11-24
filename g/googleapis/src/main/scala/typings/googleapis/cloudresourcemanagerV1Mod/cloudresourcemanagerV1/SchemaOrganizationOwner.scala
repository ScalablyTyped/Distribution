package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The entity that owns an Organization. The lifetime of the Organization and
  * all of its descendants are bound to the `OrganizationOwner`. If the
  * `OrganizationOwner` is deleted, the Organization and all its descendants
  * will be deleted.
  */
@js.native
trait SchemaOrganizationOwner extends js.Object {
  
  /**
    * The G Suite customer id used in the Directory API.
    */
  var directoryCustomerId: js.UndefOr[String] = js.native
}
object SchemaOrganizationOwner {
  
  @scala.inline
  def apply(): SchemaOrganizationOwner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrganizationOwner]
  }
  
  @scala.inline
  implicit class SchemaOrganizationOwnerOps[Self <: SchemaOrganizationOwner] (val x: Self) extends AnyVal {
    
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
    def setDirectoryCustomerId(value: String): Self = this.set("directoryCustomerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectoryCustomerId: Self = this.set("directoryCustomerId", js.undefined)
  }
}
