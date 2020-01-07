package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dialogflow API
  *
  * Builds conversational interfaces (for example, chatbots, and voice-powered
  * apps and devices).
  *
  * @example
  * const {google} = require('googleapis');
  * const dialogflow = google.dialogflow('v2beta1');
  *
  * @namespace dialogflow
  * @type {Function}
  * @version v2beta1
  * @variation v2beta1
  * @param {object=} options Options for Dialogflow
  */
@JSImport("googleapis/build/src/apis/dialogflow/v2beta1", "dialogflow_v2beta1.Dialogflow")
@js.native
class Dialogflow protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var projects: Resource$Projects = js.native
}

