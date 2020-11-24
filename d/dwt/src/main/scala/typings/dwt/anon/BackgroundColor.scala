package typings.dwt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundColor extends js.Object {
  
  // Example: 'pink'
  var backgroundColor: js.UndefOr[String] = js.native
  
  // Example: 'yellow'
  var blockBackgroundColor: js.UndefOr[String] = js.native
  
  // Example: 'gray'
  var hoverBackgroundColor: js.UndefOr[String] = js.native
  
  // Example: '#c4faf8'
  var hoverBorderColor: js.UndefOr[String] = js.native
  
  var iconClass: js.UndefOr[String] = js.native
  
  // Example: 'rgb(127, 133, 251)'
  var imageBackgroundColor: js.UndefOr[String] = js.native
  
  // Example: 'transparent'
  var imageBorderColor: js.UndefOr[String] = js.native
  
  // Example: 'rgba(67, 66, 70, 1)'
  var imageSpace: js.UndefOr[Double] = js.native
  
  var mouseShape: js.UndefOr[String] = js.native
  
  // Example: 'red'
  var selectedBackgroundColor: js.UndefOr[String] = js.native
  
  // Example: 'icon-thumbnail'
  var selectedBorderColor: js.UndefOr[String] = js.native
  
   // Example: 10
  var showPageNumber: js.UndefOr[Boolean] = js.native
  
  var showThumbnailControl: js.UndefOr[Boolean] = js.native
  
  var visibility: js.UndefOr[Boolean] = js.native
}
object BackgroundColor {
  
  @scala.inline
  def apply(): BackgroundColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColor]
  }
  
  @scala.inline
  implicit class BackgroundColorOps[Self <: BackgroundColor] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBlockBackgroundColor(value: String): Self = this.set("blockBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockBackgroundColor: Self = this.set("blockBackgroundColor", js.undefined)
    
    @scala.inline
    def setHoverBackgroundColor(value: String): Self = this.set("hoverBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverBackgroundColor: Self = this.set("hoverBackgroundColor", js.undefined)
    
    @scala.inline
    def setHoverBorderColor(value: String): Self = this.set("hoverBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverBorderColor: Self = this.set("hoverBorderColor", js.undefined)
    
    @scala.inline
    def setIconClass(value: String): Self = this.set("iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconClass: Self = this.set("iconClass", js.undefined)
    
    @scala.inline
    def setImageBackgroundColor(value: String): Self = this.set("imageBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageBackgroundColor: Self = this.set("imageBackgroundColor", js.undefined)
    
    @scala.inline
    def setImageBorderColor(value: String): Self = this.set("imageBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageBorderColor: Self = this.set("imageBorderColor", js.undefined)
    
    @scala.inline
    def setImageSpace(value: Double): Self = this.set("imageSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageSpace: Self = this.set("imageSpace", js.undefined)
    
    @scala.inline
    def setMouseShape(value: String): Self = this.set("mouseShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseShape: Self = this.set("mouseShape", js.undefined)
    
    @scala.inline
    def setSelectedBackgroundColor(value: String): Self = this.set("selectedBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedBackgroundColor: Self = this.set("selectedBackgroundColor", js.undefined)
    
    @scala.inline
    def setSelectedBorderColor(value: String): Self = this.set("selectedBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedBorderColor: Self = this.set("selectedBorderColor", js.undefined)
    
    @scala.inline
    def setShowPageNumber(value: Boolean): Self = this.set("showPageNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPageNumber: Self = this.set("showPageNumber", js.undefined)
    
    @scala.inline
    def setShowThumbnailControl(value: Boolean): Self = this.set("showThumbnailControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowThumbnailControl: Self = this.set("showThumbnailControl", js.undefined)
    
    @scala.inline
    def setVisibility(value: Boolean): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
}
