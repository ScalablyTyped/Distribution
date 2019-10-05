package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Environment extends js.Object {
  /**
    * The type of cluster manager API to use.  If unknown or
    * unspecified, the service will attempt to choose a reasonable
    * default.  This should be in the form of the API service name,
    * e.g. "compute.googleapis.com".
    */
  var clusterManagerApiService: js.UndefOr[String] = js.undefined
  /**
    * The dataset for the current project where various workflow
    * related tables are stored.
    *
    * The supported resource type is:
    *
    * Google BigQuery:
    * bigquery.googleapis.com/{dataset}
    */
  var dataset: js.UndefOr[String] = js.undefined
  /** The list of experiments to enable. */
  var experiments: js.UndefOr[js.Array[String]] = js.undefined
  /** Experimental settings. */
  var internalExperiments: js.UndefOr[Record[String, _]] = js.undefined
  /**
    * The Cloud Dataflow SDK pipeline options specified by the user. These
    * options are passed through the service and are used to recreate the
    * SDK pipeline options on the worker in a language agnostic and platform
    * independent way.
    */
  var sdkPipelineOptions: js.UndefOr[Record[String, _]] = js.undefined
  /** Identity to run virtual machines as. Defaults to the default account. */
  var serviceAccountEmail: js.UndefOr[String] = js.undefined
  /**
    * The prefix of the resources the system should use for temporary
    * storage.  The system will append the suffix "/temp-{JOBNAME} to
    * this resource prefix, where {JOBNAME} is the value of the
    * job_name field.  The resulting bucket and object prefix is used
    * as the prefix of the resources used to store temporary data
    * needed during the job execution.  NOTE: This will override the
    * value in taskrunner_settings.
    * The supported resource type is:
    *
    * Google Cloud Storage:
    *
    * storage.googleapis.com/{bucket}/{object}
    * bucket.storage.googleapis.com/{object}
    */
  var tempStoragePrefix: js.UndefOr[String] = js.undefined
  /** A description of the process that generated the request. */
  var userAgent: js.UndefOr[Record[String, _]] = js.undefined
  /**
    * A structure describing which components and their versions of the service
    * are required in order to run the job.
    */
  var version: js.UndefOr[Record[String, _]] = js.undefined
  /**
    * The worker pools. At least one "harness" worker pool must be
    * specified in order for the job to have workers.
    */
  var workerPools: js.UndefOr[js.Array[WorkerPool]] = js.undefined
}

object Environment {
  @scala.inline
  def apply(
    clusterManagerApiService: String = null,
    dataset: String = null,
    experiments: js.Array[String] = null,
    internalExperiments: Record[String, _] = null,
    sdkPipelineOptions: Record[String, _] = null,
    serviceAccountEmail: String = null,
    tempStoragePrefix: String = null,
    userAgent: Record[String, _] = null,
    version: Record[String, _] = null,
    workerPools: js.Array[WorkerPool] = null
  ): Environment = {
    val __obj = js.Dynamic.literal()
    if (clusterManagerApiService != null) __obj.updateDynamic("clusterManagerApiService")(clusterManagerApiService)
    if (dataset != null) __obj.updateDynamic("dataset")(dataset)
    if (experiments != null) __obj.updateDynamic("experiments")(experiments)
    if (internalExperiments != null) __obj.updateDynamic("internalExperiments")(internalExperiments)
    if (sdkPipelineOptions != null) __obj.updateDynamic("sdkPipelineOptions")(sdkPipelineOptions)
    if (serviceAccountEmail != null) __obj.updateDynamic("serviceAccountEmail")(serviceAccountEmail)
    if (tempStoragePrefix != null) __obj.updateDynamic("tempStoragePrefix")(tempStoragePrefix)
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent)
    if (version != null) __obj.updateDynamic("version")(version)
    if (workerPools != null) __obj.updateDynamic("workerPools")(workerPools)
    __obj.asInstanceOf[Environment]
  }
}

