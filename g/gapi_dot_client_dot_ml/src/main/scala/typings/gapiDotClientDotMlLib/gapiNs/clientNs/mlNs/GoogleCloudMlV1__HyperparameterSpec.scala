package typings
package gapiDotClientDotMlLib.gapiNs.clientNs.mlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GoogleCloudMlV1__HyperparameterSpec extends js.Object {
  /**
               * Required. The type of goal to use for tuning. Available types are
               * `MAXIMIZE` and `MINIMIZE`.
               *
               * Defaults to `MAXIMIZE`.
               */
  var goal: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Optional. The Tensorflow summary tag name to use for optimizing trials. For
               * current versions of Tensorflow, this tag name should exactly match what is
               * shown in Tensorboard, including all scopes.  For versions of Tensorflow
               * prior to 0.12, this should be only the tag passed to tf.Summary.
               * By default, "training/hptuning/metric" will be used.
               */
  var hyperparameterMetricTag: js.UndefOr[java.lang.String] = js.undefined
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
  var maxParallelTrials: js.UndefOr[scala.Double] = js.undefined
  /**
               * Optional. How many training trials should be attempted to optimize
               * the specified hyperparameters.
               *
               * Defaults to one.
               */
  var maxTrials: js.UndefOr[scala.Double] = js.undefined
  /** Required. The set of parameters to tune. */
  var params: js.UndefOr[js.Array[GoogleCloudMlV1__ParameterSpec]] = js.undefined
}

