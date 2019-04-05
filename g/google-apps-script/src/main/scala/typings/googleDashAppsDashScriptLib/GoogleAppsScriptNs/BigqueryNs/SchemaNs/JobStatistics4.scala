package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobStatistics4 extends js.Object {
  var destinationUriFileCounts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var inputBytes: js.UndefOr[java.lang.String] = js.undefined
}

object JobStatistics4 {
  @scala.inline
  def apply(destinationUriFileCounts: js.Array[java.lang.String] = null, inputBytes: java.lang.String = null): JobStatistics4 = {
    val __obj = js.Dynamic.literal()
    if (destinationUriFileCounts != null) __obj.updateDynamic("destinationUriFileCounts")(destinationUriFileCounts)
    if (inputBytes != null) __obj.updateDynamic("inputBytes")(inputBytes)
    __obj.asInstanceOf[JobStatistics4]
  }
}

