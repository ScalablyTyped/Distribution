package typings.dwt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoToThumbnail extends js.Object {
  
  // Example: '#0000ff',
  var goToThumbnail: js.UndefOr[Boolean] = js.native
  
  var iconClass: js.UndefOr[String] = js.native
  
  // Example: 'icon-tree',
  var selectedColor: js.UndefOr[String] = js.native
  
  var visibility: js.UndefOr[Boolean] = js.native
}
object GoToThumbnail {
  
  @scala.inline
  def apply(): GoToThumbnail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoToThumbnail]
  }
  
  @scala.inline
  implicit class GoToThumbnailOps[Self <: GoToThumbnail] (val x: Self) extends AnyVal {
    
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
    def setGoToThumbnail(value: Boolean): Self = this.set("goToThumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoToThumbnail: Self = this.set("goToThumbnail", js.undefined)
    
    @scala.inline
    def setIconClass(value: String): Self = this.set("iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconClass: Self = this.set("iconClass", js.undefined)
    
    @scala.inline
    def setSelectedColor(value: String): Self = this.set("selectedColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedColor: Self = this.set("selectedColor", js.undefined)
    
    @scala.inline
    def setVisibility(value: Boolean): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
}
