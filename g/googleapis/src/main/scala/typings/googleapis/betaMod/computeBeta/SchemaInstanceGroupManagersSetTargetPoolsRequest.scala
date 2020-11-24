package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInstanceGroupManagersSetTargetPoolsRequest extends js.Object {
  
  /**
    * The fingerprint of the target pools information. Use this optional
    * property to prevent conflicts when multiple users change the target pools
    * settings concurrently. Obtain the fingerprint with the
    * instanceGroupManagers.get method. Then, include the fingerprint in your
    * request to ensure that you do not overwrite changes that were applied
    * from another concurrent request.
    */
  var fingerprint: js.UndefOr[String] = js.native
  
  /**
    * The list of target pool URLs that instances in this managed instance
    * group belong to. The managed instance group applies these target pools to
    * all of the instances in the group. Existing instances and new instances
    * in the group all receive these target pool settings.
    */
  var targetPools: js.UndefOr[js.Array[String]] = js.native
}
object SchemaInstanceGroupManagersSetTargetPoolsRequest {
  
  @scala.inline
  def apply(): SchemaInstanceGroupManagersSetTargetPoolsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagersSetTargetPoolsRequest]
  }
  
  @scala.inline
  implicit class SchemaInstanceGroupManagersSetTargetPoolsRequestOps[Self <: SchemaInstanceGroupManagersSetTargetPoolsRequest] (val x: Self) extends AnyVal {
    
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
