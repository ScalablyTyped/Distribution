package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaStatefulPolicy extends js.Object {
  
  var preservedResources: js.UndefOr[SchemaStatefulPolicyPreservedResources] = js.native
  
  var preservedState: js.UndefOr[SchemaStatefulPolicyPreservedState] = js.native
}
object SchemaStatefulPolicy {
  
  @scala.inline
  def apply(): SchemaStatefulPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStatefulPolicy]
  }
  
  @scala.inline
  implicit class SchemaStatefulPolicyOps[Self <: SchemaStatefulPolicy] (val x: Self) extends AnyVal {
    
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
    def setPreservedResources(value: SchemaStatefulPolicyPreservedResources): Self = this.set("preservedResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreservedResources: Self = this.set("preservedResources", js.undefined)
    
    @scala.inline
    def setPreservedState(value: SchemaStatefulPolicyPreservedState): Self = this.set("preservedState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreservedState: Self = this.set("preservedState", js.undefined)
  }
}
