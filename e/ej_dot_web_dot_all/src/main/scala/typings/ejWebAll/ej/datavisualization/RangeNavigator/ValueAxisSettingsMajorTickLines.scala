package typings.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueAxisSettingsMajorTickLines extends js.Object {
  
  /** Specifies the size of the majorTickLines in range navigator
    * @Default {0}
    */
  var size: js.UndefOr[Double] = js.native
  
  /** Toggles the visibility of major tick lines.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
  
  /** Specifies width of the major tick lines.
    * @Default {0}
    */
  var width: js.UndefOr[Double] = js.native
}
object ValueAxisSettingsMajorTickLines {
  
  @scala.inline
  def apply(): ValueAxisSettingsMajorTickLines = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueAxisSettingsMajorTickLines]
  }
  
  @scala.inline
  implicit class ValueAxisSettingsMajorTickLinesOps[Self <: ValueAxisSettingsMajorTickLines] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
