package typings.googleapis.buildSrcApisPubsubV1beta1aMod.pubsub_v1beta1a

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
  * const pubsub = google.pubsub('v1beta1a');
  *
  * @namespace pubsub
  * @type {Function}
  * @version v1beta1a
  * @variation v1beta1a
  * @param {object=} options Options for Pubsub
  */
@JSImport("googleapis/build/src/apis/pubsub/v1beta1a", "pubsub_v1beta1a.Pubsub")
@js.native
class Pubsub protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var subscriptions: Resource$Subscriptions = js.native
  var topics: Resource$Topics = js.native
}

