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
    meanAbsoluteError: Int | Double = null,
    meanSquaredError: Int | Double = null,
    meanSquaredLogError: Int | Double = null,
    medianAbsoluteError: Int | Double = null,
    rSquared: Int | Double = null
  ): SchemaRegressionMetrics = {
    val __obj = js.Dynamic.literal()
    if (meanAbsoluteError != null) __obj.updateDynamic("meanAbsoluteError")(meanAbsoluteError.asInstanceOf[js.Any])
    if (meanSquaredError != null) __obj.updateDynamic("meanSquaredError")(meanSquaredError.asInstanceOf[js.Any])
    if (meanSquaredLogError != null) __obj.updateDynamic("meanSquaredLogError")(meanSquaredLogError.asInstanceOf[js.Any])
    if (medianAbsoluteError != null) __obj.updateDynamic("medianAbsoluteError")(medianAbsoluteError.asInstanceOf[js.Any])
    if (rSquared != null) __obj.updateDynamic("rSquared")(rSquared.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRegressionMetrics]
  }
}

