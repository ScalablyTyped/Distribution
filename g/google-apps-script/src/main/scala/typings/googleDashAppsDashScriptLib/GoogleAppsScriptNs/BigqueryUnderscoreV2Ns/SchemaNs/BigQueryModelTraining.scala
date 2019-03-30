package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BigQueryModelTraining extends js.Object {
  var currentIteration: js.UndefOr[scala.Double] = js.undefined
  var expectedTotalIterations: js.UndefOr[java.lang.String] = js.undefined
}

object BigQueryModelTraining {
  @scala.inline
  def apply(
    currentIteration: scala.Int | scala.Double = null,
    expectedTotalIterations: java.lang.String = null
  ): BigQueryModelTraining = {
    val __obj = js.Dynamic.literal()
    if (currentIteration != null) __obj.updateDynamic("currentIteration")(currentIteration.asInstanceOf[js.Any])
    if (expectedTotalIterations != null) __obj.updateDynamic("expectedTotalIterations")(expectedTotalIterations)
    __obj.asInstanceOf[BigQueryModelTraining]
  }
}

