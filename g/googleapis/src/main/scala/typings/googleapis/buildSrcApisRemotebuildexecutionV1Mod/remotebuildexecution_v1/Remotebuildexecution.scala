package typings.googleapis.buildSrcApisRemotebuildexecutionV1Mod.remotebuildexecution_v1

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
  * const remotebuildexecution = google.remotebuildexecution('v1');
  *
  * @namespace remotebuildexecution
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Remotebuildexecution
  */
@JSImport("googleapis/build/src/apis/remotebuildexecution/v1", "remotebuildexecution_v1.Remotebuildexecution")
@js.native
class Remotebuildexecution protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var media: Resource$Media = js.native
  var operations: Resource$Operations = js.native
  var projects: Resource$Projects = js.native
  var v1: Resource$V1 = js.native
}

