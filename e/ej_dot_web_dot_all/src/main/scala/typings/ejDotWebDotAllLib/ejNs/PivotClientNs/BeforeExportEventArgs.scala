package typings
package ejDotWebDotAllLib.ejNs.PivotClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeExportEventArgs extends js.Object {
  /** holds the name of the file to be exported.
    */
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  /** holds the url of the service method responsible for exporting the PivotClient control.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object BeforeExportEventArgs {
  @scala.inline
  def apply(fileName: java.lang.String = null, url: java.lang.String = null): BeforeExportEventArgs = {
    val __obj = js.Dynamic.literal()
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[BeforeExportEventArgs]
  }
}

