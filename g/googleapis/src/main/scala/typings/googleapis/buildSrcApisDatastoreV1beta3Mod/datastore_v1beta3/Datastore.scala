package typings.googleapis.buildSrcApisDatastoreV1beta3Mod.datastore_v1beta3

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Datastore API
  *
  * Accesses the schemaless NoSQL database to provide fully managed, robust,
  * scalable storage for your application.
  *
  * @example
  * const {google} = require('googleapis');
  * const datastore = google.datastore('v1beta3');
  *
  * @namespace datastore
  * @type {Function}
  * @version v1beta3
  * @variation v1beta3
  * @param {object=} options Options for Datastore
  */
@JSImport("googleapis/build/src/apis/datastore/v1beta3", "datastore_v1beta3.Datastore")
@js.native
class Datastore protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var projects: Resource$Projects = js.native
}

