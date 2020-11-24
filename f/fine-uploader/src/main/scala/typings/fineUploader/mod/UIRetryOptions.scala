package typings.fineUploader.mod

import typings.fineUploader.coreMod.RetryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIRetryOptions extends RetryOptions {
  
  /**
    * The text of the note that will optionally appear next to the item during automatic retry attempts.
    *
    * Ignored if `showAutoRetryNote` is false.
    *
    * @default `'Retrying {retryNum}/{maxAuto} ...'`
    */
  var autoRetryNote: js.UndefOr[String] = js.native
  
  /**
    * Enable or disable a status message appearing next to the item during auto retry attempts
    *
    * @default `true`
    */
  var showAutoRetryNote: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable or disable the showing of a button/link next to the failed item after all retry attempts have been exhausted.
    *
    * Clicking the button/link will force the uploader to make another attempt
    *
    * @default `false`
    */
  var showButton: js.UndefOr[Boolean] = js.native
}
object UIRetryOptions {
  
  @scala.inline
  def apply(): UIRetryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIRetryOptions]
  }
  
  @scala.inline
  implicit class UIRetryOptionsOps[Self <: UIRetryOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoRetryNote(value: String): Self = this.set("autoRetryNote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoRetryNote: Self = this.set("autoRetryNote", js.undefined)
    
    @scala.inline
    def setShowAutoRetryNote(value: Boolean): Self = this.set("showAutoRetryNote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowAutoRetryNote: Self = this.set("showAutoRetryNote", js.undefined)
    
    @scala.inline
    def setShowButton(value: Boolean): Self = this.set("showButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowButton: Self = this.set("showButton", js.undefined)
  }
}
