package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostBucketsSigned extends js.Object {
  
  var minutesExpiration: Double = js.native
}
object PostBucketsSigned {
  
  @scala.inline
  def apply(minutesExpiration: Double): PostBucketsSigned = {
    val __obj = js.Dynamic.literal(minutesExpiration = minutesExpiration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostBucketsSigned]
  }
  
  @scala.inline
  implicit class PostBucketsSignedOps[Self <: PostBucketsSigned] (val x: Self) extends AnyVal {
    
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
    def setMinutesExpiration(value: Double): Self = this.set("minutesExpiration", value.asInstanceOf[js.Any])
  }
}
