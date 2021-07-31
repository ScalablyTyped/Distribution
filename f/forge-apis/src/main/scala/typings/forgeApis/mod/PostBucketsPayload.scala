package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostBucketsPayload extends StObject {
  
  var allow: js.UndefOr[js.Array[PostBucketsPayloadAllow]] = js.undefined
  
  var bucketKey: String
  
  var policyKey: String
}
object PostBucketsPayload {
  
  @scala.inline
  def apply(bucketKey: String, policyKey: String): PostBucketsPayload = {
    val __obj = js.Dynamic.literal(bucketKey = bucketKey.asInstanceOf[js.Any], policyKey = policyKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostBucketsPayload]
  }
  
  @scala.inline
  implicit class PostBucketsPayloadMutableBuilder[Self <: PostBucketsPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow(value: js.Array[PostBucketsPayloadAllow]): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
    
    @scala.inline
    def setAllowVarargs(value: PostBucketsPayloadAllow*): Self = StObject.set(x, "allow", js.Array(value :_*))
    
    @scala.inline
    def setBucketKey(value: String): Self = StObject.set(x, "bucketKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyKey(value: String): Self = StObject.set(x, "policyKey", value.asInstanceOf[js.Any])
  }
}
