package typings.devtoolsProtocol.mod.Protocol.Emulation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetPageScaleFactorRequest extends js.Object {
  
  /**
    * Page scale factor.
    */
  var pageScaleFactor: Double = js.native
}
object SetPageScaleFactorRequest {
  
  @scala.inline
  def apply(pageScaleFactor: Double): SetPageScaleFactorRequest = {
    val __obj = js.Dynamic.literal(pageScaleFactor = pageScaleFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetPageScaleFactorRequest]
  }
  
  @scala.inline
  implicit class SetPageScaleFactorRequestOps[Self <: SetPageScaleFactorRequest] (val x: Self) extends AnyVal {
    
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
    def setPageScaleFactor(value: Double): Self = this.set("pageScaleFactor", value.asInstanceOf[js.Any])
  }
}
