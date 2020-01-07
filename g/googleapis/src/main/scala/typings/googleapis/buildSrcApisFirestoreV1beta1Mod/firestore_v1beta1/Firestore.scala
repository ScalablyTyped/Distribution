package typings.googleapis.buildSrcApisFirestoreV1beta1Mod.firestore_v1beta1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Firestore API
  *
  * Accesses the NoSQL document database built for automatic scaling, high
  * performance, and ease of application development.
  *
  * @example
  * const {google} = require('googleapis');
  * const firestore = google.firestore('v1beta1');
  *
  * @namespace firestore
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Firestore
  */
@JSImport("googleapis/build/src/apis/firestore/v1beta1", "firestore_v1beta1.Firestore")
@js.native
class Firestore protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var projects: Resource$Projects = js.native
}

