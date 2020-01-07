package typings.googleapis.buildSrcApisYoutubeAnalyticsV1beta1Mod.youtubeAnalytics_v1beta1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * YouTube Analytics API
  *
  * Retrieves your YouTube Analytics data.
  *
  * @example
  * const {google} = require('googleapis');
  * const youtubeAnalytics = google.youtubeAnalytics('v1beta1');
  *
  * @namespace youtubeAnalytics
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Youtubeanalytics
  */
@JSImport("googleapis/build/src/apis/youtubeAnalytics/v1beta1", "youtubeAnalytics_v1beta1.Youtubeanalytics")
@js.native
class Youtubeanalytics protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var groupItems: Resource$Groupitems = js.native
  var groups: Resource$Groups = js.native
  var reports: Resource$Reports = js.native
}

