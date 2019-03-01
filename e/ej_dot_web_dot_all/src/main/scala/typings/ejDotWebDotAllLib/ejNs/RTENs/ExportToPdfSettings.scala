package typings
package ejDotWebDotAllLib.ejNs.RTENs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportToPdfSettings extends js.Object {
  /** Specifies the file name for the exported pdf file.
    */
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  /** This API is used to receive the server-side handler for export related operations.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object ExportToPdfSettings {
  @scala.inline
  def apply(fileName: java.lang.String = null, url: java.lang.String = null): ExportToPdfSettings = {
    val __obj = js.Dynamic.literal()
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ExportToPdfSettings]
  }
}

