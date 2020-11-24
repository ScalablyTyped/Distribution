package typings.gifJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddFrameOptions extends js.Object {
  
  var copy: js.UndefOr[Boolean] = js.native
  
  var delay: js.UndefOr[Double] = js.native
  
  var dispose: js.UndefOr[Double] = js.native
}
object AddFrameOptions {
  
  @scala.inline
  def apply(): AddFrameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddFrameOptions]
  }
  
  @scala.inline
  implicit class AddFrameOptionsOps[Self <: AddFrameOptions] (val x: Self) extends AnyVal {
    
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
    def setCopy(value: Boolean): Self = this.set("copy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopy: Self = this.set("copy", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setDispose(value: Double): Self = this.set("dispose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDispose: Self = this.set("dispose", js.undefined)
  }
}
