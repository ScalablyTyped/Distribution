package typings.gm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetterOptions extends js.Object {
  
  var bufferStream: js.UndefOr[Boolean] = js.native
}
object GetterOptions {
  
  @scala.inline
  def apply(): GetterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetterOptions]
  }
  
  @scala.inline
  implicit class GetterOptionsOps[Self <: GetterOptions] (val x: Self) extends AnyVal {
    
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
    def setBufferStream(value: Boolean): Self = this.set("bufferStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBufferStream: Self = this.set("bufferStream", js.undefined)
  }
}
