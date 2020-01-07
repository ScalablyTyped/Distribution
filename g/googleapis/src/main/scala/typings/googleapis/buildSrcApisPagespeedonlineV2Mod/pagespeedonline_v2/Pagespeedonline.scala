package typings.googleapis.buildSrcApisPagespeedonlineV2Mod.pagespeedonline_v2

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PageSpeed Insights API
  *
  * Analyzes the performance of a web page and provides tailored suggestions to
  * make that page faster.
  *
  * @example
  * const {google} = require('googleapis');
  * const pagespeedonline = google.pagespeedonline('v2');
  *
  * @namespace pagespeedonline
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Pagespeedonline
  */
@JSImport("googleapis/build/src/apis/pagespeedonline/v2", "pagespeedonline_v2.Pagespeedonline")
@js.native
class Pagespeedonline protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var pagespeedapi: Resource$Pagespeedapi = js.native
}

