package typings.googleapis.buildSrcApisCloudidentityV1beta1Mod.cloudidentity_v1beta1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Identity API
  *
  * API for provisioning and managing identity resources.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudidentity = google.cloudidentity('v1beta1');
  *
  * @namespace cloudidentity
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Cloudidentity
  */
@JSImport("googleapis/build/src/apis/cloudidentity/v1beta1", "cloudidentity_v1beta1.Cloudidentity")
@js.native
class Cloudidentity protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var groups: Resource$Groups = js.native
}

