package typings.easyXapi.mod

import typings.easyXapi.anon.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitConfig extends js.Object {
  
  var jSend: js.UndefOr[Partial] = js.native
}
object InitConfig {
  
  @scala.inline
  def apply(): InitConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitConfig]
  }
  
  @scala.inline
  implicit class InitConfigOps[Self <: InitConfig] (val x: Self) extends AnyVal {
    
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
    def setJSend(value: Partial): Self = this.set("jSend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJSend: Self = this.set("jSend", js.undefined)
  }
}
