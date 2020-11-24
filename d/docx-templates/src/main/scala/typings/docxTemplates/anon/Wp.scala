package typings.docxTemplates.anon

import typings.docxTemplates.typesMod.BufferStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Wp extends js.Object {
  
  @JSName("w:p")
  var wColonp: BufferStatus = js.native
  
  @JSName("w:tr")
  var wColontr: BufferStatus = js.native
}
object Wp {
  
  @scala.inline
  def apply(wColonp: BufferStatus, wColontr: BufferStatus): Wp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("w:p")(wColonp.asInstanceOf[js.Any])
    __obj.updateDynamic("w:tr")(wColontr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wp]
  }
  
  @scala.inline
  implicit class WpOps[Self <: Wp] (val x: Self) extends AnyVal {
    
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
    def setWColonp(value: BufferStatus): Self = this.set("w:p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWColontr(value: BufferStatus): Self = this.set("w:tr", value.asInstanceOf[js.Any])
  }
}
