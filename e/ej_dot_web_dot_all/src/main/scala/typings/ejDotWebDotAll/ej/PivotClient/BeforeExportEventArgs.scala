package typings.ejDotWebDotAll.ej.PivotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeExportEventArgs extends js.Object {
  /** holds the name of the file to be exported.
    */
  var fileName: js.UndefOr[String] = js.undefined
  /** holds the url of the service method responsible for exporting the PivotClient control.
    */
  var url: js.UndefOr[String] = js.undefined
}

object BeforeExportEventArgs {
  @scala.inline
  def apply(fileName: String = null, url: String = null): BeforeExportEventArgs = {
    val __obj = js.Dynamic.literal()
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeExportEventArgs]
  }
}

