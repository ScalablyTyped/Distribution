package typings.googleapis.buildSrcApisSurveysV2Mod.surveys_v2

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Surveys API
  *
  * Creates and conducts surveys, lists the surveys that an authenticated user
  * owns, and retrieves survey results and information about specified surveys.
  *
  * @example
  * const {google} = require('googleapis');
  * const surveys = google.surveys('v2');
  *
  * @namespace surveys
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Surveys
  */
@JSImport("googleapis/build/src/apis/surveys/v2", "surveys_v2.Surveys")
@js.native
class Surveys protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var results: Resource$Results = js.native
  var surveys: Resource$Surveys = js.native
}

