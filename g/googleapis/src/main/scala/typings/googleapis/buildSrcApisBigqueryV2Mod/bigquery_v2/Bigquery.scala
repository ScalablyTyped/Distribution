package typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * BigQuery API
  *
  * A data platform for customers to create, manage, share and query data.
  *
  * @example
  * const {google} = require('googleapis');
  * const bigquery = google.bigquery('v2');
  *
  * @namespace bigquery
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Bigquery
  */
@JSImport("googleapis/build/src/apis/bigquery/v2", "bigquery_v2.Bigquery")
@js.native
class Bigquery protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var datasets: Resource$Datasets = js.native
  var jobs: Resource$Jobs = js.native
  var models: Resource$Models = js.native
  var projects: Resource$Projects = js.native
  var tabledata: Resource$Tabledata = js.native
  var tables: Resource$Tables = js.native
}

