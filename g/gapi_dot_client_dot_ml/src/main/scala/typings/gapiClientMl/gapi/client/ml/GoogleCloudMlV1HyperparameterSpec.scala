package typings.gapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudMlV1HyperparameterSpec extends js.Object {
  /**
    * Required. The type of goal to use for tuning. Available types are
    * `MAXIMIZE` and `MINIMIZE`.
    *
    * Defaults to `MAXIMIZE`.
    */
  var goal: js.UndefOr[String] = js.native
  /**
    * Optional. The Tensorflow summary tag name to use for optimizing trials. For
    * current versions of Tensorflow, this tag name should exactly match what is
    * shown in Tensorboard, including all scopes.  For versions of Tensorflow
    * prior to 0.12, this should be only the tag passed to tf.Summary.
    * By default, "training/hptuning/metric" will be used.
    */
  var hyperparameterMetricTag: js.UndefOr[String] = js.native
  /**
    * Optional. The number of training trials to run concurrently.
    * You can reduce the time it takes to perform hyperparameter tuning by adding
    * trials in parallel. However, each trail only benefits from the information
    * gained in completed trials. That means that a trial does not get access to
    * the results of trials running at the same time, which could reduce the
    * quality of the overall optimization.
    *
    * Each trial will use the same scale tier and machine types.
    *
    * Defaults to one.
    */
  var maxParallelTrials: js.UndefOr[Double] = js.native
  /**
    * Optional. How many training trials should be attempted to optimize
    * the specified hyperparameters.
    *
    * Defaults to one.
    */
  var maxTrials: js.UndefOr[Double] = js.native
  /** Required. The set of parameters to tune. */
  var params: js.UndefOr[js.Array[GoogleCloudMlV1ParameterSpec]] = js.native
}

object GoogleCloudMlV1HyperparameterSpec {
  @scala.inline
  def apply(): GoogleCloudMlV1HyperparameterSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1HyperparameterSpec]
  }
  @scala.inline
  implicit class GoogleCloudMlV1HyperparameterSpecOps[Self <: GoogleCloudMlV1HyperparameterSpec] (val x: Self) extends AnyVal {
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
    def setGoal(value: String): Self = this.set("goal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGoal: Self = this.set("goal", js.undefined)
    @scala.inline
    def setHyperparameterMetricTag(value: String): Self = this.set("hyperparameterMetricTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHyperparameterMetricTag: Self = this.set("hyperparameterMetricTag", js.undefined)
    @scala.inline
    def setMaxParallelTrials(value: Double): Self = this.set("maxParallelTrials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxParallelTrials: Self = this.set("maxParallelTrials", js.undefined)
    @scala.inline
    def setMaxTrials(value: Double): Self = this.set("maxTrials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTrials: Self = this.set("maxTrials", js.undefined)
    @scala.inline
    def setParamsVarargs(value: GoogleCloudMlV1ParameterSpec*): Self = this.set("params", js.Array(value :_*))
    @scala.inline
    def setParams(value: js.Array[GoogleCloudMlV1ParameterSpec]): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
  }
  
}

