package typings.googleapis.buildSrcApisDoubleclicksearchV2Mod.doubleclicksearch_v2

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DoubleClick Search API
  *
  * Reports and modifies your advertising data in DoubleClick Search (for
  * example, campaigns, ad groups, keywords, and conversions).
  *
  * @example
  * const {google} = require('googleapis');
  * const doubleclicksearch = google.doubleclicksearch('v2');
  *
  * @namespace doubleclicksearch
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Doubleclicksearch
  */
@JSImport("googleapis/build/src/apis/doubleclicksearch/v2", "doubleclicksearch_v2.Doubleclicksearch")
@js.native
class Doubleclicksearch protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var conversion: Resource$Conversion = js.native
  var reports: Resource$Reports = js.native
  var savedColumns: Resource$Savedcolumns = js.native
}

