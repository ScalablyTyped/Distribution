package typings.gapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudMlV1TrainingInput extends js.Object {
  /** Optional. Command line arguments to pass to the program. */
  var args: js.UndefOr[js.Array[String]] = js.undefined
  /** Optional. The set of Hyperparameters to tune. */
  var hyperparameters: js.UndefOr[GoogleCloudMlV1HyperparameterSpec] = js.undefined
  /**
    * Optional. A Google Cloud Storage path in which to store training outputs
    * and other data needed for training. This path is passed to your TensorFlow
    * program as the 'job_dir' command-line argument. The benefit of specifying
    * this field is that Cloud ML validates the path for use in training.
    */
  var jobDir: js.UndefOr[String] = js.undefined
  /**
    * Optional. Specifies the type of virtual machine to use for your training
    * job's master worker.
    *
    * The following types are supported:
    *
    * <dl>
    * <dt>standard</dt>
    * <dd>
    * A basic machine configuration suitable for training simple models with
    * small to moderate datasets.
    * </dd>
    * <dt>large_model</dt>
    * <dd>
    * A machine with a lot of memory, specially suited for parameter servers
    * when your model is large (having many hidden layers or layers with very
    * large numbers of nodes).
    * </dd>
    * <dt>complex_model_s</dt>
    * <dd>
    * A machine suitable for the master and workers of the cluster when your
    * model requires more computation than the standard machine can handle
    * satisfactorily.
    * </dd>
    * <dt>complex_model_m</dt>
    * <dd>
    * A machine with roughly twice the number of cores and roughly double the
    * memory of <code suppresswarning="true">complex_model_s</code>.
    * </dd>
    * <dt>complex_model_l</dt>
    * <dd>
    * A machine with roughly twice the number of cores and roughly double the
    * memory of <code suppresswarning="true">complex_model_m</code>.
    * </dd>
    * <dt>standard_gpu</dt>
    * <dd>
    * A machine equivalent to <code suppresswarning="true">standard</code> that
    * also includes a
    * <a href="/ml-engine/docs/how-tos/using-gpus">
    * GPU that you can use in your trainer</a>.
    * </dd>
    * <dt>complex_model_m_gpu</dt>
    * <dd>
    * A machine equivalent to
    * <code suppresswarning="true">complex_model_m</code> that also includes
    * four GPUs.
    * </dd>
    * </dl>
    *
    * You must set this value when `scaleTier` is set to `CUSTOM`.
    */
  var masterType: js.UndefOr[String] = js.undefined
  /**
    * Required. The Google Cloud Storage location of the packages with
    * the training program and any additional dependencies.
    * The maximum number of package URIs is 100.
    */
  var packageUris: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Optional. The number of parameter server replicas to use for the training
    * job. Each replica in the cluster will be of the type specified in
    * `parameter_server_type`.
    *
    * This value can only be used when `scale_tier` is set to `CUSTOM`.If you
    * set this value, you must also set `parameter_server_type`.
    */
  var parameterServerCount: js.UndefOr[String] = js.undefined
  /**
    * Optional. Specifies the type of virtual machine to use for your training
    * job's parameter server.
    *
    * The supported values are the same as those described in the entry for
    * `master_type`.
    *
    * This value must be present when `scaleTier` is set to `CUSTOM` and
    * `parameter_server_count` is greater than zero.
    */
  var parameterServerType: js.UndefOr[String] = js.undefined
  /** Required. The Python module name to run after installing the packages. */
  var pythonModule: js.UndefOr[String] = js.undefined
  /** Required. The Google Compute Engine region to run the training job in. */
  var region: js.UndefOr[String] = js.undefined
  /**
    * Optional. The Google Cloud ML runtime version to use for training.  If not
    * set, Google Cloud ML will choose the latest stable version.
    */
  var runtimeVersion: js.UndefOr[String] = js.undefined
  /**
    * Required. Specifies the machine types, the number of replicas for workers
    * and parameter servers.
    */
  var scaleTier: js.UndefOr[String] = js.undefined
  /**
    * Optional. The number of worker replicas to use for the training job. Each
    * replica in the cluster will be of the type specified in `worker_type`.
    *
    * This value can only be used when `scale_tier` is set to `CUSTOM`. If you
    * set this value, you must also set `worker_type`.
    */
  var workerCount: js.UndefOr[String] = js.undefined
  /**
    * Optional. Specifies the type of virtual machine to use for your training
    * job's worker nodes.
    *
    * The supported values are the same as those described in the entry for
    * `masterType`.
    *
    * This value must be present when `scaleTier` is set to `CUSTOM` and
    * `workerCount` is greater than zero.
    */
  var workerType: js.UndefOr[String] = js.undefined
}

object GoogleCloudMlV1TrainingInput {
  @scala.inline
  def apply(
    args: js.Array[String] = null,
    hyperparameters: GoogleCloudMlV1HyperparameterSpec = null,
    jobDir: String = null,
    masterType: String = null,
    packageUris: js.Array[String] = null,
    parameterServerCount: String = null,
    parameterServerType: String = null,
    pythonModule: String = null,
    region: String = null,
    runtimeVersion: String = null,
    scaleTier: String = null,
    workerCount: String = null,
    workerType: String = null
  ): GoogleCloudMlV1TrainingInput = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (hyperparameters != null) __obj.updateDynamic("hyperparameters")(hyperparameters.asInstanceOf[js.Any])
    if (jobDir != null) __obj.updateDynamic("jobDir")(jobDir.asInstanceOf[js.Any])
    if (masterType != null) __obj.updateDynamic("masterType")(masterType.asInstanceOf[js.Any])
    if (packageUris != null) __obj.updateDynamic("packageUris")(packageUris.asInstanceOf[js.Any])
    if (parameterServerCount != null) __obj.updateDynamic("parameterServerCount")(parameterServerCount.asInstanceOf[js.Any])
    if (parameterServerType != null) __obj.updateDynamic("parameterServerType")(parameterServerType.asInstanceOf[js.Any])
    if (pythonModule != null) __obj.updateDynamic("pythonModule")(pythonModule.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (runtimeVersion != null) __obj.updateDynamic("runtimeVersion")(runtimeVersion.asInstanceOf[js.Any])
    if (scaleTier != null) __obj.updateDynamic("scaleTier")(scaleTier.asInstanceOf[js.Any])
    if (workerCount != null) __obj.updateDynamic("workerCount")(workerCount.asInstanceOf[js.Any])
    if (workerType != null) __obj.updateDynamic("workerType")(workerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudMlV1TrainingInput]
  }
}

