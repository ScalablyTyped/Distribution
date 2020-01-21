package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportingOptions extends js.Object {
  /** Pass the url to import manually
    */
  var Url: js.UndefOr[String] = js.undefined
  /** Pass the file to import manually
    */
  var file: js.UndefOr[String] = js.undefined
  /** Pass the file stream to import manually
    */
  var fileStream: js.UndefOr[String] = js.undefined
  /** Pass the filetype to import manually
    */
  var fileType: js.UndefOr[String] = js.undefined
  /** Pass the password to import manually
    */
  var password: js.UndefOr[String] = js.undefined
}

object ImportingOptions {
  @scala.inline
  def apply(
    Url: String = null,
    file: String = null,
    fileStream: String = null,
    fileType: String = null,
    password: String = null
  ): ImportingOptions = {
    val __obj = js.Dynamic.literal()
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (fileStream != null) __obj.updateDynamic("fileStream")(fileStream.asInstanceOf[js.Any])
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportingOptions]
  }
}

