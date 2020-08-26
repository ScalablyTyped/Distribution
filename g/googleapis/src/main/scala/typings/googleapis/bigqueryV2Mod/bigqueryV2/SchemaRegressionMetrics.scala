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
  def apply(): SchemaRegressionMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegressionMetrics]
  }
  @scala.inline
  implicit class SchemaRegressionMetricsOps[Self <: SchemaRegressionMetrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMeanAbsoluteError(value: Double): Self = this.set("meanAbsoluteError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeanAbsoluteError: Self = this.set("meanAbsoluteError", js.undefined)
    @scala.inline
    def setMeanSquaredError(value: Double): Self = this.set("meanSquaredError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeanSquaredError: Self = this.set("meanSquaredError", js.undefined)
    @scala.inline
    def setMeanSquaredLogError(value: Double): Self = this.set("meanSquaredLogError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeanSquaredLogError: Self = this.set("meanSquaredLogError", js.undefined)
    @scala.inline
    def setMedianAbsoluteError(value: Double): Self = this.set("medianAbsoluteError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedianAbsoluteError: Self = this.set("medianAbsoluteError", js.undefined)
    @scala.inline
    def setRSquared(value: Double): Self = this.set("rSquared", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRSquared: Self = this.set("rSquared", js.undefined)
  }
  
}

