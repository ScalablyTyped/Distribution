package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationInfoForProtocolReturnValue extends js.Object {
  
  /**
    * the display icon of the app handling the protocol.
    */
  var icon: NativeImage_ = js.native
  
  /**
    * display name of the app handling the protocol.
    */
  var name: String = js.native
  
  /**
    * installation path of the app handling the protocol.
    */
  var path: String = js.native
}
object ApplicationInfoForProtocolReturnValue {
  
  @scala.inline
  def apply(icon: NativeImage_, name: String, path: String): ApplicationInfoForProtocolReturnValue = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationInfoForProtocolReturnValue]
  }
  
  @scala.inline
  implicit class ApplicationInfoForProtocolReturnValueOps[Self <: ApplicationInfoForProtocolReturnValue] (val x: Self) extends AnyVal {
    
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
    def setIcon(value: NativeImage_): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
  }
}
