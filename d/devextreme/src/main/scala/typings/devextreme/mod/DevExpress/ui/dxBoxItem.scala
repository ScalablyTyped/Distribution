package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxBoxItem extends CollectionWidgetItem {
  
  /**
    * [descr:dxBoxItem.baseSize]
    */
  var baseSize: js.UndefOr[Double | auto] = js.native
  
  /**
    * [descr:dxBoxItem.box]
    */
  var box: js.UndefOr[dxBoxOptions] = js.native
  
  /**
    * [descr:dxBoxItem.ratio]
    */
  var ratio: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxBoxItem.shrink]
    */
  var shrink: js.UndefOr[Double] = js.native
}
object dxBoxItem {
  
  @scala.inline
  def apply(): dxBoxItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxBoxItem]
  }
  
  @scala.inline
  implicit class dxBoxItemOps[Self <: dxBoxItem] (val x: Self) extends AnyVal {
    
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
    def setBaseSize(value: Double | auto): Self = this.set("baseSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseSize: Self = this.set("baseSize", js.undefined)
    
    @scala.inline
    def setBox(value: dxBoxOptions): Self = this.set("box", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBox: Self = this.set("box", js.undefined)
    
    @scala.inline
    def setRatio(value: Double): Self = this.set("ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRatio: Self = this.set("ratio", js.undefined)
    
    @scala.inline
    def setShrink(value: Double): Self = this.set("shrink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShrink: Self = this.set("shrink", js.undefined)
  }
}
