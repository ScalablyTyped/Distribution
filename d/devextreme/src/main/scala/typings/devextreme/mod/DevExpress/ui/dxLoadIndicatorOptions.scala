package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxLoadIndicatorOptions extends WidgetOptions[dxLoadIndicator] {
  
  /**
    * [descr:dxLoadIndicator.Options.indicatorSrc]
    */
  var indicatorSrc: js.UndefOr[String] = js.native
}
object dxLoadIndicatorOptions {
  
  @scala.inline
  def apply(): dxLoadIndicatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxLoadIndicatorOptions]
  }
  
  @scala.inline
  implicit class dxLoadIndicatorOptionsOps[Self <: dxLoadIndicatorOptions] (val x: Self) extends AnyVal {
    
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
    def setIndicatorSrc(value: String): Self = this.set("indicatorSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicatorSrc: Self = this.set("indicatorSrc", js.undefined)
  }
}
