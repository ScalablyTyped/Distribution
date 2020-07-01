package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Confusion matrix for binary classification models.
  */
@js.native
trait SchemaBinaryConfusionMatrix extends js.Object {
  /**
    * Number of false samples predicted as false.
    */
  var falseNegatives: js.UndefOr[String] = js.native
  /**
    * Number of false samples predicted as true.
    */
  var falsePositives: js.UndefOr[String] = js.native
  /**
    * Threshold value used when computing each of the following metric.
    */
  var positiveClassThreshold: js.UndefOr[Double] = js.native
  /**
    * Aggregate precision.
    */
  var precision: js.UndefOr[Double] = js.native
  /**
    * Aggregate recall.
    */
  var recall: js.UndefOr[Double] = js.native
  /**
    * Number of true samples predicted as false.
    */
  var trueNegatives: js.UndefOr[String] = js.native
  /**
    * Number of true samples predicted as true.
    */
  var truePositives: js.UndefOr[String] = js.native
}

object SchemaBinaryConfusionMatrix {
  @scala.inline
  def apply(
    falseNegatives: String = null,
    falsePositives: String = null,
    positiveClassThreshold: js.UndefOr[Double] = js.undefined,
    precision: js.UndefOr[Double] = js.undefined,
    recall: js.UndefOr[Double] = js.undefined,
    trueNegatives: String = null,
    truePositives: String = null
  ): SchemaBinaryConfusionMatrix = {
    val __obj = js.Dynamic.literal()
    if (falseNegatives != null) __obj.updateDynamic("falseNegatives")(falseNegatives.asInstanceOf[js.Any])
    if (falsePositives != null) __obj.updateDynamic("falsePositives")(falsePositives.asInstanceOf[js.Any])
    if (!js.isUndefined(positiveClassThreshold)) __obj.updateDynamic("positiveClassThreshold")(positiveClassThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(precision)) __obj.updateDynamic("precision")(precision.get.asInstanceOf[js.Any])
    if (!js.isUndefined(recall)) __obj.updateDynamic("recall")(recall.get.asInstanceOf[js.Any])
    if (trueNegatives != null) __obj.updateDynamic("trueNegatives")(trueNegatives.asInstanceOf[js.Any])
    if (truePositives != null) __obj.updateDynamic("truePositives")(truePositives.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBinaryConfusionMatrix]
  }
}

