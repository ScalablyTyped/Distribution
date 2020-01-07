package typings.googleapis.buildSrcApisFusiontablesV1Mod.fusiontables_v1

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
  * const fusiontables = google.fusiontables('v1');
  *
  * @namespace fusiontables
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Fusiontables
  */
@JSImport("googleapis/build/src/apis/fusiontables/v1", "fusiontables_v1.Fusiontables")
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

