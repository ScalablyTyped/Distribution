package typings.googleapis.buildSrcApisYoutubereportingV1Mod.youtubereporting_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * YouTube Reporting API
  *
  * Schedules reporting jobs containing your YouTube Analytics data and
  * downloads the resulting bulk data reports in the form of CSV files.
  *
  * @example
  * const {google} = require('googleapis');
  * const youtubereporting = google.youtubereporting('v1');
  *
  * @namespace youtubereporting
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Youtubereporting
  */
@JSImport("googleapis/build/src/apis/youtubereporting/v1", "youtubereporting_v1.Youtubereporting")
@js.native
class Youtubereporting protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var jobs: Resource$Jobs = js.native
  var media: Resource$Media = js.native
  var reportTypes: Resource$Reporttypes = js.native
}

