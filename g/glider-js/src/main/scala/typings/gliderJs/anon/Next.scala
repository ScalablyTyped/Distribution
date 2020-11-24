package typings.gliderJs.anon

import typings.gliderJs.mod.Selector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Next extends js.Object {
  
  var next: Selector | Null = js.native
  
  var prev: Selector | Null = js.native
}
object Next {
  
  @scala.inline
  def apply(): Next = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Next]
  }
  
  @scala.inline
  implicit class NextOps[Self <: Next] (val x: Self) extends AnyVal {
    
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
    def setNext(value: Selector): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextNull: Self = this.set("next", null)
    
    @scala.inline
    def setPrev(value: Selector): Self = this.set("prev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevNull: Self = this.set("prev", null)
  }
}
