package typings.googleapis.buildSrcApisMirrorV1Mod.mirror_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Mirror API
  *
  * Interacts with Glass users via the timeline.
  *
  * @example
  * const {google} = require('googleapis');
  * const mirror = google.mirror('v1');
  *
  * @namespace mirror
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Mirror
  */
@JSImport("googleapis/build/src/apis/mirror/v1", "mirror_v1.Mirror")
@js.native
class Mirror protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var accounts: Resource$Accounts = js.native
  var contacts: Resource$Contacts = js.native
  var context: APIRequestContext = js.native
  var locations: Resource$Locations = js.native
  var settings: Resource$Settings = js.native
  var subscriptions: Resource$Subscriptions = js.native
  var timeline: Resource$Timeline = js.native
}

