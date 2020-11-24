package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.ComponentElementEventModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxProgressBarOptions extends dxTrackBarOptions[dxProgressBar] {
  
  /**
    * [descr:dxProgressBar.Options.onComplete]
    */
  var onComplete: js.UndefOr[js.Function1[/* e */ ComponentElementEventModel, _]] = js.native
  
  /**
    * [descr:dxProgressBar.Options.showStatus]
    */
  var showStatus: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxProgressBar.Options.statusFormat]
    */
  var statusFormat: js.UndefOr[String | (js.Function2[/* ratio */ Double, /* value */ Double, String])] = js.native
  
  /**
    * [descr:dxProgressBar.Options.value]
    */
  @JSName("value")
  var value_dxProgressBarOptions: js.UndefOr[Double] = js.native
}
object dxProgressBarOptions {
  
  @scala.inline
  def apply(): dxProgressBarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxProgressBarOptions]
  }
  
  @scala.inline
  implicit class dxProgressBarOptionsOps[Self <: dxProgressBarOptions] (val x: Self) extends AnyVal {
    
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
    def setOnComplete(value: /* e */ ComponentElementEventModel => _): Self = this.set("onComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    
    @scala.inline
    def setShowStatus(value: Boolean): Self = this.set("showStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowStatus: Self = this.set("showStatus", js.undefined)
    
    @scala.inline
    def setStatusFormatFunction2(value: (/* ratio */ Double, /* value */ Double) => String): Self = this.set("statusFormat", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStatusFormat(value: String | (js.Function2[/* ratio */ Double, /* value */ Double, String])): Self = this.set("statusFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusFormat: Self = this.set("statusFormat", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
