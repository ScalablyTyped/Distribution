package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Evaluation metrics for regression models.
  */
@js.native
trait SchemaRegressionMetrics extends js.Object {
  /**
    * Mean absolute error.
    */
  var meanAbsoluteError: js.UndefOr[Double] = js.native
  /**
    * Mean squared error.
    */
  var meanSquaredError: js.UndefOr[Double] = js.native
  /**
    * Mean squared log error.
    */
  var meanSquaredLogError: js.UndefOr[Double] = js.native
  /**
    * Median absolute error.
    */
  var medianAbsoluteError: js.UndefOr[Double] = js.native
  /**
    * R^2 score.
    */
  var rSquared: js.UndefOr[Double] = js.native
}

object SchemaRegressionMetrics {
  @scala.inline
  def apply(
    meanAbsoluteError: js.UndefOr[Double] = js.undefined,
    meanSquaredError: js.UndefOr[Double] = js.undefined,
    meanSquaredLogError: js.UndefOr[Double] = js.undefined,
    medianAbsoluteError: js.UndefOr[Double] = js.undefined,
    rSquared: js.UndefOr[Double] = js.undefined
  ): SchemaRegressionMetrics = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(meanAbsoluteError)) __obj.updateDynamic("meanAbsoluteError")(meanAbsoluteError.get.asInstanceOf[js.Any])
    if (!js.isUndefined(meanSquaredError)) __obj.updateDynamic("meanSquaredError")(meanSquaredError.get.asInstanceOf[js.Any])
    if (!js.isUndefined(meanSquaredLogError)) __obj.updateDynamic("meanSquaredLogError")(meanSquaredLogError.get.asInstanceOf[js.Any])
    if (!js.isUndefined(medianAbsoluteError)) __obj.updateDynamic("medianAbsoluteError")(medianAbsoluteError.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rSquared)) __obj.updateDynamic("rSquared")(rSquared.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRegressionMetrics]
  }
}

