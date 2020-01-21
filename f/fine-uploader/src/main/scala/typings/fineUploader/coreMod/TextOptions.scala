package typings.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextOptions extends js.Object {
  /**
    * In the event of non-200 response from the server sans the 'error' property, this message will be passed to the 'error' event handler
    *
    * @default `'Upload failure reason unknown'`
    */
  var defaultResponseError: js.UndefOr[String] = js.undefined
  /**
    * The value for the `title` attribute attached to the `<input type="file">` maintained by Fine Uploader for each upload button.
    *
    * This is used as hover text, among other things.
    *
    * @default `'file input'`
    */
  var fileInputTitle: js.UndefOr[String] = js.undefined
  /**
    * Symbols used to represent file size, in ascending order
    *
    * @default `['kB', 'MB', 'GB', 'TB', 'PB', 'EB']`
    */
  var sizeSymbols: js.UndefOr[js.Array[String]] = js.undefined
}

object TextOptions {
  @scala.inline
  def apply(
    defaultResponseError: String = null,
    fileInputTitle: String = null,
    sizeSymbols: js.Array[String] = null
  ): TextOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultResponseError != null) __obj.updateDynamic("defaultResponseError")(defaultResponseError.asInstanceOf[js.Any])
    if (fileInputTitle != null) __obj.updateDynamic("fileInputTitle")(fileInputTitle.asInstanceOf[js.Any])
    if (sizeSymbols != null) __obj.updateDynamic("sizeSymbols")(sizeSymbols.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextOptions]
  }
}

