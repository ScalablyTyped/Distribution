package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Search API
  *
  * Cloud Search provides cloud-based search capabilities over G Suite data.
  * The Cloud Search API allows indexing of non-G Suite data into Cloud Search.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudsearch = google.cloudsearch('v1');
  *
  * @namespace cloudsearch
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Cloudsearch
  */
@JSImport("googleapis/build/src/apis/cloudsearch/v1", "cloudsearch_v1.Cloudsearch")
@js.native
class Cloudsearch protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var debug: ResourceDebug = js.native
  var indexing: ResourceIndexing = js.native
  var media: ResourceMedia = js.native
  var operations: ResourceOperations = js.native
  var query: ResourceQuery = js.native
  var settings: ResourceSettings = js.native
  var stats: ResourceStats = js.native
}

