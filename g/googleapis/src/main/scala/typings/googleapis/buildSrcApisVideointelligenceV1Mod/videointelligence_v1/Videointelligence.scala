package typings.googleapis.buildSrcApisVideointelligenceV1Mod.videointelligence_v1

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
  * const videointelligence = google.videointelligence('v1');
  *
  * @namespace videointelligence
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Videointelligence
  */
@JSImport("googleapis/build/src/apis/videointelligence/v1", "videointelligence_v1.Videointelligence")
@js.native
class Videointelligence protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var operations: Resource$Operations = js.native
  var videos: Resource$Videos = js.native
}

