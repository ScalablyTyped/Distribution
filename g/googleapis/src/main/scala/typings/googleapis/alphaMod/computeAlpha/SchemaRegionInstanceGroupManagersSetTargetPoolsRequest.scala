package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaRegionInstanceGroupManagersSetTargetPoolsRequest extends js.Object {
  
  /**
    * Fingerprint of the target pools information, which is a hash of the
    * contents. This field is used for optimistic locking when you update the
    * target pool entries. This field is optional.
    */
  var fingerprint: js.UndefOr[String] = js.native
  
  /**
    * The URL of all TargetPool resources to which instances in the
    * instanceGroup field are added. The target pools automatically apply to
    * all of the instances in the managed instance group.
    */
  var targetPools: js.UndefOr[js.Array[String]] = js.native
}
object SchemaRegionInstanceGroupManagersSetTargetPoolsRequest {
  
  @scala.inline
  def apply(): SchemaRegionInstanceGroupManagersSetTargetPoolsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionInstanceGroupManagersSetTargetPoolsRequest]
  }
  
  @scala.inline
  implicit class SchemaRegionInstanceGroupManagersSetTargetPoolsRequestOps[Self <: SchemaRegionInstanceGroupManagersSetTargetPoolsRequest] (val x: Self) extends AnyVal {
    
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
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    
    @scala.inline
    def setTargetPoolsVarargs(value: String*): Self = this.set("targetPools", js.Array(value :_*))
    
    @scala.inline
    def setTargetPools(value: js.Array[String]): Self = this.set("targetPools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetPools: Self = this.set("targetPools", js.undefined)
  }
}
