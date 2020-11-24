package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowFieldDragging extends js.Object {
  
  var allowFieldDragging: js.UndefOr[Boolean] = js.native
  
  var showColumnFields: js.UndefOr[Boolean] = js.native
  
  var showDataFields: js.UndefOr[Boolean] = js.native
  
  var showFilterFields: js.UndefOr[Boolean] = js.native
  
  var showRowFields: js.UndefOr[Boolean] = js.native
  
  var texts: js.UndefOr[ColumnFieldArea] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object AllowFieldDragging {
  
  @scala.inline
  def apply(): AllowFieldDragging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowFieldDragging]
  }
  
  @scala.inline
  implicit class AllowFieldDraggingOps[Self <: AllowFieldDragging] (val x: Self) extends AnyVal {
    
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
    def setAllowFieldDragging(value: Boolean): Self = this.set("allowFieldDragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowFieldDragging: Self = this.set("allowFieldDragging", js.undefined)
    
    @scala.inline
    def setShowColumnFields(value: Boolean): Self = this.set("showColumnFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowColumnFields: Self = this.set("showColumnFields", js.undefined)
    
    @scala.inline
    def setShowDataFields(value: Boolean): Self = this.set("showDataFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDataFields: Self = this.set("showDataFields", js.undefined)
    
    @scala.inline
    def setShowFilterFields(value: Boolean): Self = this.set("showFilterFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFilterFields: Self = this.set("showFilterFields", js.undefined)
    
    @scala.inline
    def setShowRowFields(value: Boolean): Self = this.set("showRowFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRowFields: Self = this.set("showRowFields", js.undefined)
    
    @scala.inline
    def setTexts(value: ColumnFieldArea): Self = this.set("texts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTexts: Self = this.set("texts", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
