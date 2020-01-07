package typings.googleapis.buildSrcApisCloudshellV1Mod.cloudshell_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Shell API
  *
  * Allows users to start, configure, and connect to interactive shell sessions
  * running in the cloud.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudshell = google.cloudshell('v1');
  *
  * @namespace cloudshell
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Cloudshell
  */
@JSImport("googleapis/build/src/apis/cloudshell/v1", "cloudshell_v1.Cloudshell")
@js.native
class Cloudshell protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var operations: Resource$Operations = js.native
}

