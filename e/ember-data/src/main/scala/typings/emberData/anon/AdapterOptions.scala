package typings.emberData.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdapterOptions extends js.Object {
  
  var adapterOptions: js.UndefOr[js.Object] = js.native
}
object AdapterOptions {
  
  @scala.inline
  def apply(): AdapterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdapterOptions]
  }
  
  @scala.inline
  implicit class AdapterOptionsOps[Self <: AdapterOptions] (val x: Self) extends AnyVal {
    
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
    def setAdapterOptions(value: js.Object): Self = this.set("adapterOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdapterOptions: Self = this.set("adapterOptions", js.undefined)
  }
}
