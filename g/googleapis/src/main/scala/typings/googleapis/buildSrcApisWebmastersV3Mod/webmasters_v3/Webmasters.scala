package typings.googleapis.buildSrcApisWebmastersV3Mod.webmasters_v3

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Search Console API
  *
  * View Google Search Console data for your verified sites.
  *
  * @example
  * const {google} = require('googleapis');
  * const webmasters = google.webmasters('v3');
  *
  * @namespace webmasters
  * @type {Function}
  * @version v3
  * @variation v3
  * @param {object=} options Options for Webmasters
  */
@JSImport("googleapis/build/src/apis/webmasters/v3", "webmasters_v3.Webmasters")
@js.native
class Webmasters protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var searchanalytics: Resource$Searchanalytics = js.native
  var sitemaps: Resource$Sitemaps = js.native
  var sites: Resource$Sites = js.native
  var urlcrawlerrorscounts: Resource$Urlcrawlerrorscounts = js.native
  var urlcrawlerrorssamples: Resource$Urlcrawlerrorssamples = js.native
}

