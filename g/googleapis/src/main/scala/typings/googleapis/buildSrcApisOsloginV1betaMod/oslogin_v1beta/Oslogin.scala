package typings.googleapis.buildSrcApisOsloginV1betaMod.oslogin_v1beta

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud OS Login API
  *
  * Manages OS login configuration for Google account users.
  *
  * @example
  * const {google} = require('googleapis');
  * const oslogin = google.oslogin('v1beta');
  *
  * @namespace oslogin
  * @type {Function}
  * @version v1beta
  * @variation v1beta
  * @param {object=} options Options for Oslogin
  */
@JSImport("googleapis/build/src/apis/oslogin/v1beta", "oslogin_v1beta.Oslogin")
@js.native
class Oslogin protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var users: Resource$Users = js.native
}

