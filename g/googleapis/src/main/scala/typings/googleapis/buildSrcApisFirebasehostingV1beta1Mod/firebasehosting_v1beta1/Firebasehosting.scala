package typings.googleapis.buildSrcApisFirebasehostingV1beta1Mod.firebasehosting_v1beta1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Firebase Hosting API
  *
  * The Firebase Hosting REST API enables programmatic and customizable
  * deployments to your Firebase-hosted sites. Use this REST API to deploy new
  * or updated hosting configurations and content files.
  *
  * @example
  * const {google} = require('googleapis');
  * const firebasehosting = google.firebasehosting('v1beta1');
  *
  * @namespace firebasehosting
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Firebasehosting
  */
@JSImport("googleapis/build/src/apis/firebasehosting/v1beta1", "firebasehosting_v1beta1.Firebasehosting")
@js.native
class Firebasehosting protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var sites: Resource$Sites = js.native
}

