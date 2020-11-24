package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketPolicyOnly extends js.Object {
  
  var bucketPolicyOnly: js.UndefOr[Enabled] = js.native
}
object BucketPolicyOnly {
  
  @scala.inline
  def apply(): BucketPolicyOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketPolicyOnly]
  }
  
  @scala.inline
  implicit class BucketPolicyOnlyOps[Self <: BucketPolicyOnly] (val x: Self) extends AnyVal {
    
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
    def setBucketPolicyOnly(value: Enabled): Self = this.set("bucketPolicyOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketPolicyOnly: Self = this.set("bucketPolicyOnly", js.undefined)
  }
}
