package typings.fineUploader.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextOptions extends StObject {
  
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
  implicit class TextOptionsMutableBuilder[Self <: TextOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultResponseError(value: String): Self = StObject.set(x, "defaultResponseError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultResponseErrorUndefined: Self = StObject.set(x, "defaultResponseError", js.undefined)
    
    @scala.inline
    def setFileInputTitle(value: String): Self = StObject.set(x, "fileInputTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileInputTitleUndefined: Self = StObject.set(x, "fileInputTitle", js.undefined)
    
    @scala.inline
    def setSizeSymbols(value: js.Array[String]): Self = StObject.set(x, "sizeSymbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeSymbolsUndefined: Self = StObject.set(x, "sizeSymbols", js.undefined)
    
    @scala.inline
    def setSizeSymbolsVarargs(value: String*): Self = StObject.set(x, "sizeSymbols", js.Array(value :_*))
  }
}
