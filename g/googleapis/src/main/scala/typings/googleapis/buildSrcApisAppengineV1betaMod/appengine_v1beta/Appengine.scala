package typings.googleapis.buildSrcApisAppengineV1betaMod.appengine_v1beta

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
  * const appengine = google.appengine('v1beta');
  *
  * @namespace appengine
  * @type {Function}
  * @version v1beta
  * @variation v1beta
  * @param {object=} options Options for Appengine
  */
@JSImport("googleapis/build/src/apis/appengine/v1beta", "appengine_v1beta.Appengine")
@js.native
class Appengine protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var apps: Resource$Apps = js.native
  var context: APIRequestContext = js.native
}

