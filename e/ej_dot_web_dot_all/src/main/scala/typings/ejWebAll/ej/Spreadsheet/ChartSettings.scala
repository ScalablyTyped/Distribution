package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartSettings extends js.Object {
  
  /** Gets or sets a value that defines the chart height in Spreadsheet.
    * @Default {220}
    */
  var height: js.UndefOr[Double] = js.native
  
  /** Gets or sets a value that defines the chart width in the Spreadsheet.
    * @Default {440}
    */
  var width: js.UndefOr[Double] = js.native
}
object ChartSettings {
  
  @scala.inline
  def apply(): ChartSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSettings]
  }
  
  @scala.inline
  implicit class ChartSettingsOps[Self <: ChartSettings] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
