package typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BigQueryModelTraining extends js.Object {
  var currentIteration: js.UndefOr[Double] = js.undefined
  var expectedTotalIterations: js.UndefOr[String] = js.undefined
}

object BigQueryModelTraining {
  @scala.inline
  def apply(currentIteration: js.UndefOr[Double] = js.undefined, expectedTotalIterations: String = null): BigQueryModelTraining = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(currentIteration)) __obj.updateDynamic("currentIteration")(currentIteration.get.asInstanceOf[js.Any])
    if (expectedTotalIterations != null) __obj.updateDynamic("expectedTotalIterations")(expectedTotalIterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[BigQueryModelTraining]
  }
}

