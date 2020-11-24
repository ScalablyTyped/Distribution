package typings.devextreme.anon

import typings.devextreme.devextremeStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowedPageSizes extends js.Object {
  
  var allowedPageSizes: js.UndefOr[js.Array[Double] | auto] = js.native
  
  var infoText: js.UndefOr[String] = js.native
  
  var showInfo: js.UndefOr[Boolean] = js.native
  
  var showNavigationButtons: js.UndefOr[Boolean] = js.native
  
  var showPageSizeSelector: js.UndefOr[Boolean] = js.native
  
  var visible: js.UndefOr[Boolean | auto] = js.native
}
object AllowedPageSizes {
  
  @scala.inline
  def apply(): AllowedPageSizes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowedPageSizes]
  }
  
  @scala.inline
  implicit class AllowedPageSizesOps[Self <: AllowedPageSizes] (val x: Self) extends AnyVal {
    
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
    def setAllowedPageSizesVarargs(value: Double*): Self = this.set("allowedPageSizes", js.Array(value :_*))
    
    @scala.inline
    def setAllowedPageSizes(value: js.Array[Double] | auto): Self = this.set("allowedPageSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedPageSizes: Self = this.set("allowedPageSizes", js.undefined)
    
    @scala.inline
    def setInfoText(value: String): Self = this.set("infoText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfoText: Self = this.set("infoText", js.undefined)
    
    @scala.inline
    def setShowInfo(value: Boolean): Self = this.set("showInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowInfo: Self = this.set("showInfo", js.undefined)
    
    @scala.inline
    def setShowNavigationButtons(value: Boolean): Self = this.set("showNavigationButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowNavigationButtons: Self = this.set("showNavigationButtons", js.undefined)
    
    @scala.inline
    def setShowPageSizeSelector(value: Boolean): Self = this.set("showPageSizeSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPageSizeSelector: Self = this.set("showPageSizeSelector", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean | auto): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
