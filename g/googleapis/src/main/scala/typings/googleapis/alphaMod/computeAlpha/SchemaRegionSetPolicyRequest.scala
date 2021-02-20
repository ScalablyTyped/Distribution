package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaRegionSetPolicyRequest extends StObject {
  
  /**
    * Flatten Policy to create a backwacd compatible wire-format. Deprecated.
    * Use &#39;policy&#39; to specify bindings.
    */
  var bindings: js.UndefOr[js.Array[SchemaBinding]] = js.native
  
  /**
    * Flatten Policy to create a backward compatible wire-format. Deprecated.
    * Use &#39;policy&#39; to specify the etag.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * REQUIRED: The complete policy to be applied to the &#39;resource&#39;.
    * The size of the policy is limited to a few 10s of KB. An empty policy is
    * in general a valid policy but certain services (like Projects) might
    * reject them.
    */
  var policy: js.UndefOr[SchemaPolicy] = js.native
}
object SchemaRegionSetPolicyRequest {
  
  @scala.inline
  def apply(): SchemaRegionSetPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionSetPolicyRequest]
  }
  
  @scala.inline
  implicit class SchemaRegionSetPolicyRequestMutableBuilder[Self <: SchemaRegionSetPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindings(value: js.Array[SchemaBinding]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
    
    @scala.inline
    def setBindingsVarargs(value: SchemaBinding*): Self = StObject.set(x, "bindings", js.Array(value :_*))
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setPolicy(value: SchemaPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}
