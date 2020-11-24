package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptionSettingsIndicatorSymbolSize extends js.Object {
  
  /** Specifies the height of indicator symbol.
    * @Default {10}
    */
  var height: js.UndefOr[Double] = js.native
  
  /** Specifies the width of indicator symbol.
    * @Default {10}
    */
  var width: js.UndefOr[Double] = js.native
}
object CaptionSettingsIndicatorSymbolSize {
  
  @scala.inline
  def apply(): CaptionSettingsIndicatorSymbolSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionSettingsIndicatorSymbolSize]
  }
  
  @scala.inline
  implicit class CaptionSettingsIndicatorSymbolSizeOps[Self <: CaptionSettingsIndicatorSymbolSize] (val x: Self) extends AnyVal {
    
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
