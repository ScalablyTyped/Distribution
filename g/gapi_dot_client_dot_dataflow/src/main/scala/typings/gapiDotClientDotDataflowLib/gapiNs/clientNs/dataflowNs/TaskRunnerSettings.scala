package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskRunnerSettings extends js.Object {
  /** Whether to also send taskrunner log info to stderr. */
  var alsologtostderr: js.UndefOr[scala.Boolean] = js.undefined
  /** The location on the worker for task-specific subdirectories. */
  var baseTaskDir: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The base URL for the taskrunner to use when accessing Google Cloud APIs.
    *
    * When workers access Google Cloud APIs, they logically do so via
    * relative URLs.  If this field is specified, it supplies the base
    * URL to use for resolving these relative URLs.  The normative
    * algorithm used is defined by RFC 1808, "Relative Uniform Resource
    * Locators".
    *
    * If not specified, the default value is "http://www.googleapis.com/"
    */
  var baseUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The file to store preprocessing commands in. */
  var commandlinesFileName: js.UndefOr[java.lang.String] = js.undefined
  /** Whether to continue taskrunner if an exception is hit. */
  var continueOnException: js.UndefOr[scala.Boolean] = js.undefined
  /** The API version of endpoint, e.g. "v1b3" */
  var dataflowApiVersion: js.UndefOr[java.lang.String] = js.undefined
  /** The command to launch the worker harness. */
  var harnessCommand: js.UndefOr[java.lang.String] = js.undefined
  /** The suggested backend language. */
  var languageHint: js.UndefOr[java.lang.String] = js.undefined
  /** The directory on the VM to store logs. */
  var logDir: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to send taskrunner log info to Google Compute Engine VM serial
    * console.
    */
  var logToSerialconsole: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates where to put logs.  If this is not specified, the logs
    * will not be uploaded.
    *
    * The supported resource type is:
    *
    * Google Cloud Storage:
    * storage.googleapis.com/{bucket}/{object}
    * bucket.storage.googleapis.com/{object}
    */
  var logUploadLocation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The OAuth2 scopes to be requested by the taskrunner in order to
    * access the Cloud Dataflow API.
    */
  var oauthScopes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The settings to pass to the parallel worker harness. */
  var parallelWorkerSettings: js.UndefOr[WorkerSettings] = js.undefined
  /** The streaming worker main class name. */
  var streamingWorkerMainClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The UNIX group ID on the worker VM to use for tasks launched by
    * taskrunner; e.g. "wheel".
    */
  var taskGroup: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The UNIX user ID on the worker VM to use for tasks launched by
    * taskrunner; e.g. "root".
    */
  var taskUser: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The prefix of the resources the taskrunner should use for
    * temporary storage.
    *
    * The supported resource type is:
    *
    * Google Cloud Storage:
    * storage.googleapis.com/{bucket}/{object}
    * bucket.storage.googleapis.com/{object}
    */
  var tempStoragePrefix: js.UndefOr[java.lang.String] = js.undefined
  /** The ID string of the VM. */
  var vmId: js.UndefOr[java.lang.String] = js.undefined
  /** The file to store the workflow in. */
  var workflowFileName: js.UndefOr[java.lang.String] = js.undefined
}

