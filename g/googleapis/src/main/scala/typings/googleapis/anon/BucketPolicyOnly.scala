package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketPolicyOnly extends StObject {
  
  var bucketPolicyOnly: js.UndefOr[Enabled] = js.native
}
object BucketPolicyOnly {
  
  @scala.inline
  def apply(): BucketPolicyOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketPolicyOnly]
  }
  
  @scala.inline
  implicit class BucketPolicyOnlyMutableBuilder[Self <: BucketPolicyOnly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketPolicyOnly(value: Enabled): Self = StObject.set(x, "bucketPolicyOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketPolicyOnlyUndefined: Self = StObject.set(x, "bucketPolicyOnly", js.undefined)
  }
}
