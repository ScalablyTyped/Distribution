package typings.googleapis.buildSrcApisMlV1Mod.ml_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a set of hyperparameters to optimize.
  */
@js.native
trait Schema$GoogleCloudMlV1__HyperparameterSpec extends js.Object {
  /**
    * Optional. The search algorithm specified for the hyperparameter tuning
    * job. Uses the default CloudML Engine hyperparameter tuning algorithm if
    * unspecified.
    */
  var algorithm: js.UndefOr[String] = js.native
  /**
    * Optional. Indicates if the hyperparameter tuning job enables auto trial
    * early stopping.
    */
  var enableTrialEarlyStopping: js.UndefOr[Boolean] = js.native
  /**
    * Required. The type of goal to use for tuning. Available types are
    * `MAXIMIZE` and `MINIMIZE`.  Defaults to `MAXIMIZE`.
    */
  var goal: js.UndefOr[String] = js.native
  /**
    * Optional. The Tensorflow summary tag name to use for optimizing trials.
    * For current versions of Tensorflow, this tag name should exactly match
    * what is shown in Tensorboard, including all scopes.  For versions of
    * Tensorflow prior to 0.12, this should be only the tag passed to
    * tf.Summary. By default, &quot;training/hptuning/metric&quot; will be
    * used.
    */
  var hyperparameterMetricTag: js.UndefOr[String] = js.native
  /**
    * Optional. How many failed trials that need to be seen before failing the
    * hyperparameter tuning job. User can specify this field to override the
    * default failing criteria for CloudML Engine hyperparameter tuning jobs.
    * Defaults to zero, which means to let the service decide when a
    * hyperparameter job should fail.
    */
  var maxFailedTrials: js.UndefOr[Double] = js.native
  /**
    * Optional. The number of training trials to run concurrently. You can
    * reduce the time it takes to perform hyperparameter tuning by adding
    * trials in parallel. However, each trail only benefits from the
    * information gained in completed trials. That means that a trial does not
    * get access to the results of trials running at the same time, which could
    * reduce the quality of the overall optimization.  Each trial will use the
    * same scale tier and machine types.  Defaults to one.
    */
  var maxParallelTrials: js.UndefOr[Double] = js.native
  /**
    * Optional. How many training trials should be attempted to optimize the
    * specified hyperparameters.  Defaults to one.
    */
  var maxTrials: js.UndefOr[Double] = js.native
  /**
    * Required. The set of parameters to tune.
    */
  var params: js.UndefOr[js.Array[Schema$GoogleCloudMlV1__ParameterSpec]] = js.native
  /**
    * Optional. The prior hyperparameter tuning job id that users hope to
    * continue with. The job id will be used to find the corresponding vizier
    * study guid and resume the study.
    */
  var resumePreviousJobId: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudMlV1__HyperparameterSpec {
  @scala.inline
  def apply(
    algorithm: String = null,
    enableTrialEarlyStopping: js.UndefOr[Boolean] = js.undefined,
    goal: String = null,
    hyperparameterMetricTag: String = null,
    maxFailedTrials: Int | Double = null,
    maxParallelTrials: Int | Double = null,
    maxTrials: Int | Double = null,
    params: js.Array[Schema$GoogleCloudMlV1__ParameterSpec] = null,
    resumePreviousJobId: String = null
  ): Schema$GoogleCloudMlV1__HyperparameterSpec = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTrialEarlyStopping)) __obj.updateDynamic("enableTrialEarlyStopping")(enableTrialEarlyStopping.asInstanceOf[js.Any])
    if (goal != null) __obj.updateDynamic("goal")(goal.asInstanceOf[js.Any])
    if (hyperparameterMetricTag != null) __obj.updateDynamic("hyperparameterMetricTag")(hyperparameterMetricTag.asInstanceOf[js.Any])
    if (maxFailedTrials != null) __obj.updateDynamic("maxFailedTrials")(maxFailedTrials.asInstanceOf[js.Any])
    if (maxParallelTrials != null) __obj.updateDynamic("maxParallelTrials")(maxParallelTrials.asInstanceOf[js.Any])
    if (maxTrials != null) __obj.updateDynamic("maxTrials")(maxTrials.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (resumePreviousJobId != null) __obj.updateDynamic("resumePreviousJobId")(resumePreviousJobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudMlV1__HyperparameterSpec]
  }
}

