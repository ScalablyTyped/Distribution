package typings.googleapis.buildSrcApisTranslateV2Mod.translate_v2

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Cloud Translation API
  *
  * The Google Cloud Translation API lets websites and programs integrate with
  * Google Translate programmatically.
  *
  * @example
  * const {google} = require('googleapis');
  * const translate = google.translate('v2');
  *
  * @namespace translate
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Translate
  */
@JSImport("googleapis/build/src/apis/translate/v2", "translate_v2.Translate")
@js.native
class Translate protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var detections: Resource$Detections = js.native
  var languages: Resource$Languages = js.native
  var translations: Resource$Translations = js.native
}

