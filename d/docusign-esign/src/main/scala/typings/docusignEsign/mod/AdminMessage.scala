package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminMessage extends js.Object {
  
  var baseMessage: js.UndefOr[String] = js.native
  
  var moreInformation: js.UndefOr[String] = js.native
}
object AdminMessage {
  
  @scala.inline
  def apply(): AdminMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminMessage]
  }
  
  @scala.inline
  implicit class AdminMessageOps[Self <: AdminMessage] (val x: Self) extends AnyVal {
    
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
    def setBaseMessage(value: String): Self = this.set("baseMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseMessage: Self = this.set("baseMessage", js.undefined)
    
    @scala.inline
    def setMoreInformation(value: String): Self = this.set("moreInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoreInformation: Self = this.set("moreInformation", js.undefined)
  }
}
