package typings.devcert.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICaBuffer
  extends IReturnCa[js.Any] {
  
  var ca: Buffer = js.native
}
object ICaBuffer {
  
  @scala.inline
  def apply(ca: Buffer): ICaBuffer = {
    val __obj = js.Dynamic.literal(ca = ca.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICaBuffer]
  }
  
  @scala.inline
  implicit class ICaBufferOps[Self <: ICaBuffer] (val x: Self) extends AnyVal {
    
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
    def setCa(value: Buffer): Self = this.set("ca", value.asInstanceOf[js.Any])
  }
}
