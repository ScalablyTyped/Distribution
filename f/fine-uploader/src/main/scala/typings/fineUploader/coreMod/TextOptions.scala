package typings.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextOptions extends js.Object {
  
  /**
    * In the event of non-200 response from the server sans the 'error' property, this message will be passed to the 'error' event handler
    *
    * @default `'Upload failure reason unknown'`
    */
  var defaultResponseError: js.UndefOr[String] = js.native
  
  /**
    * The value for the `title` attribute attached to the `<input type="file">` maintained by Fine Uploader for each upload button.
    *
    * This is used as hover text, among other things.
    *
    * @default `'file input'`
    */
  var fileInputTitle: js.UndefOr[String] = js.native
  
  /**
    * Symbols used to represent file size, in ascending order
    *
    * @default `['kB', 'MB', 'GB', 'TB', 'PB', 'EB']`
    */
  var sizeSymbols: js.UndefOr[js.Array[String]] = js.native
}
object TextOptions {
  
  @scala.inline
  def apply(): TextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextOptions]
  }
  
  @scala.inline
  implicit class TextOptionsOps[Self <: TextOptions] (val x: Self) extends AnyVal {
    
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
    def setDefaultResponseError(value: String): Self = this.set("defaultResponseError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultResponseError: Self = this.set("defaultResponseError", js.undefined)
    
    @scala.inline
    def setFileInputTitle(value: String): Self = this.set("fileInputTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileInputTitle: Self = this.set("fileInputTitle", js.undefined)
    
    @scala.inline
    def setSizeSymbolsVarargs(value: String*): Self = this.set("sizeSymbols", js.Array(value :_*))
    
    @scala.inline
    def setSizeSymbols(value: js.Array[String]): Self = this.set("sizeSymbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeSymbols: Self = this.set("sizeSymbols", js.undefined)
  }
}
