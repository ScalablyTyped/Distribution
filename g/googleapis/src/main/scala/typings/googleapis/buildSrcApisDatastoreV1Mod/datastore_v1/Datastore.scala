package typings.googleapis.buildSrcApisDatastoreV1Mod.datastore_v1

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
  * const datastore = google.datastore('v1');
  *
  * @namespace datastore
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Datastore
  */
@JSImport("googleapis/build/src/apis/datastore/v1", "datastore_v1.Datastore")
@js.native
class Datastore protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var projects: Resource$Projects = js.native
}

