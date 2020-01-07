package typings.googleapis.buildSrcApisVideointelligenceV1beta2Mod.videointelligence_v1beta2

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Video Intelligence API
  *
  * Detects objects, explicit content, and scene changes in videos. It also
  * specifies the region for annotation and transcribes speech to text.
  * Supports both asynchronous API and streaming API.
  *
  * @example
  * const {google} = require('googleapis');
  * const videointelligence = google.videointelligence('v1beta2');
  *
  * @namespace videointelligence
  * @type {Function}
  * @version v1beta2
  * @variation v1beta2
  * @param {object=} options Options for Videointelligence
  */
@JSImport("googleapis/build/src/apis/videointelligence/v1beta2", "videointelligence_v1beta2.Videointelligence")
@js.native
class Videointelligence protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var videos: Resource$Videos = js.native
}

