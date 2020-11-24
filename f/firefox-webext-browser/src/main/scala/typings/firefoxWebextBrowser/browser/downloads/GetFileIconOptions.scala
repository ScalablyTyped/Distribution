package typings.firefoxWebextBrowser.browser.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFileIconOptions extends js.Object {
  
  /**
    * The size of the icon. The returned icon will be square with dimensions size * size pixels. The default size for the icon is 32x32 pixels.
    */
  var size: js.UndefOr[Double] = js.native
}
object GetFileIconOptions {
  
  @scala.inline
  def apply(): GetFileIconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFileIconOptions]
  }
  
  @scala.inline
  implicit class GetFileIconOptionsOps[Self <: GetFileIconOptions] (val x: Self) extends AnyVal {
    
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
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
