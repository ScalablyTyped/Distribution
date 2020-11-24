package typings.firefoxWebextBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DuplicateDuplicateProperties extends js.Object {
  
  /**
    * Whether the tab should become the active tab in the window. Does not affect whether the window is focused (see `windows.update`). Defaults to `true`.
    */
  var active: js.UndefOr[Boolean] = js.native
  
  /**
    * The position the new tab should take in the window. The provided value will be clamped to between zero and the number of tabs in the window.
    */
  var index: js.UndefOr[Double] = js.native
}
object DuplicateDuplicateProperties {
  
  @scala.inline
  def apply(): DuplicateDuplicateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DuplicateDuplicateProperties]
  }
  
  @scala.inline
  implicit class DuplicateDuplicatePropertiesOps[Self <: DuplicateDuplicateProperties] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
  }
}
