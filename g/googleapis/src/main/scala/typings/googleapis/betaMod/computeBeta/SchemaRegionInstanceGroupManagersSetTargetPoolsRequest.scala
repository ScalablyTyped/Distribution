package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaRegionInstanceGroupManagersSetTargetPoolsRequest extends StObject {
  
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
  implicit class SchemaRegionInstanceGroupManagersSetTargetPoolsRequestMutableBuilder[Self <: SchemaRegionInstanceGroupManagersSetTargetPoolsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    @scala.inline
    def setTargetPools(value: js.Array[String]): Self = StObject.set(x, "targetPools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetPoolsUndefined: Self = StObject.set(x, "targetPools", js.undefined)
    
    @scala.inline
    def setTargetPoolsVarargs(value: String*): Self = StObject.set(x, "targetPools", js.Array(value :_*))
  }
}
