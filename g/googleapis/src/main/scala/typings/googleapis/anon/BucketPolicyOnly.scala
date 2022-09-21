package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketPolicyOnly extends StObject {
  
  var bucketPolicyOnly: js.UndefOr[LockedTime] = js.undefined
  
  var publicAccessPrevention: js.UndefOr[String] = js.undefined
  
  var uniformBucketLevelAccess: js.UndefOr[LockedTime] = js.undefined
}
object BucketPolicyOnly {
  
  inline def apply(): BucketPolicyOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketPolicyOnly]
  }
  
  extension [Self <: BucketPolicyOnly](x: Self) {
    
    inline def setBucketPolicyOnly(value: LockedTime): Self = StObject.set(x, "bucketPolicyOnly", value.asInstanceOf[js.Any])
    
    inline def setBucketPolicyOnlyUndefined: Self = StObject.set(x, "bucketPolicyOnly", js.undefined)
    
    inline def setPublicAccessPrevention(value: String): Self = StObject.set(x, "publicAccessPrevention", value.asInstanceOf[js.Any])
    
    inline def setPublicAccessPreventionUndefined: Self = StObject.set(x, "publicAccessPrevention", js.undefined)
    
    inline def setUniformBucketLevelAccess(value: LockedTime): Self = StObject.set(x, "uniformBucketLevelAccess", value.asInstanceOf[js.Any])
    
    inline def setUniformBucketLevelAccessUndefined: Self = StObject.set(x, "uniformBucketLevelAccess", js.undefined)
  }
}
