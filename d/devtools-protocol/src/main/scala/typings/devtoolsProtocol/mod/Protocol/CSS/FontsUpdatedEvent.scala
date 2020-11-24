package typings.devtoolsProtocol.mod.Protocol.CSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontsUpdatedEvent extends js.Object {
  
  /**
    * The web font that has loaded.
    */
  var font: js.UndefOr[FontFace] = js.native
}
object FontsUpdatedEvent {
  
  @scala.inline
  def apply(): FontsUpdatedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontsUpdatedEvent]
  }
  
  @scala.inline
  implicit class FontsUpdatedEventOps[Self <: FontsUpdatedEvent] (val x: Self) extends AnyVal {
    
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
    def setFont(value: FontFace): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
  }
}
