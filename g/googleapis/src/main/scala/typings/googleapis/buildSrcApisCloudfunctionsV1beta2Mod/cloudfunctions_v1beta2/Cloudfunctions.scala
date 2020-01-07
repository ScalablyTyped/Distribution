package typings.googleapis.buildSrcApisCloudfunctionsV1beta2Mod.cloudfunctions_v1beta2

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Functions API
  *
  * Manages lightweight user-provided functions executed in response to events.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudfunctions = google.cloudfunctions('v1beta2');
  *
  * @namespace cloudfunctions
  * @type {Function}
  * @version v1beta2
  * @variation v1beta2
  * @param {object=} options Options for Cloudfunctions
  */
@JSImport("googleapis/build/src/apis/cloudfunctions/v1beta2", "cloudfunctions_v1beta2.Cloudfunctions")
@js.native
class Cloudfunctions protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var operations: Resource$Operations = js.native
  var projects: Resource$Projects = js.native
}

