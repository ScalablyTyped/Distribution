package typings.firefoxWebextBrowser.browser.management

import typings.firefoxWebextBrowser.browser.manifest.ExtensionID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstallReturnResult extends js.Object {
  
  var id: ExtensionID = js.native
}
object InstallReturnResult {
  
  @scala.inline
  def apply(id: ExtensionID): InstallReturnResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallReturnResult]
  }
  
  @scala.inline
  implicit class InstallReturnResultOps[Self <: InstallReturnResult] (val x: Self) extends AnyVal {
    
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
    def setId(value: ExtensionID): Self = this.set("id", value.asInstanceOf[js.Any])
  }
}
