package typings
package ejDotWebDotAllLib.ejNs.PivotChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeExportEventArgs extends js.Object {
  /** contains the name of the exporting file.
    */
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  /** contains the url of the service responsible for exporting.
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

