package typings.fineUploader.azureMod.azure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AzureFailedUploadTextDisplayOptions extends js.Object {
  
  /**
    * You will most likely want to keep this at the default value of 'custom'. See the UI options documentation for more info on this option.
    *
    * @default `'custom'`
    */
  var mode: js.UndefOr[String] = js.native
}
object AzureFailedUploadTextDisplayOptions {
  
  @scala.inline
  def apply(): AzureFailedUploadTextDisplayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AzureFailedUploadTextDisplayOptions]
  }
  
  @scala.inline
  implicit class AzureFailedUploadTextDisplayOptionsOps[Self <: AzureFailedUploadTextDisplayOptions] (val x: Self) extends AnyVal {
    
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
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
}
