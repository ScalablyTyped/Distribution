package typings.dwt.webTwainViewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentView extends js.Object {
  
  /**
    * Specify the width of the major content view.
    */
  var Width: Double | String = js.native
  
  /**
    * Whether to show the content view or not.
    * If set to false, then only thumbnails view is shown.
    */
  var bShow: Boolean = js.native
}
object ContentView {
  
  @scala.inline
  def apply(Width: Double | String, bShow: Boolean): ContentView = {
    val __obj = js.Dynamic.literal(Width = Width.asInstanceOf[js.Any], bShow = bShow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentView]
  }
  
  @scala.inline
  implicit class ContentViewOps[Self <: ContentView] (val x: Self) extends AnyVal {
    
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
    def setWidth(value: Double | String): Self = this.set("Width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBShow(value: Boolean): Self = this.set("bShow", value.asInstanceOf[js.Any])
  }
}
