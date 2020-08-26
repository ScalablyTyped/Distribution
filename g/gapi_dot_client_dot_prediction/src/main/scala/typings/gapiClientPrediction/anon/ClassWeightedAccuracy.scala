package typings.gapiClientPrediction.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassWeightedAccuracy extends js.Object {
  /** Estimated accuracy of model taking utility weights into account (Categorical models only). */
  var classWeightedAccuracy: js.UndefOr[String] = js.native
  /**
    * A number between 0.0 and 1.0, where 1.0 is 100% accurate. This is an estimate, based on the amount and quality of the training data, of the estimated
    * prediction accuracy. You can use this is a guide to decide whether the results are accurate enough for your needs. This estimate will be more reliable
    * if your real input data is similar to your training data (Categorical models only).
    */
  var classificationAccuracy: js.UndefOr[String] = js.native
  /** An estimated mean squared error. The can be used to measure the quality of the predicted model (Regression models only). */
  var meanSquaredError: js.UndefOr[String] = js.native
  /** Type of predictive model (CLASSIFICATION or REGRESSION). */
  var modelType: js.UndefOr[String] = js.native
  /** Number of valid data instances used in the trained model. */
  var numberInstances: js.UndefOr[String] = js.native
  /** Number of class labels in the trained model (Categorical models only). */
  var numberLabels: js.UndefOr[String] = js.native
}

object ClassWeightedAccuracy {
  @scala.inline
  def apply(): ClassWeightedAccuracy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassWeightedAccuracy]
  }
  @scala.inline
  implicit class ClassWeightedAccuracyOps[Self <: ClassWeightedAccuracy] (val x: Self) extends AnyVal {
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
    def setClassWeightedAccuracy(value: String): Self = this.set("classWeightedAccuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassWeightedAccuracy: Self = this.set("classWeightedAccuracy", js.undefined)
    @scala.inline
    def setClassificationAccuracy(value: String): Self = this.set("classificationAccuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassificationAccuracy: Self = this.set("classificationAccuracy", js.undefined)
    @scala.inline
    def setMeanSquaredError(value: String): Self = this.set("meanSquaredError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeanSquaredError: Self = this.set("meanSquaredError", js.undefined)
    @scala.inline
    def setModelType(value: String): Self = this.set("modelType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelType: Self = this.set("modelType", js.undefined)
    @scala.inline
    def setNumberInstances(value: String): Self = this.set("numberInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberInstances: Self = this.set("numberInstances", js.undefined)
    @scala.inline
    def setNumberLabels(value: String): Self = this.set("numberLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberLabels: Self = this.set("numberLabels", js.undefined)
  }
  
}

