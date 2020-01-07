package typings.googleapis.buildSrcApisBigtableadminV1Mod.bigtableadmin_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Bigtable Admin API
  *
  * Administer your Cloud Bigtable tables and instances.
  *
  * @example
  * const {google} = require('googleapis');
  * const bigtableadmin = google.bigtableadmin('v1');
  *
  * @namespace bigtableadmin
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Bigtableadmin
  */
@JSImport("googleapis/build/src/apis/bigtableadmin/v1", "bigtableadmin_v1.Bigtableadmin")
@js.native
class Bigtableadmin protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var projects: Resource$Projects = js.native
}

