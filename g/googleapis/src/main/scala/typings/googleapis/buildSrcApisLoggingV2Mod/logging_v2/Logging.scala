package typings.googleapis.buildSrcApisLoggingV2Mod.logging_v2

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stackdriver Logging API
  *
  * Writes log entries and manages your Logging configuration.
  *
  * @example
  * const {google} = require('googleapis');
  * const logging = google.logging('v2');
  *
  * @namespace logging
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Logging
  */
@JSImport("googleapis/build/src/apis/logging/v2", "logging_v2.Logging")
@js.native
class Logging protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var billingAccounts: Resource$Billingaccounts = js.native
  var context: APIRequestContext = js.native
  var entries: Resource$Entries = js.native
  var exclusions: Resource$Exclusions = js.native
  var folders: Resource$Folders = js.native
  var logs: Resource$Logs = js.native
  var monitoredResourceDescriptors: Resource$Monitoredresourcedescriptors = js.native
  var organizations: Resource$Organizations = js.native
  var projects: Resource$Projects = js.native
  var sinks: Resource$Sinks = js.native
}

