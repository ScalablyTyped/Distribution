package typings.expo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GcmSenderId extends js.Object {
  
  var gcmSenderId: js.UndefOr[String] = js.native
}
object GcmSenderId {
  
  @scala.inline
  def apply(): GcmSenderId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GcmSenderId]
  }
  
  @scala.inline
  implicit class GcmSenderIdOps[Self <: GcmSenderId] (val x: Self) extends AnyVal {
    
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
    def setGcmSenderId(value: String): Self = this.set("gcmSenderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcmSenderId: Self = this.set("gcmSenderId", js.undefined)
  }
}
