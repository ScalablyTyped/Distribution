package typings.googleapis.buildSrcApisFusiontablesV2Mod.fusiontables_v2

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fusion Tables API
  *
  * API for working with Fusion Tables data.
  *
  * @example
  * const {google} = require('googleapis');
  * const fusiontables = google.fusiontables('v2');
  *
  * @namespace fusiontables
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Fusiontables
  */
@JSImport("googleapis/build/src/apis/fusiontables/v2", "fusiontables_v2.Fusiontables")
@js.native
class Fusiontables protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var column: Resource$Column = js.native
  var context: APIRequestContext = js.native
  var query: Resource$Query = js.native
  var style: Resource$Style = js.native
  var table: Resource$Table = js.native
  var task: Resource$Task = js.native
  var template: Resource$Template = js.native
}

