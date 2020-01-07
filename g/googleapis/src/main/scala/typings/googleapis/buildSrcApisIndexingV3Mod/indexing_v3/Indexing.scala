package typings.googleapis.buildSrcApisIndexingV3Mod.indexing_v3

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Indexing API
  *
  * Notifies Google when your web pages change.
  *
  * @example
  * const {google} = require('googleapis');
  * const indexing = google.indexing('v3');
  *
  * @namespace indexing
  * @type {Function}
  * @version v3
  * @variation v3
  * @param {object=} options Options for Indexing
  */
@JSImport("googleapis/build/src/apis/indexing/v3", "indexing_v3.Indexing")
@js.native
class Indexing protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var urlNotifications: Resource$Urlnotifications = js.native
}

