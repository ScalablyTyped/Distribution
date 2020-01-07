package typings.googleapis.buildSrcApisStoragetransferV1Mod.storagetransfer_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Storage Transfer API
  *
  * Transfers data from external data sources to a Google Cloud Storage bucket
  * or between Google Cloud Storage buckets.
  *
  * @example
  * const {google} = require('googleapis');
  * const storagetransfer = google.storagetransfer('v1');
  *
  * @namespace storagetransfer
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Storagetransfer
  */
@JSImport("googleapis/build/src/apis/storagetransfer/v1", "storagetransfer_v1.Storagetransfer")
@js.native
class Storagetransfer protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var googleServiceAccounts: Resource$Googleserviceaccounts = js.native
  var transferJobs: Resource$Transferjobs = js.native
  var transferOperations: Resource$Transferoperations = js.native
}

