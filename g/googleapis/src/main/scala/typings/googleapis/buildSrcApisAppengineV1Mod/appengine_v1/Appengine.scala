package typings.googleapis.buildSrcApisAppengineV1Mod.appengine_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * App Engine Admin API
  *
  * Provisions and manages developers&#39; App Engine applications.
  *
  * @example
  * const {google} = require('googleapis');
  * const appengine = google.appengine('v1');
  *
  * @namespace appengine
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Appengine
  */
@JSImport("googleapis/build/src/apis/appengine/v1", "appengine_v1.Appengine")
@js.native
class Appengine protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var apps: Resource$Apps = js.native
  var context: APIRequestContext = js.native
}

