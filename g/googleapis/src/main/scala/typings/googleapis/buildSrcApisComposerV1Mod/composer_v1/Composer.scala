package typings.googleapis.buildSrcApisComposerV1Mod.composer_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Composer API
  *
  * Manages Apache Airflow environments on Google Cloud Platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const composer = google.composer('v1');
  *
  * @namespace composer
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Composer
  */
@JSImport("googleapis/build/src/apis/composer/v1", "composer_v1.Composer")
@js.native
class Composer protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var projects: Resource$Projects = js.native
}

