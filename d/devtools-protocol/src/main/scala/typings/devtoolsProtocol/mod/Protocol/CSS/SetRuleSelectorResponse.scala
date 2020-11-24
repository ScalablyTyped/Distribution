package typings.devtoolsProtocol.mod.Protocol.CSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetRuleSelectorResponse extends js.Object {
  
  /**
    * The resulting selector list after modification.
    */
  var selectorList: SelectorList = js.native
}
object SetRuleSelectorResponse {
  
  @scala.inline
  def apply(selectorList: SelectorList): SetRuleSelectorResponse = {
    val __obj = js.Dynamic.literal(selectorList = selectorList.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetRuleSelectorResponse]
  }
  
  @scala.inline
  implicit class SetRuleSelectorResponseOps[Self <: SetRuleSelectorResponse] (val x: Self) extends AnyVal {
    
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
    def setSelectorList(value: SelectorList): Self = this.set("selectorList", value.asInstanceOf[js.Any])
  }
}
