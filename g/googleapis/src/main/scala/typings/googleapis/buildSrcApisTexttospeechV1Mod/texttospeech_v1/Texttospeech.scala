package typings.googleapis.buildSrcApisTexttospeechV1Mod.texttospeech_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Text-to-Speech API
  *
  * Synthesizes natural-sounding speech by applying powerful neural network
  * models.
  *
  * @example
  * const {google} = require('googleapis');
  * const texttospeech = google.texttospeech('v1');
  *
  * @namespace texttospeech
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Texttospeech
  */
@JSImport("googleapis/build/src/apis/texttospeech/v1", "texttospeech_v1.Texttospeech")
@js.native
class Texttospeech protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var text: Resource$Text = js.native
  var voices: Resource$Voices = js.native
}

