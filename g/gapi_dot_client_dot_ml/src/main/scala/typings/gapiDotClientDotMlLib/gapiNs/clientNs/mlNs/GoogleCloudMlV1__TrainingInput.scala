package typings
package gapiDotClientDotMlLib.gapiNs.clientNs.mlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GoogleCloudMlV1__TrainingInput extends js.Object {
  /** Optional. Command line arguments to pass to the program. */
  var args: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Optional. The set of Hyperparameters to tune. */
  var hyperparameters: js.UndefOr[GoogleCloudMlV1__HyperparameterSpec] = js.undefined
  /**
               * Optional. A Google Cloud Storage path in which to store training outputs
               * and other data needed for training. This path is passed to your TensorFlow
               * program as the 'job_dir' command-line argument. The benefit of specifying
               * this field is that Cloud ML validates the path for use in training.
               */
  var jobDir: js.UndefOr[java.lang.String] = js.undefined
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
  var masterType: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Required. The Google Cloud Storage location of the packages with
               * the training program and any additional dependencies.
               * The maximum number of package URIs is 100.
               */
  var packageUris: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
               * Optional. The number of parameter server replicas to use for the training
               * job. Each replica in the cluster will be of the type specified in
               * `parameter_server_type`.
               *
               * This value can only be used when `scale_tier` is set to `CUSTOM`.If you
               * set this value, you must also set `parameter_server_type`.
               */
  var parameterServerCount: js.UndefOr[java.lang.String] = js.undefined
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
  var parameterServerType: js.UndefOr[java.lang.String] = js.undefined
  /** Required. The Python module name to run after installing the packages. */
  var pythonModule: js.UndefOr[java.lang.String] = js.undefined
  /** Required. The Google Compute Engine region to run the training job in. */
  var region: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Optional. The Google Cloud ML runtime version to use for training.  If not
               * set, Google Cloud ML will choose the latest stable version.
               */
  var runtimeVersion: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Required. Specifies the machine types, the number of replicas for workers
               * and parameter servers.
               */
  var scaleTier: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Optional. The number of worker replicas to use for the training job. Each
               * replica in the cluster will be of the type specified in `worker_type`.
               *
               * This value can only be used when `scale_tier` is set to `CUSTOM`. If you
               * set this value, you must also set `worker_type`.
               */
  var workerCount: js.UndefOr[java.lang.String] = js.undefined
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
  var workerType: js.UndefOr[java.lang.String] = js.undefined
}

