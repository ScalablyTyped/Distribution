package typings.ejWebAll.ej.RTE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportToWordSettings extends js.Object {
  /** Specifies the file name for the exported word file.
    */
  var fileName: js.UndefOr[String] = js.undefined
  /** This API is used to receive the server-side handler for export related operations.
    */
  var url: js.UndefOr[String] = js.undefined
}

object ExportToWordSettings {
  @scala.inline
  def apply(fileName: String = null, url: String = null): ExportToWordSettings = {
    val __obj = js.Dynamic.literal()
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportToWordSettings]
  }
}

