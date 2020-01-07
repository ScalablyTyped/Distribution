package typings.googleapis.buildSrcApisPubsubV1Mod.pubsub_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Pub/Sub API
  *
  * Provides reliable, many-to-many, asynchronous messaging between
  * applications.
  *
  * @example
  * const {google} = require('googleapis');
  * const pubsub = google.pubsub('v1');
  *
  * @namespace pubsub
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Pubsub
  */
@JSImport("googleapis/build/src/apis/pubsub/v1", "pubsub_v1.Pubsub")
@js.native
class Pubsub protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var projects: Resource$Projects = js.native
}

