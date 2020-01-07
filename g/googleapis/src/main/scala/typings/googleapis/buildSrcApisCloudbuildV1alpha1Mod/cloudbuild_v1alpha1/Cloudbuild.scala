package typings.googleapis.buildSrcApisCloudbuildV1alpha1Mod.cloudbuild_v1alpha1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Build API
  *
  * Creates and manages builds on Google Cloud Platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudbuild = google.cloudbuild('v1alpha1');
  *
  * @namespace cloudbuild
  * @type {Function}
  * @version v1alpha1
  * @variation v1alpha1
  * @param {object=} options Options for Cloudbuild
  */
@JSImport("googleapis/build/src/apis/cloudbuild/v1alpha1", "cloudbuild_v1alpha1.Cloudbuild")
@js.native
class Cloudbuild protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var projects: Resource$Projects = js.native
}

