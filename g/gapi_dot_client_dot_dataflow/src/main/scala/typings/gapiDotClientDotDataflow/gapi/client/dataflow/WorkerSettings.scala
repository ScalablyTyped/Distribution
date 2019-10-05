package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerSettings extends js.Object {
  /**
    * The base URL for accessing Google Cloud APIs.
    *
    * When workers access Google Cloud APIs, they logically do so via
    * relative URLs.  If this field is specified, it supplies the base
    * URL to use for resolving these relative URLs.  The normative
    * algorithm used is defined by RFC 1808, "Relative Uniform Resource
    * Locators".
    *
    * If not specified, the default value is "http://www.googleapis.com/"
    */
  var baseUrl: js.UndefOr[String] = js.undefined
  /** Whether to send work progress updates to the service. */
  var reportingEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The Cloud Dataflow service path relative to the root URL, for example,
    * "dataflow/v1b3/projects".
    */
  var servicePath: js.UndefOr[String] = js.undefined
  /**
    * The Shuffle service path relative to the root URL, for example,
    * "shuffle/v1beta1".
    */
  var shuffleServicePath: js.UndefOr[String] = js.undefined
  /**
    * The prefix of the resources the system should use for temporary
    * storage.
    *
    * The supported resource type is:
    *
    * Google Cloud Storage:
    *
    * storage.googleapis.com/{bucket}/{object}
    * bucket.storage.googleapis.com/{object}
    */
  var tempStoragePrefix: js.UndefOr[String] = js.undefined
  /** The ID of the worker running this pipeline. */
  var workerId: js.UndefOr[String] = js.undefined
}

object WorkerSettings {
  @scala.inline
  def apply(
    baseUrl: String = null,
    reportingEnabled: js.UndefOr[Boolean] = js.undefined,
    servicePath: String = null,
    shuffleServicePath: String = null,
    tempStoragePrefix: String = null,
    workerId: String = null
  ): WorkerSettings = {
    val __obj = js.Dynamic.literal()
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (!js.isUndefined(reportingEnabled)) __obj.updateDynamic("reportingEnabled")(reportingEnabled)
    if (servicePath != null) __obj.updateDynamic("servicePath")(servicePath)
    if (shuffleServicePath != null) __obj.updateDynamic("shuffleServicePath")(shuffleServicePath)
    if (tempStoragePrefix != null) __obj.updateDynamic("tempStoragePrefix")(tempStoragePrefix)
    if (workerId != null) __obj.updateDynamic("workerId")(workerId)
    __obj.asInstanceOf[WorkerSettings]
  }
}

