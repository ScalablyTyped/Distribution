package typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2

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
  * const remotebuildexecution = google.remotebuildexecution('v2');
  *
  * @namespace remotebuildexecution
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Remotebuildexecution
  */
@JSImport("googleapis/build/src/apis/remotebuildexecution/v2", "remotebuildexecution_v2.Remotebuildexecution")
@js.native
class Remotebuildexecution protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var actionResults: Resource$Actionresults = js.native
  var actions: Resource$Actions = js.native
  var blobs: Resource$Blobs = js.native
  var context: APIRequestContext = js.native
  var operations: Resource$Operations = js.native
  var v2: Resource$V2 = js.native
}

