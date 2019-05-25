package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportingOptions extends js.Object {
  /** Pass the url to import manually
    */
  var Url: js.UndefOr[java.lang.String] = js.undefined
  /** Pass the file to import manually
    */
  var file: js.UndefOr[java.lang.String] = js.undefined
  /** Pass the file stream to import manually
    */
  var fileStream: js.UndefOr[java.lang.String] = js.undefined
  /** Pass the filetype to import manually
    */
  var fileType: js.UndefOr[java.lang.String] = js.undefined
  /** Pass the password to import manually
    */
  var password: js.UndefOr[java.lang.String] = js.undefined
}

object ImportingOptions {
  @scala.inline
  def apply(
    Url: java.lang.String = null,
    file: java.lang.String = null,
    fileStream: java.lang.String = null,
    fileType: java.lang.String = null,
    password: java.lang.String = null
  ): ImportingOptions = {
    val __obj = js.Dynamic.literal()
    if (Url != null) __obj.updateDynamic("Url")(Url)
    if (file != null) __obj.updateDynamic("file")(file)
    if (fileStream != null) __obj.updateDynamic("fileStream")(fileStream)
    if (fileType != null) __obj.updateDynamic("fileType")(fileType)
    if (password != null) __obj.updateDynamic("password")(password)
    __obj.asInstanceOf[ImportingOptions]
  }
}

