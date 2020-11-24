package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.`object`
import typings.devextreme.devextremeStrings.asc
import typings.devextreme.devextremeStrings.boolean_
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.date
import typings.devextreme.devextremeStrings.datetime
import typings.devextreme.devextremeStrings.desc
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.number
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.string_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxFileManagerDetailsColumn extends js.Object {
  
  /**
    * [descr:dxFileManagerDetailsColumn.alignment]
    */
  var alignment: js.UndefOr[center | left | right] = js.native
  
  /**
    * [descr:dxFileManagerDetailsColumn.caption]
    */
  var caption: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxFileManagerDetailsColumn.cssClass]
    */
  var cssClass: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxFileManagerDetailsColumn.dataField]
    */
  var dataField: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxFileManagerDetailsColumn.dataType]
    */
  var dataType: js.UndefOr[string_ | number | date | boolean_ | `object` | datetime] = js.native
  
  /**
    * [descr:dxFileManagerDetailsColumn.hidingPriority]
    */
  var hidingPriority: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxFileManagerDetailsColumn.sortIndex]
    */
  var sortIndex: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxFileManagerDetailsColumn.sortOrder]
    */
  var sortOrder: js.UndefOr[asc | desc] = js.native
  
  /**
    * [descr:dxFileManagerDetailsColumn.visible]
    */
  var visible: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxFileManagerDetailsColumn.visibleIndex]
    */
  var visibleIndex: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxFileManagerDetailsColumn.width]
    */
  var width: js.UndefOr[Double | String] = js.native
}
object dxFileManagerDetailsColumn {
  
  @scala.inline
  def apply(): dxFileManagerDetailsColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFileManagerDetailsColumn]
  }
  
  @scala.inline
  implicit class dxFileManagerDetailsColumnOps[Self <: dxFileManagerDetailsColumn] (val x: Self) extends AnyVal {
    
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
    def setAlignment(value: center | left | right): Self = this.set("alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setDataField(value: String): Self = this.set("dataField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataField: Self = this.set("dataField", js.undefined)
    
    @scala.inline
    def setDataType(value: string_ | number | date | boolean_ | `object` | datetime): Self = this.set("dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    
    @scala.inline
    def setHidingPriority(value: Double): Self = this.set("hidingPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidingPriority: Self = this.set("hidingPriority", js.undefined)
    
    @scala.inline
    def setSortIndex(value: Double): Self = this.set("sortIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortIndex: Self = this.set("sortIndex", js.undefined)
    
    @scala.inline
    def setSortOrder(value: asc | desc): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setVisibleIndex(value: Double): Self = this.set("visibleIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleIndex: Self = this.set("visibleIndex", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
