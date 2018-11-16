package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

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
  var clusterManagerApiService: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The dataset for the current project where various workflow
               * related tables are stored.
               *
               * The supported resource type is:
               *
               * Google BigQuery:
               * bigquery.googleapis.com/{dataset}
               */
  var dataset: js.UndefOr[java.lang.String] = js.undefined
  /** The list of experiments to enable. */
  var experiments: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Experimental settings. */
  var internalExperiments: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  /**
               * The Cloud Dataflow SDK pipeline options specified by the user. These
               * options are passed through the service and are used to recreate the
               * SDK pipeline options on the worker in a language agnostic and platform
               * independent way.
               */
  var sdkPipelineOptions: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  /** Identity to run virtual machines as. Defaults to the default account. */
  var serviceAccountEmail: js.UndefOr[java.lang.String] = js.undefined
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
  var tempStoragePrefix: js.UndefOr[java.lang.String] = js.undefined
  /** A description of the process that generated the request. */
  var userAgent: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  /**
               * A structure describing which components and their versions of the service
               * are required in order to run the job.
               */
  var version: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  /**
               * The worker pools. At least one "harness" worker pool must be
               * specified in order for the job to have workers.
               */
  var workerPools: js.UndefOr[js.Array[WorkerPool]] = js.undefined
}

