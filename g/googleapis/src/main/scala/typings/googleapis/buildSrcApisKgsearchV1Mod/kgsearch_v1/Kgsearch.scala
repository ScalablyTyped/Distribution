package typings.googleapis.buildSrcApisKgsearchV1Mod.kgsearch_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Knowledge Graph Search API
  *
  * Searches the Google Knowledge Graph for entities.
  *
  * @example
  * const {google} = require('googleapis');
  * const kgsearch = google.kgsearch('v1');
  *
  * @namespace kgsearch
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Kgsearch
  */
@JSImport("googleapis/build/src/apis/kgsearch/v1", "kgsearch_v1.Kgsearch")
@js.native
class Kgsearch protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var entities: Resource$Entities = js.native
}

