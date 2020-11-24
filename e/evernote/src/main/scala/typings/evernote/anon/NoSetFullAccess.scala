package typings.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NoSetFullAccess extends js.Object {
  
  var noSetFullAccess: js.UndefOr[Boolean] = js.native
  
  var noSetModifyNote: js.UndefOr[Boolean] = js.native
  
  var noSetReadNote: js.UndefOr[Boolean] = js.native
}
object NoSetFullAccess {
  
  @scala.inline
  def apply(): NoSetFullAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoSetFullAccess]
  }
  
  @scala.inline
  implicit class NoSetFullAccessOps[Self <: NoSetFullAccess] (val x: Self) extends AnyVal {
    
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
    def setNoSetFullAccess(value: Boolean): Self = this.set("noSetFullAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoSetFullAccess: Self = this.set("noSetFullAccess", js.undefined)
    
    @scala.inline
    def setNoSetModifyNote(value: Boolean): Self = this.set("noSetModifyNote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoSetModifyNote: Self = this.set("noSetModifyNote", js.undefined)
    
    @scala.inline
    def setNoSetReadNote(value: Boolean): Self = this.set("noSetReadNote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoSetReadNote: Self = this.set("noSetReadNote", js.undefined)
  }
}
