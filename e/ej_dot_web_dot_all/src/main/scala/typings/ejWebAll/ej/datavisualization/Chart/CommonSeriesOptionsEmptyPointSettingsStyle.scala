package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonSeriesOptionsEmptyPointSettingsStyle extends js.Object {
  
  /** Options for customizing border of the empty point in the series.
    */
  var border: js.UndefOr[CommonSeriesOptionsEmptyPointSettingsStyleBorder] = js.native
  
  /** Color of the empty point.
    */
  var color: js.UndefOr[String] = js.native
}
object CommonSeriesOptionsEmptyPointSettingsStyle {
  
  @scala.inline
  def apply(): CommonSeriesOptionsEmptyPointSettingsStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonSeriesOptionsEmptyPointSettingsStyle]
  }
  
  @scala.inline
  implicit class CommonSeriesOptionsEmptyPointSettingsStyleOps[Self <: CommonSeriesOptionsEmptyPointSettingsStyle] (val x: Self) extends AnyVal {
    
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
    def setBorder(value: CommonSeriesOptionsEmptyPointSettingsStyleBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
  }
}
