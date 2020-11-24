package typings.electronProgressbar.mod

import typings.electron.Electron.BrowserWindowConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressBarOptions extends js.Object {
  
  var abortOnError: js.UndefOr[Boolean] = js.native
  
  var browserWindow: js.UndefOr[BrowserWindowConstructorOptions] = js.native
  
  var closeOnComplete: js.UndefOr[Boolean] = js.native
  
  var detail: js.UndefOr[String] = js.native
  
  var indeterminate: js.UndefOr[Boolean] = js.native
  
  var initialValue: js.UndefOr[Double] = js.native
  
  var maxValue: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[StyleOptions] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object ProgressBarOptions {
  
  @scala.inline
  def apply(): ProgressBarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressBarOptions]
  }
  
  @scala.inline
  implicit class ProgressBarOptionsOps[Self <: ProgressBarOptions] (val x: Self) extends AnyVal {
    
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
    def setAbortOnError(value: Boolean): Self = this.set("abortOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbortOnError: Self = this.set("abortOnError", js.undefined)
    
    @scala.inline
    def setBrowserWindow(value: BrowserWindowConstructorOptions): Self = this.set("browserWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowserWindow: Self = this.set("browserWindow", js.undefined)
    
    @scala.inline
    def setCloseOnComplete(value: Boolean): Self = this.set("closeOnComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnComplete: Self = this.set("closeOnComplete", js.undefined)
    
    @scala.inline
    def setDetail(value: String): Self = this.set("detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
    
    @scala.inline
    def setIndeterminate(value: Boolean): Self = this.set("indeterminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndeterminate: Self = this.set("indeterminate", js.undefined)
    
    @scala.inline
    def setInitialValue(value: Double): Self = this.set("initialValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialValue: Self = this.set("initialValue", js.undefined)
    
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleOptions): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
