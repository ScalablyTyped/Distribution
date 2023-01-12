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
  
  inline def apply(bucketKey: String, policyKey: String): PostBucketsPayload = {
    val __obj = js.Dynamic.literal(bucketKey = bucketKey.asInstanceOf[js.Any], policyKey = policyKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostBucketsPayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostBucketsPayload] (val x: Self) extends AnyVal {
    
    inline def setAllow(value: js.Array[PostBucketsPayloadAllow]): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    inline def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
    
    inline def setAllowVarargs(value: PostBucketsPayloadAllow*): Self = StObject.set(x, "allow", js.Array(value*))
    
    inline def setBucketKey(value: String): Self = StObject.set(x, "bucketKey", value.asInstanceOf[js.Any])
    
    inline def setPolicyKey(value: String): Self = StObject.set(x, "policyKey", value.asInstanceOf[js.Any])
  }
}
