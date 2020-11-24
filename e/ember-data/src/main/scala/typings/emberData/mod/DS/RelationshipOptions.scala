package typings.emberData.mod.DS

import typings.emberData.mod.RelationshipsFor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationshipOptions[M /* <: Model */] extends js.Object {
  
  var async: js.UndefOr[Boolean] = js.native
  
  var inverse: js.UndefOr[RelationshipsFor[M] | Null] = js.native
  
  var polymorphic: js.UndefOr[Boolean] = js.native
}
object RelationshipOptions {
  
  @scala.inline
  def apply[M /* <: Model */](): RelationshipOptions[M] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationshipOptions[M]]
  }
  
  @scala.inline
  implicit class RelationshipOptionsOps[Self <: RelationshipOptions[_], M /* <: Model */] (val x: Self with RelationshipOptions[M]) extends AnyVal {
    
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    
    @scala.inline
    def setInverse(value: RelationshipsFor[M]): Self = this.set("inverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInverse: Self = this.set("inverse", js.undefined)
    
    @scala.inline
    def setInverseNull: Self = this.set("inverse", null)
    
    @scala.inline
    def setPolymorphic(value: Boolean): Self = this.set("polymorphic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolymorphic: Self = this.set("polymorphic", js.undefined)
  }
}
