package typings.ejDotWebDotAll.ej.RTE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportToPdfSettings extends js.Object {
  /** Specifies the file name for the exported pdf file.
    */
  var fileName: js.UndefOr[String] = js.undefined
  /** This API is used to receive the server-side handler for export related operations.
    */
  var url: js.UndefOr[String] = js.undefined
}

object ExportToPdfSettings {
  @scala.inline
  def apply(fileName: String = null, url: String = null): ExportToPdfSettings = {
    val __obj = js.Dynamic.literal()
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ExportToPdfSettings]
  }
}

