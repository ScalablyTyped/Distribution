package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobStatistics3 extends js.Object {
  var badRecords: js.UndefOr[java.lang.String] = js.undefined
  var inputFileBytes: js.UndefOr[java.lang.String] = js.undefined
  var inputFiles: js.UndefOr[java.lang.String] = js.undefined
  var outputBytes: js.UndefOr[java.lang.String] = js.undefined
  var outputRows: js.UndefOr[java.lang.String] = js.undefined
}

object JobStatistics3 {
  @scala.inline
  def apply(
    badRecords: java.lang.String = null,
    inputFileBytes: java.lang.String = null,
    inputFiles: java.lang.String = null,
    outputBytes: java.lang.String = null,
    outputRows: java.lang.String = null
  ): JobStatistics3 = {
    val __obj = js.Dynamic.literal()
    if (badRecords != null) __obj.updateDynamic("badRecords")(badRecords)
    if (inputFileBytes != null) __obj.updateDynamic("inputFileBytes")(inputFileBytes)
    if (inputFiles != null) __obj.updateDynamic("inputFiles")(inputFiles)
    if (outputBytes != null) __obj.updateDynamic("outputBytes")(outputBytes)
    if (outputRows != null) __obj.updateDynamic("outputRows")(outputRows)
    __obj.asInstanceOf[JobStatistics3]
  }
}

