package typings.fineUploader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIFailedUploadTextDisplay extends js.Object {
  
  /**
    * Enable or disable a tooltip that will display the full contents of the error message when the mouse pointer hovers over the failed item.
    *
    * @default `true`
    */
  var enableTooltip: js.UndefOr[Boolean] = js.native
  
  /**
    * Set the message to display next to each failed file.
    *
    * One of: 'default' which displays the failedUploadText, 'custom' which displays the error response from the server, or 'none' which displays no text
    *
    * @default `'default'`
    */
  var mode: js.UndefOr[String] = js.native
  
  /**
    * The property from the server response that contains the error text to display next to a failed item. Ignored unless `mode` is `'custom'`
    *
    * @default `'error'`
    */
  var responseProperty: js.UndefOr[String] = js.native
}
object UIFailedUploadTextDisplay {
  
  @scala.inline
  def apply(): UIFailedUploadTextDisplay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIFailedUploadTextDisplay]
  }
  
  @scala.inline
  implicit class UIFailedUploadTextDisplayOps[Self <: UIFailedUploadTextDisplay] (val x: Self) extends AnyVal {
    
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
    def setEnableTooltip(value: Boolean): Self = this.set("enableTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableTooltip: Self = this.set("enableTooltip", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setResponseProperty(value: String): Self = this.set("responseProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseProperty: Self = this.set("responseProperty", js.undefined)
  }
}
