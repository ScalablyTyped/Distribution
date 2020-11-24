package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration of all preserved resources.
  */
@js.native
trait SchemaStatefulPolicyPreservedResources extends js.Object {
  
  /**
    * Disks created on the instances that will be preserved on instance delete,
    * resize down, etc.
    */
  var disks: js.UndefOr[js.Array[SchemaStatefulPolicyPreservedDisk]] = js.native
}
object SchemaStatefulPolicyPreservedResources {
  
  @scala.inline
  def apply(): SchemaStatefulPolicyPreservedResources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStatefulPolicyPreservedResources]
  }
  
  @scala.inline
  implicit class SchemaStatefulPolicyPreservedResourcesOps[Self <: SchemaStatefulPolicyPreservedResources] (val x: Self) extends AnyVal {
    
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
    def setDisksVarargs(value: SchemaStatefulPolicyPreservedDisk*): Self = this.set("disks", js.Array(value :_*))
    
    @scala.inline
    def setDisks(value: js.Array[SchemaStatefulPolicyPreservedDisk]): Self = this.set("disks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisks: Self = this.set("disks", js.undefined)
  }
}
