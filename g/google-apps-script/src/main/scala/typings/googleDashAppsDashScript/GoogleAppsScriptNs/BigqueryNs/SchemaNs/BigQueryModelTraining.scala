package typings.googleDashAppsDashScript.GoogleAppsScriptNs.BigqueryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BigQueryModelTraining extends js.Object {
  var currentIteration: js.UndefOr[Double] = js.undefined
  var expectedTotalIterations: js.UndefOr[String] = js.undefined
}

object BigQueryModelTraining {
  @scala.inline
  def apply(currentIteration: Int | Double = null, expectedTotalIterations: String = null): BigQueryModelTraining = {
    val __obj = js.Dynamic.literal()
    if (currentIteration != null) __obj.updateDynamic("currentIteration")(currentIteration.asInstanceOf[js.Any])
    if (expectedTotalIterations != null) __obj.updateDynamic("expectedTotalIterations")(expectedTotalIterations)
    __obj.asInstanceOf[BigQueryModelTraining]
  }
}

