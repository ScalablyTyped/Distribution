package typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Analytics API
  *
  * Views and manages your Google Analytics data.
  *
  * @example
  * const {google} = require('googleapis');
  * const analytics = google.analytics('v3');
  *
  * @namespace analytics
  * @type {Function}
  * @version v3
  * @variation v3
  * @param {object=} options Options for Analytics
  */
@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Analytics")
@js.native
class Analytics protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var data: Resource$Data = js.native
  var management: Resource$Management = js.native
  var metadata: Resource$Metadata = js.native
  var provisioning: Resource$Provisioning = js.native
  var userDeletion: Resource$Userdeletion = js.native
}

