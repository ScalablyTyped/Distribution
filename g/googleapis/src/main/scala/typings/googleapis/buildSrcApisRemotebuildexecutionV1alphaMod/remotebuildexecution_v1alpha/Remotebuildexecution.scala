package typings.googleapis.buildSrcApisRemotebuildexecutionV1alphaMod.remotebuildexecution_v1alpha

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Remote Build Execution API
  *
  * Supplies a Remote Execution API service for tools such as bazel.
  *
  * @example
  * const {google} = require('googleapis');
  * const remotebuildexecution = google.remotebuildexecution('v1alpha');
  *
  * @namespace remotebuildexecution
  * @type {Function}
  * @version v1alpha
  * @variation v1alpha
  * @param {object=} options Options for Remotebuildexecution
  */
@JSImport("googleapis/build/src/apis/remotebuildexecution/v1alpha", "remotebuildexecution_v1alpha.Remotebuildexecution")
@js.native
class Remotebuildexecution protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var projects: Resource$Projects = js.native
}

