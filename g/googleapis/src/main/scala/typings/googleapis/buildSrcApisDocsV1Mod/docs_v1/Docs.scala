package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Docs API
  *
  * Reads and writes Google Docs documents.
  *
  * @example
  * const {google} = require('googleapis');
  * const docs = google.docs('v1');
  *
  * @namespace docs
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Docs
  */
@JSImport("googleapis/build/src/apis/docs/v1", "docs_v1.Docs")
@js.native
class Docs protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var documents: Resource$Documents = js.native
}

