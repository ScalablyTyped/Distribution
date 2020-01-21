package typings.gapiClientPrediction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClassWeightedAccuracy extends js.Object {
  /** Estimated accuracy of model taking utility weights into account (Categorical models only). */
  var classWeightedAccuracy: js.UndefOr[String] = js.undefined
  /**
    * A number between 0.0 and 1.0, where 1.0 is 100% accurate. This is an estimate, based on the amount and quality of the training data, of the estimated
    * prediction accuracy. You can use this is a guide to decide whether the results are accurate enough for your needs. This estimate will be more reliable
    * if your real input data is similar to your training data (Categorical models only).
    */
  var classificationAccuracy: js.UndefOr[String] = js.undefined
  /** An estimated mean squared error. The can be used to measure the quality of the predicted model (Regression models only). */
  var meanSquaredError: js.UndefOr[String] = js.undefined
  /** Type of predictive model (CLASSIFICATION or REGRESSION). */
  var modelType: js.UndefOr[String] = js.undefined
  /** Number of valid data instances used in the trained model. */
  var numberInstances: js.UndefOr[String] = js.undefined
  /** Number of class labels in the trained model (Categorical models only). */
  var numberLabels: js.UndefOr[String] = js.undefined
}

object AnonClassWeightedAccuracy {
  @scala.inline
  def apply(
    classWeightedAccuracy: String = null,
    classificationAccuracy: String = null,
    meanSquaredError: String = null,
    modelType: String = null,
    numberInstances: String = null,
    numberLabels: String = null
  ): AnonClassWeightedAccuracy = {
    val __obj = js.Dynamic.literal()
    if (classWeightedAccuracy != null) __obj.updateDynamic("classWeightedAccuracy")(classWeightedAccuracy.asInstanceOf[js.Any])
    if (classificationAccuracy != null) __obj.updateDynamic("classificationAccuracy")(classificationAccuracy.asInstanceOf[js.Any])
    if (meanSquaredError != null) __obj.updateDynamic("meanSquaredError")(meanSquaredError.asInstanceOf[js.Any])
    if (modelType != null) __obj.updateDynamic("modelType")(modelType.asInstanceOf[js.Any])
    if (numberInstances != null) __obj.updateDynamic("numberInstances")(numberInstances.asInstanceOf[js.Any])
    if (numberLabels != null) __obj.updateDynamic("numberLabels")(numberLabels.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClassWeightedAccuracy]
  }
}

