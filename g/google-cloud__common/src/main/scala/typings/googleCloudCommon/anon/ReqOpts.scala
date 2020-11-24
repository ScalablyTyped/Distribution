package typings.googleCloudCommon.anon

import typings.teenyRequest.mod.CoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReqOpts extends js.Object {
  
  var reqOpts: js.UndefOr[CoreOptions] = js.native
}
object ReqOpts {
  
  @scala.inline
  def apply(): ReqOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReqOpts]
  }
  
  @scala.inline
  implicit class ReqOptsOps[Self <: ReqOpts] (val x: Self) extends AnyVal {
    
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
    def setReqOpts(value: CoreOptions): Self = this.set("reqOpts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReqOpts: Self = this.set("reqOpts", js.undefined)
  }
}
