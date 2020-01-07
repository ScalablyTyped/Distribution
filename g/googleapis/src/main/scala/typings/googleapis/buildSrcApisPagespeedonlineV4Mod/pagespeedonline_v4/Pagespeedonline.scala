package typings.googleapis.buildSrcApisPagespeedonlineV4Mod.pagespeedonline_v4

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
  * const pagespeedonline = google.pagespeedonline('v4');
  *
  * @namespace pagespeedonline
  * @type {Function}
  * @version v4
  * @variation v4
  * @param {object=} options Options for Pagespeedonline
  */
@JSImport("googleapis/build/src/apis/pagespeedonline/v4", "pagespeedonline_v4.Pagespeedonline")
@js.native
class Pagespeedonline protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var pagespeedapi: Resource$Pagespeedapi = js.native
}

