package typings.fuzzaldrinPlus.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagClass extends js.Object {
  
  var tagClass: js.UndefOr[String] = js.native
  
  var tagClose: js.UndefOr[String] = js.native
  
  var tagOpen: js.UndefOr[String] = js.native
}
object TagClass {
  
  @scala.inline
  def apply(): TagClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagClass]
  }
  
  @scala.inline
  implicit class TagClassOps[Self <: TagClass] (val x: Self) extends AnyVal {
    
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
    def setTagClass(value: String): Self = this.set("tagClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagClass: Self = this.set("tagClass", js.undefined)
    
    @scala.inline
    def setTagClose(value: String): Self = this.set("tagClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagClose: Self = this.set("tagClose", js.undefined)
    
    @scala.inline
    def setTagOpen(value: String): Self = this.set("tagOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagOpen: Self = this.set("tagOpen", js.undefined)
  }
}
