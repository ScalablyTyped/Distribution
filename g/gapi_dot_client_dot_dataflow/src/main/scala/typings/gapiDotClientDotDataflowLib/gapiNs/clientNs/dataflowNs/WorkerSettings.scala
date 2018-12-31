package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

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
  var baseUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Whether to send work progress updates to the service. */
  var reportingEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The Cloud Dataflow service path relative to the root URL, for example,
    * "dataflow/v1b3/projects".
    */
  var servicePath: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Shuffle service path relative to the root URL, for example,
    * "shuffle/v1beta1".
    */
  var shuffleServicePath: js.UndefOr[java.lang.String] = js.undefined
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
  var tempStoragePrefix: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the worker running this pipeline. */
  var workerId: js.UndefOr[java.lang.String] = js.undefined
}

