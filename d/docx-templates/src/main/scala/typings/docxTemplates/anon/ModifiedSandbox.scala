package typings.docxTemplates.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifiedSandbox extends js.Object {
  
  var modifiedSandbox: js.Object = js.native
  
  var result: js.Any = js.native
}
object ModifiedSandbox {
  
  @scala.inline
  def apply(modifiedSandbox: js.Object, result: js.Any): ModifiedSandbox = {
    val __obj = js.Dynamic.literal(modifiedSandbox = modifiedSandbox.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifiedSandbox]
  }
  
  @scala.inline
  implicit class ModifiedSandboxOps[Self <: ModifiedSandbox] (val x: Self) extends AnyVal {
    
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
    def setModifiedSandbox(value: js.Object): Self = this.set("modifiedSandbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: js.Any): Self = this.set("result", value.asInstanceOf[js.Any])
  }
}
