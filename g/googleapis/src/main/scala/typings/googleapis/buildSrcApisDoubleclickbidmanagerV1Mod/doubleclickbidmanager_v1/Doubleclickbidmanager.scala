package typings.googleapis.buildSrcApisDoubleclickbidmanagerV1Mod.doubleclickbidmanager_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DoubleClick Bid Manager API
  *
  * API for viewing and managing your reports in DoubleClick Bid Manager.
  *
  * @example
  * const {google} = require('googleapis');
  * const doubleclickbidmanager = google.doubleclickbidmanager('v1');
  *
  * @namespace doubleclickbidmanager
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Doubleclickbidmanager
  */
@JSImport("googleapis/build/src/apis/doubleclickbidmanager/v1", "doubleclickbidmanager_v1.Doubleclickbidmanager")
@js.native
class Doubleclickbidmanager protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var lineitems: Resource$Lineitems = js.native
  var queries: Resource$Queries = js.native
  var reports: Resource$Reports = js.native
  var sdf: Resource$Sdf = js.native
}

