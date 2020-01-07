package typings.googleapis.buildSrcApisLanguageV1Mod.language_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Natural Language API
  *
  * Provides natural language understanding technologies, such as sentiment
  * analysis, entity recognition, entity sentiment analysis, and other text
  * annotations, to developers.
  *
  * @example
  * const {google} = require('googleapis');
  * const language = google.language('v1');
  *
  * @namespace language
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Language
  */
@JSImport("googleapis/build/src/apis/language/v1", "language_v1.Language")
@js.native
class Language protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var documents: Resource$Documents = js.native
}

