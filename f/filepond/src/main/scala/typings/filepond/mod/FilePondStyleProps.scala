package typings.filepond.mod

import typings.filepond.filepondStrings.circle
import typings.filepond.filepondStrings.compact
import typings.filepond.filepondStrings.integrated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilePondStyleProps extends js.Object {
  
  /**
    * The position of the remove item button.
    * @default 'right'
    */
  var styleButtonProcessItemPosition: js.UndefOr[String] = js.native
  
  /**
    * Enable to align the remove button to the left side of the file item.
    * @default false
    */
  var styleButtonRemoveItemAlign: js.UndefOr[Boolean] = js.native
  
  /**
    * The position of the remove item button.
    * @default 'left'
    */
  var styleButtonRemoveItemPosition: js.UndefOr[String] = js.native
  
  /**
    * Set a forced aspect ratio for the file items.
    *
    * Useful when rendering cropped or fixed aspect ratio images in grid view.
    * @default null
    */
  var styleItemPanelAspectRatio: js.UndefOr[String | Null] = js.native
  
  /**
    * The position of the load indicator.
    * @default 'right'
    */
  var styleLoadIndicatorPosition: js.UndefOr[String] = js.native
  
  /**
    * Set a forced aspect ratio for the FilePond drop area.
    *
    * Accepts human readable aspect ratios like `1:1` or numeric aspect ratios like `0.75`.
    * @default null
    */
  var stylePanelAspectRatio: js.UndefOr[String | Null] = js.native
  
  /**
    * Set a different layout render mode.
    * @default null
    */
  var stylePanelLayout: js.UndefOr[integrated | compact | circle | Null] = js.native
  
  /**
    * The position of the progress indicator.
    * @default 'right'
    */
  var styleProgressIndicatorPosition: js.UndefOr[String] = js.native
}
object FilePondStyleProps {
  
  @scala.inline
  def apply(): FilePondStyleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilePondStyleProps]
  }
  
  @scala.inline
  implicit class FilePondStylePropsOps[Self <: FilePondStyleProps] (val x: Self) extends AnyVal {
    
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
    def setStyleButtonProcessItemPosition(value: String): Self = this.set("styleButtonProcessItemPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleButtonProcessItemPosition: Self = this.set("styleButtonProcessItemPosition", js.undefined)
    
    @scala.inline
    def setStyleButtonRemoveItemAlign(value: Boolean): Self = this.set("styleButtonRemoveItemAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleButtonRemoveItemAlign: Self = this.set("styleButtonRemoveItemAlign", js.undefined)
    
    @scala.inline
    def setStyleButtonRemoveItemPosition(value: String): Self = this.set("styleButtonRemoveItemPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleButtonRemoveItemPosition: Self = this.set("styleButtonRemoveItemPosition", js.undefined)
    
    @scala.inline
    def setStyleItemPanelAspectRatio(value: String): Self = this.set("styleItemPanelAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleItemPanelAspectRatio: Self = this.set("styleItemPanelAspectRatio", js.undefined)
    
    @scala.inline
    def setStyleItemPanelAspectRatioNull: Self = this.set("styleItemPanelAspectRatio", null)
    
    @scala.inline
    def setStyleLoadIndicatorPosition(value: String): Self = this.set("styleLoadIndicatorPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleLoadIndicatorPosition: Self = this.set("styleLoadIndicatorPosition", js.undefined)
    
    @scala.inline
    def setStylePanelAspectRatio(value: String): Self = this.set("stylePanelAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStylePanelAspectRatio: Self = this.set("stylePanelAspectRatio", js.undefined)
    
    @scala.inline
    def setStylePanelAspectRatioNull: Self = this.set("stylePanelAspectRatio", null)
    
    @scala.inline
    def setStylePanelLayout(value: integrated | compact | circle): Self = this.set("stylePanelLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStylePanelLayout: Self = this.set("stylePanelLayout", js.undefined)
    
    @scala.inline
    def setStylePanelLayoutNull: Self = this.set("stylePanelLayout", null)
    
    @scala.inline
    def setStyleProgressIndicatorPosition(value: String): Self = this.set("styleProgressIndicatorPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleProgressIndicatorPosition: Self = this.set("styleProgressIndicatorPosition", js.undefined)
  }
}
